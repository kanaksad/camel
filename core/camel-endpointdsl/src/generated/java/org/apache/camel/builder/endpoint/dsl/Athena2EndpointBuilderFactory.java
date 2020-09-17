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
package org.apache.camel.builder.endpoint.dsl;

import javax.annotation.Generated;
import org.apache.camel.builder.EndpointConsumerBuilder;
import org.apache.camel.builder.EndpointProducerBuilder;
import org.apache.camel.builder.endpoint.AbstractEndpointBuilder;

/**
 * Access AWS Athena service using AWS SDK version 2.x.
 * 
 * Generated by camel build tools - do NOT edit this file!
 */
@Generated("org.apache.camel.maven.packaging.EndpointDslMojo")
public interface Athena2EndpointBuilderFactory {


    /**
     * Builder for endpoint for the AWS 2 Athena component.
     */
    public interface Athena2EndpointBuilder extends EndpointProducerBuilder {
        default AdvancedAthena2EndpointBuilder advanced() {
            return (AdvancedAthena2EndpointBuilder) this;
        }
        /**
         * Setting the autoDiscoverClient mechanism, if true, the component will
         * look for a client instance in the registry automatically otherwise it
         * will skip that checking.
         * 
         * The option is a: <code>boolean</code> type.
         * 
         * Default: true
         * Group: common
         */
        default Athena2EndpointBuilder autoDiscoverClient(
                boolean autoDiscoverClient) {
            doSetProperty("autoDiscoverClient", autoDiscoverClient);
            return this;
        }
        /**
         * Setting the autoDiscoverClient mechanism, if true, the component will
         * look for a client instance in the registry automatically otherwise it
         * will skip that checking.
         * 
         * The option will be converted to a <code>boolean</code> type.
         * 
         * Default: true
         * Group: common
         */
        default Athena2EndpointBuilder autoDiscoverClient(
                String autoDiscoverClient) {
            doSetProperty("autoDiscoverClient", autoDiscoverClient);
            return this;
        }
        /**
         * Amazon AWS Access Key.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: producer
         */
        default Athena2EndpointBuilder accessKey(String accessKey) {
            doSetProperty("accessKey", accessKey);
            return this;
        }
        /**
         * The AmazonAthena instance to use as the client.
         * 
         * The option is a:
         * <code>software.amazon.awssdk.services.athena.AthenaClient</code>
         * type.
         * 
         * Group: producer
         */
        default Athena2EndpointBuilder amazonAthenaClient(
                Object amazonAthenaClient) {
            doSetProperty("amazonAthenaClient", amazonAthenaClient);
            return this;
        }
        /**
         * The AmazonAthena instance to use as the client.
         * 
         * The option will be converted to a
         * <code>software.amazon.awssdk.services.athena.AthenaClient</code>
         * type.
         * 
         * Group: producer
         */
        default Athena2EndpointBuilder amazonAthenaClient(
                String amazonAthenaClient) {
            doSetProperty("amazonAthenaClient", amazonAthenaClient);
            return this;
        }
        /**
         * The Athena database to use.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: producer
         */
        default Athena2EndpointBuilder database(String database) {
            doSetProperty("database", database);
            return this;
        }
        /**
         * Milliseconds before the next poll for query execution status. See the
         * section 'Waiting for Query Completion and Retrying Failed Queries' to
         * learn more.
         * 
         * The option is a: <code>long</code> type.
         * 
         * Default: 2000
         * Group: producer
         */
        default Athena2EndpointBuilder delay(long delay) {
            doSetProperty("delay", delay);
            return this;
        }
        /**
         * Milliseconds before the next poll for query execution status. See the
         * section 'Waiting for Query Completion and Retrying Failed Queries' to
         * learn more.
         * 
         * The option will be converted to a <code>long</code> type.
         * 
         * Default: 2000
         * Group: producer
         */
        default Athena2EndpointBuilder delay(String delay) {
            doSetProperty("delay", delay);
            return this;
        }
        /**
         * The encryption type to use when storing query results in S3. One of
         * SSE_S3, SSE_KMS, or CSE_KMS.
         * 
         * The option is a:
         * <code>software.amazon.awssdk.services.athena.model.EncryptionOption</code> type.
         * 
         * Group: producer
         */
        default Athena2EndpointBuilder encryptionOption(
                EncryptionOption encryptionOption) {
            doSetProperty("encryptionOption", encryptionOption);
            return this;
        }
        /**
         * The encryption type to use when storing query results in S3. One of
         * SSE_S3, SSE_KMS, or CSE_KMS.
         * 
         * The option will be converted to a
         * <code>software.amazon.awssdk.services.athena.model.EncryptionOption</code> type.
         * 
         * Group: producer
         */
        default Athena2EndpointBuilder encryptionOption(String encryptionOption) {
            doSetProperty("encryptionOption", encryptionOption);
            return this;
        }
        /**
         * Include useful trace information at the beginning of queries as an
         * SQL comment (prefixed with --).
         * 
         * The option is a: <code>boolean</code> type.
         * 
         * Default: false
         * Group: producer
         */
        default Athena2EndpointBuilder includeTrace(boolean includeTrace) {
            doSetProperty("includeTrace", includeTrace);
            return this;
        }
        /**
         * Include useful trace information at the beginning of queries as an
         * SQL comment (prefixed with --).
         * 
         * The option will be converted to a <code>boolean</code> type.
         * 
         * Default: false
         * Group: producer
         */
        default Athena2EndpointBuilder includeTrace(String includeTrace) {
            doSetProperty("includeTrace", includeTrace);
            return this;
        }
        /**
         * Milliseconds before the first poll for query execution status. See
         * the section 'Waiting for Query Completion and Retrying Failed
         * Queries' to learn more.
         * 
         * The option is a: <code>long</code> type.
         * 
         * Default: 1000
         * Group: producer
         */
        default Athena2EndpointBuilder initialDelay(long initialDelay) {
            doSetProperty("initialDelay", initialDelay);
            return this;
        }
        /**
         * Milliseconds before the first poll for query execution status. See
         * the section 'Waiting for Query Completion and Retrying Failed
         * Queries' to learn more.
         * 
         * The option will be converted to a <code>long</code> type.
         * 
         * Default: 1000
         * Group: producer
         */
        default Athena2EndpointBuilder initialDelay(String initialDelay) {
            doSetProperty("initialDelay", initialDelay);
            return this;
        }
        /**
         * For SSE-KMS and CSE-KMS, this is the KMS key ARN or ID.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: producer
         */
        default Athena2EndpointBuilder kmsKey(String kmsKey) {
            doSetProperty("kmsKey", kmsKey);
            return this;
        }
        /**
         * Whether the producer should be started lazy (on the first message).
         * By starting lazy you can use this to allow CamelContext and routes to
         * startup in situations where a producer may otherwise fail during
         * starting and cause the route to fail being started. By deferring this
         * startup to be lazy then the startup failure can be handled during
         * routing messages via Camel's routing error handlers. Beware that when
         * the first message is processed then creating and starting the
         * producer may take a little time and prolong the total processing time
         * of the processing.
         * 
         * The option is a: <code>boolean</code> type.
         * 
         * Default: false
         * Group: producer
         */
        default Athena2EndpointBuilder lazyStartProducer(
                boolean lazyStartProducer) {
            doSetProperty("lazyStartProducer", lazyStartProducer);
            return this;
        }
        /**
         * Whether the producer should be started lazy (on the first message).
         * By starting lazy you can use this to allow CamelContext and routes to
         * startup in situations where a producer may otherwise fail during
         * starting and cause the route to fail being started. By deferring this
         * startup to be lazy then the startup failure can be handled during
         * routing messages via Camel's routing error handlers. Beware that when
         * the first message is processed then creating and starting the
         * producer may take a little time and prolong the total processing time
         * of the processing.
         * 
         * The option will be converted to a <code>boolean</code> type.
         * 
         * Default: false
         * Group: producer
         */
        default Athena2EndpointBuilder lazyStartProducer(
                String lazyStartProducer) {
            doSetProperty("lazyStartProducer", lazyStartProducer);
            return this;
        }
        /**
         * Maximum number of times to attempt a query. Set to 1 to disable
         * retries. See the section 'Waiting for Query Completion and Retrying
         * Failed Queries' to learn more.
         * 
         * The option is a: <code>int</code> type.
         * 
         * Default: 1
         * Group: producer
         */
        default Athena2EndpointBuilder maxAttempts(int maxAttempts) {
            doSetProperty("maxAttempts", maxAttempts);
            return this;
        }
        /**
         * Maximum number of times to attempt a query. Set to 1 to disable
         * retries. See the section 'Waiting for Query Completion and Retrying
         * Failed Queries' to learn more.
         * 
         * The option will be converted to a <code>int</code> type.
         * 
         * Default: 1
         * Group: producer
         */
        default Athena2EndpointBuilder maxAttempts(String maxAttempts) {
            doSetProperty("maxAttempts", maxAttempts);
            return this;
        }
        /**
         * Max number of results to return for the given operation (if supported
         * by the Athena API endpoint). If not set, will use the Athena API
         * default for the given operation.
         * 
         * The option is a: <code>java.lang.Integer</code> type.
         * 
         * Group: producer
         */
        default Athena2EndpointBuilder maxResults(Integer maxResults) {
            doSetProperty("maxResults", maxResults);
            return this;
        }
        /**
         * Max number of results to return for the given operation (if supported
         * by the Athena API endpoint). If not set, will use the Athena API
         * default for the given operation.
         * 
         * The option will be converted to a <code>java.lang.Integer</code>
         * type.
         * 
         * Group: producer
         */
        default Athena2EndpointBuilder maxResults(String maxResults) {
            doSetProperty("maxResults", maxResults);
            return this;
        }
        /**
         * Pagination token to use in the case where the response from the
         * previous request was truncated.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: producer
         */
        default Athena2EndpointBuilder nextToken(String nextToken) {
            doSetProperty("nextToken", nextToken);
            return this;
        }
        /**
         * The Athena API function to call.
         * 
         * The option is a:
         * <code>org.apache.camel.component.aws2.athena.Athena2Operations</code>
         * type.
         * 
         * Default: start-query-execution
         * Group: producer
         */
        default Athena2EndpointBuilder operation(Athena2Operations operation) {
            doSetProperty("operation", operation);
            return this;
        }
        /**
         * The Athena API function to call.
         * 
         * The option will be converted to a
         * <code>org.apache.camel.component.aws2.athena.Athena2Operations</code>
         * type.
         * 
         * Default: start-query-execution
         * Group: producer
         */
        default Athena2EndpointBuilder operation(String operation) {
            doSetProperty("operation", operation);
            return this;
        }
        /**
         * The location in Amazon S3 where query results are stored, such as
         * s3://path/to/query/bucket/. Ensure this value ends with a forward
         * slash ('/').
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: producer
         */
        default Athena2EndpointBuilder outputLocation(String outputLocation) {
            doSetProperty("outputLocation", outputLocation);
            return this;
        }
        /**
         * How query results should be returned. One of StreamList (default -
         * return a GetQueryResultsIterable that can page through all results),
         * SelectList (returns at most 1,000 rows at a time, plus a NextToken
         * value as a header than can be used for manual pagination of results),
         * S3Pointer (return an S3 path pointing to the results).
         * 
         * The option is a:
         * <code>org.apache.camel.component.aws2.athena.Athena2OutputType</code>
         * type.
         * 
         * Default: stream-list
         * Group: producer
         */
        default Athena2EndpointBuilder outputType(Athena2OutputType outputType) {
            doSetProperty("outputType", outputType);
            return this;
        }
        /**
         * How query results should be returned. One of StreamList (default -
         * return a GetQueryResultsIterable that can page through all results),
         * SelectList (returns at most 1,000 rows at a time, plus a NextToken
         * value as a header than can be used for manual pagination of results),
         * S3Pointer (return an S3 path pointing to the results).
         * 
         * The option will be converted to a
         * <code>org.apache.camel.component.aws2.athena.Athena2OutputType</code>
         * type.
         * 
         * Default: stream-list
         * Group: producer
         */
        default Athena2EndpointBuilder outputType(String outputType) {
            doSetProperty("outputType", outputType);
            return this;
        }
        /**
         * To define a proxy host when instantiating the Athena client.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: producer
         */
        default Athena2EndpointBuilder proxyHost(String proxyHost) {
            doSetProperty("proxyHost", proxyHost);
            return this;
        }
        /**
         * To define a proxy port when instantiating the Athena client.
         * 
         * The option is a: <code>java.lang.Integer</code> type.
         * 
         * Group: producer
         */
        default Athena2EndpointBuilder proxyPort(Integer proxyPort) {
            doSetProperty("proxyPort", proxyPort);
            return this;
        }
        /**
         * To define a proxy port when instantiating the Athena client.
         * 
         * The option will be converted to a <code>java.lang.Integer</code>
         * type.
         * 
         * Group: producer
         */
        default Athena2EndpointBuilder proxyPort(String proxyPort) {
            doSetProperty("proxyPort", proxyPort);
            return this;
        }
        /**
         * To define a proxy protocol when instantiating the Athena client.
         * 
         * The option is a: <code>software.amazon.awssdk.core.Protocol</code>
         * type.
         * 
         * Default: HTTPS
         * Group: producer
         */
        default Athena2EndpointBuilder proxyProtocol(Protocol proxyProtocol) {
            doSetProperty("proxyProtocol", proxyProtocol);
            return this;
        }
        /**
         * To define a proxy protocol when instantiating the Athena client.
         * 
         * The option will be converted to a
         * <code>software.amazon.awssdk.core.Protocol</code> type.
         * 
         * Default: HTTPS
         * Group: producer
         */
        default Athena2EndpointBuilder proxyProtocol(String proxyProtocol) {
            doSetProperty("proxyProtocol", proxyProtocol);
            return this;
        }
        /**
         * The unique ID identifying the query execution.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: producer
         */
        default Athena2EndpointBuilder queryExecutionId(String queryExecutionId) {
            doSetProperty("queryExecutionId", queryExecutionId);
            return this;
        }
        /**
         * The SQL query to run. Except for simple queries, prefer setting this
         * as the body of the Exchange or as a header using
         * Athena2Constants.QUERY_STRING to avoid having to deal with URL
         * encoding issues.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: producer
         */
        default Athena2EndpointBuilder queryString(String queryString) {
            doSetProperty("queryString", queryString);
            return this;
        }
        /**
         * The region in which Athena client needs to work. When using this
         * parameter, the configuration will expect the lowercase name of the
         * region (for example ap-east-1). You'll need to use the name
         * Region.EU_WEST_1.id().
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: producer
         */
        default Athena2EndpointBuilder region(String region) {
            doSetProperty("region", region);
            return this;
        }
        /**
         * Reset the waitTimeout countdown in the event of a query retry. If set
         * to true, potential max time spent waiting for queries is equal to
         * waitTimeout x maxAttempts. See the section 'Waiting for Query
         * Completion and Retrying Failed Queries' to learn more.
         * 
         * The option is a: <code>boolean</code> type.
         * 
         * Default: true
         * Group: producer
         */
        default Athena2EndpointBuilder resetWaitTimeoutOnRetry(
                boolean resetWaitTimeoutOnRetry) {
            doSetProperty("resetWaitTimeoutOnRetry", resetWaitTimeoutOnRetry);
            return this;
        }
        /**
         * Reset the waitTimeout countdown in the event of a query retry. If set
         * to true, potential max time spent waiting for queries is equal to
         * waitTimeout x maxAttempts. See the section 'Waiting for Query
         * Completion and Retrying Failed Queries' to learn more.
         * 
         * The option will be converted to a <code>boolean</code> type.
         * 
         * Default: true
         * Group: producer
         */
        default Athena2EndpointBuilder resetWaitTimeoutOnRetry(
                String resetWaitTimeoutOnRetry) {
            doSetProperty("resetWaitTimeoutOnRetry", resetWaitTimeoutOnRetry);
            return this;
        }
        /**
         * Optional comma separated list of error types to retry the query for.
         * Use 'retryable' to retry all retryable failure conditions (e.g.
         * generic errors and resources exhausted), 'generic' to retry
         * 'GENERIC_INTERNAL_ERROR' failures, 'exhausted' to retry queries that
         * have exhausted resource limits, 'always' to always retry regardless
         * of failure condition, or 'never' or null to never retry (default).
         * See the section 'Waiting for Query Completion and Retrying Failed
         * Queries' to learn more.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Default: never
         * Group: producer
         */
        default Athena2EndpointBuilder retry(String retry) {
            doSetProperty("retry", retry);
            return this;
        }
        /**
         * Amazon AWS Secret Key.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: producer
         */
        default Athena2EndpointBuilder secretKey(String secretKey) {
            doSetProperty("secretKey", secretKey);
            return this;
        }
        /**
         * Optional max wait time in millis to wait for a successful query
         * completion. See the section 'Waiting for Query Completion and
         * Retrying Failed Queries' to learn more.
         * 
         * The option is a: <code>long</code> type.
         * 
         * Default: 0
         * Group: producer
         */
        default Athena2EndpointBuilder waitTimeout(long waitTimeout) {
            doSetProperty("waitTimeout", waitTimeout);
            return this;
        }
        /**
         * Optional max wait time in millis to wait for a successful query
         * completion. See the section 'Waiting for Query Completion and
         * Retrying Failed Queries' to learn more.
         * 
         * The option will be converted to a <code>long</code> type.
         * 
         * Default: 0
         * Group: producer
         */
        default Athena2EndpointBuilder waitTimeout(String waitTimeout) {
            doSetProperty("waitTimeout", waitTimeout);
            return this;
        }
        /**
         * The workgroup to use for running the query.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: producer
         */
        default Athena2EndpointBuilder workGroup(String workGroup) {
            doSetProperty("workGroup", workGroup);
            return this;
        }
    }

