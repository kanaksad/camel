/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.camel.dsl.jbang.core.commands.kamelet;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.stream.Collectors;

import com.github.freva.asciitable.AsciiTable;
import com.github.freva.asciitable.Column;
import com.github.freva.asciitable.HorizontalAlign;
import org.apache.camel.dsl.jbang.core.commands.CamelCommand;
import org.apache.camel.dsl.jbang.core.commands.CamelJBangMain;
import org.apache.camel.main.download.DependencyDownloaderClassLoader;
import org.apache.camel.main.download.MavenDependencyDownloader;
import org.apache.camel.support.ObjectHelper;
import org.apache.camel.util.StringHelper;
import picocli.CommandLine;

@CommandLine.Command(name = "kamelet", aliases = { "kamelet", "kamelets" },
                     description = "List Kamelets from the Kamelet Catalog")
public class CatalogKamelet extends CamelCommand {

    @CommandLine.Option(names = { "--sort" },
                        description = "Sort by name, type, level, or description", defaultValue = "name")
    String sort;

    @CommandLine.Option(names = { "--type", "--filter-type" },
                        description = "Filter by type: source, sink, or action")
    String filterType;

    @CommandLine.Option(names = { "--filter" },
                        description = "Filter by name or description")
    String filterName;

    @CommandLine.Option(names = {
            "--kamelets-version" }, description = "Apache Camel Kamelets version", defaultValue = "0.9.0")
    String kameletsVersion;

    public CatalogKamelet(CamelJBangMain main) {
        super(main);
    }

    @Override
    public Integer call() throws Exception {
        List<Row> rows = new ArrayList<>();

        Map<String, Object> kamelets;
        try {
            ClassLoader cl = createClassLoader();
            MavenDependencyDownloader downloader = new MavenDependencyDownloader();
            downloader.setClassLoader(cl);
            downloader.start();
            downloader.downloadDependency("org.apache.camel.kamelets", "camel-kamelets-catalog", kameletsVersion);

            Thread.currentThread().setContextClassLoader(cl);
            Class<?> clazz = cl.loadClass("org.apache.camel.kamelets.catalog.KameletsCatalog");
            Object catalog = clazz.getDeclaredConstructor().newInstance();
            Method m = clazz.getMethod("getKamelets");
            kamelets = (Map<String, Object>) ObjectHelper.invokeMethod(m, catalog);
        } catch (Exception e) {
            System.err.println("Cannot download camel-kamelets-catalog due to " + e.getMessage());
            return 1;
        }

        for (Object o : kamelets.values()) {
            Row row = new Row();
            row.name = getName(o);
            row.type = getType(o);
            row.level = getLevel(o);
            row.description = getDescription(o);
            rows.add(row);
        }

        if (filterType != null) {
            rows = rows.stream().filter(r -> r.type.equalsIgnoreCase(filterType)).collect(Collectors.toList());
        }
        if (filterName != null) {
            filterName = filterName.toLowerCase(Locale.ROOT);
            rows = rows.stream().filter(
                    r -> r.name.equalsIgnoreCase(filterName) || r.description.toLowerCase(Locale.ROOT).contains(filterName))
                    .collect(Collectors.toList());
        }

        // sort rows
        rows.sort(this::sortRow);

        if (!rows.isEmpty()) {
            System.out.println(AsciiTable.getTable(AsciiTable.NO_BORDERS, rows, Arrays.asList(
                    new Column().header("NAME").dataAlign(HorizontalAlign.LEFT).with(r -> r.name),
                    new Column().header("TYPE").dataAlign(HorizontalAlign.LEFT).with(r -> r.type),
                    new Column().header("LEVEL").dataAlign(HorizontalAlign.LEFT).with(r -> r.level),
                    new Column().header("DESCRIPTION").dataAlign(HorizontalAlign.LEFT).with(this::getDescription))));
        }

        return 0;
    }

    protected int sortRow(Row o1, Row o2) {
        String s = sort;
        int negate = 1;
        if (s.startsWith("-")) {
            s = s.substring(1);
            negate = -1;
        }
        switch (s) {
            case "name":
                return o1.name.compareToIgnoreCase(o2.name) * negate;
            case "type":
                return o1.type.compareToIgnoreCase(o2.type) * negate;
            case "level":
                return o1.level.compareToIgnoreCase(o2.level) * negate;
            case "description":
                return o1.description.compareToIgnoreCase(o2.description) * negate;
            default:
                return 0;
        }
    }

    private ClassLoader createClassLoader() {
        ClassLoader parentCL = CatalogKamelet.class.getClassLoader();
        return new DependencyDownloaderClassLoader(parentCL);
    }

    private String getName(Object kamelet) throws Exception {
        Method m = kamelet.getClass().getMethod("getMetadata");
        Object meta = ObjectHelper.invokeMethod(m, kamelet);
        m = meta.getClass().getMethod("getName");
        return (String) ObjectHelper.invokeMethod(m, meta);
    }

    private String getType(Object kamelet) throws Exception {
        Method m = kamelet.getClass().getMethod("getMetadata");
        Object meta = ObjectHelper.invokeMethod(m, kamelet);
        m = meta.getClass().getMethod("getLabels");
        Map labels = (Map) ObjectHelper.invokeMethod(m, meta);
        if (labels != null) {
            return (String) labels.get("camel.apache.org/kamelet.type");
        }
        return null;
    }

    private String getLevel(Object kamelet) throws Exception {
        Method m = kamelet.getClass().getMethod("getMetadata");
        Object meta = ObjectHelper.invokeMethod(m, kamelet);
        m = meta.getClass().getMethod("getAnnotations");
        Map anns = (Map) ObjectHelper.invokeMethod(m, meta);
        if (anns != null) {
            return (String) anns.get("camel.apache.org/kamelet.support.level");
        }
        return null;
    }

    private String getDescription(Object kamelet) throws Exception {
        Method m = kamelet.getClass().getMethod("getSpec");
        Object spec = ObjectHelper.invokeMethod(m, kamelet);
        m = spec.getClass().getMethod("getDefinition");
        Object def = ObjectHelper.invokeMethod(m, spec);
        m = def.getClass().getMethod("getDescription");
        return (String) ObjectHelper.invokeMethod(m, def);
    }

    private static class Row {
        private String name;
        private String type;
        private String level;
        private String description;
    }

    private String getDescription(Row r) {
        String d = r.description;
        if (d != null && d.contains(".")) {
            // grab first sentence
            d = StringHelper.before(d, ".");
            d = d.trim();
        }
        if (d != null && d.contains("\n")) {
            // grab first sentence
            d = StringHelper.before(d, "\n");
            d = d.trim();
        }
        if (d == null) {
            d = "";
        }
        return d;
    }

}