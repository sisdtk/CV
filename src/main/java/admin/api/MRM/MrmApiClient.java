/*
 * DSE REST INTERNAL API
 * <h2>DSE REST INTERNAL API</h1>
 *
 * The version of the OpenAPI document: 1.0.0-SNAPSHOT
 *
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package admin.api.MRM;

import admin.api.MRM.externalAPI.api.DseObjectTypeAdminRestServiceV1Api;
import admin.api.MRM.externalAPI.api.JobRestServiceV1Api;
import admin.config.AbstractREST;
import io.restassured.builder.RequestSpecBuilder;
import admin.api.MRM.externalAPI.api.WorkflowTypeServiceApi;

import java.util.function.Supplier;

public class MrmApiClient extends AbstractREST {
    private Config config;

    public MrmApiClient() {
    }

    public MrmApiClient(Config config) {
        this.config = config;
    }

    public static MrmApiClient api(Config config) {
        return new MrmApiClient(config);
    }

    public DseObjectTypeAdminRestServiceV1Api dseObjectTypeAdminRestServiceV1() {
        return DseObjectTypeAdminRestServiceV1Api.dseObjectTypeAdminRestServiceV1(config.reqSpecSupplier);
    }

    public JobRestServiceV1Api jobRestServiceV1() {
        return JobRestServiceV1Api.jobRestServiceV1(config.reqSpecSupplier);
    }

    public WorkflowTypeServiceApi workflowTypeService() {
        return WorkflowTypeServiceApi.workflowTypeService(config.reqSpecSupplier);
    }

    public Config getConfig() {
        return config;
    }

    public static class Config {
        private Supplier<RequestSpecBuilder> reqSpecSupplier;

        public Config reqSpecSupplier(Supplier<RequestSpecBuilder> supplier) {
            reqSpecSupplier = supplier;
            return this;
        }

        public static Config apiConfig() {
            return new Config();
        }

        public Supplier<RequestSpecBuilder> getReqSpecSupplier() {
            return reqSpecSupplier;
        }
    }
}