    /**
     * Advanced builder for endpoint for the AWS 2 Athena component.
     */
    public interface AdvancedAthena2EndpointBuilder
            extends
                EndpointProducerBuilder {
        default Athena2EndpointBuilder basic() {
            return (Athena2EndpointBuilder) this;
        }
        /**
         * Whether the endpoint should use basic property binding (Camel 2.x) or
         * the newer property binding with additional capabilities.
         * 
         * The option is a: <code>boolean</code> type.
         * 
         * Default: false
         * Group: advanced
         */
        default AdvancedAthena2EndpointBuilder basicPropertyBinding(
                boolean basicPropertyBinding) {
            doSetProperty("basicPropertyBinding", basicPropertyBinding);
            return this;
        }
        /**
         * Whether the endpoint should use basic property binding (Camel 2.x) or
         * the newer property binding with additional capabilities.
         * 
         * The option will be converted to a <code>boolean</code> type.
         * 
         * Default: false
         * Group: advanced
         */
        default AdvancedAthena2EndpointBuilder basicPropertyBinding(
                String basicPropertyBinding) {
            doSetProperty("basicPropertyBinding", basicPropertyBinding);
            return this;
        }
        /**
         * A unique string to ensure issues queries are idempotent. It is
         * unlikely you will need to set this.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: advanced
         */
        default AdvancedAthena2EndpointBuilder clientRequestToken(
                String clientRequestToken) {
            doSetProperty("clientRequestToken", clientRequestToken);
            return this;
        }
        /**
         * Sets whether synchronous processing should be strictly used, or Camel
         * is allowed to use asynchronous processing (if supported).
         * 
         * The option is a: <code>boolean</code> type.
         * 
         * Default: false
         * Group: advanced
         */
        default AdvancedAthena2EndpointBuilder synchronous(boolean synchronous) {
            doSetProperty("synchronous", synchronous);
            return this;
        }
        /**
         * Sets whether synchronous processing should be strictly used, or Camel
         * is allowed to use asynchronous processing (if supported).
         * 
         * The option will be converted to a <code>boolean</code> type.
         * 
         * Default: false
         * Group: advanced
         */
        default AdvancedAthena2EndpointBuilder synchronous(String synchronous) {
            doSetProperty("synchronous", synchronous);
            return this;
        }
    }

    /**
     * Proxy enum for
     * <code>software.amazon.awssdk.services.athena.model.EncryptionOption</code> enum.
     */
    enum EncryptionOption {
        SSE_S3,
        SSE_KMS,
        CSE_KMS,
        UNKNOWN_TO_SDK_VERSION;
    }

    /**
     * Proxy enum for
     * <code>org.apache.camel.component.aws2.athena.Athena2Operations</code>
     * enum.
     */
    enum Athena2Operations {
        getQueryExecution,
        getQueryResults,
        listQueryExecutions,
        startQueryExecution;
    }

    /**
     * Proxy enum for
     * <code>org.apache.camel.component.aws2.athena.Athena2OutputType</code>
     * enum.
     */
    enum Athena2OutputType {
        StreamList,
        SelectList,
        S3Pointer;
    }

    /**
     * Proxy enum for <code>software.amazon.awssdk.core.Protocol</code> enum.
     */
    enum Protocol {
        HTTP,
        HTTPS;
    }

    public interface Athena2Builders {
        /**
         * AWS 2 Athena (camel-aws2-athena)
         * Access AWS Athena service using AWS SDK version 2.x.
         * 
         * Category: cloud,database
         * Since: 3.4
         * Maven coordinates: org.apache.camel:camel-aws2-athena
         * 
         * Syntax: <code>aws2-athena:label</code>
         * 
         * Path parameter: label (required)
         * Logical name
         * 
         * @param path label
         */
        default Athena2EndpointBuilder aws2Athena(String path) {
            return Athena2EndpointBuilderFactory.endpointBuilder("aws2-athena", path);
        }
        /**
         * AWS 2 Athena (camel-aws2-athena)
         * Access AWS Athena service using AWS SDK version 2.x.
         * 
         * Category: cloud,database
         * Since: 3.4
         * Maven coordinates: org.apache.camel:camel-aws2-athena
         * 
         * Syntax: <code>aws2-athena:label</code>
         * 
         * Path parameter: label (required)
         * Logical name
         * 
         * @param componentName to use a custom component name for the endpoint
         * instead of the default name
         * @param path label
         */
        default Athena2EndpointBuilder aws2Athena(
                String componentName,
                String path) {
            return Athena2EndpointBuilderFactory.endpointBuilder(componentName, path);
        }
    }
    static Athena2EndpointBuilder endpointBuilder(
            String componentName,
            String path) {
        class Athena2EndpointBuilderImpl extends AbstractEndpointBuilder implements Athena2EndpointBuilder, AdvancedAthena2EndpointBuilder {
            public Athena2EndpointBuilderImpl(String path) {
                super(componentName, path);
            }
        }
        return new Athena2EndpointBuilderImpl(path);
    }
}