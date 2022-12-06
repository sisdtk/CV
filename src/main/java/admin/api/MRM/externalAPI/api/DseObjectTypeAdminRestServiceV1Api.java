
package admin.api.MRM.externalAPI.api;

import com.google.gson.reflect.TypeToken;
import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import admin.api.MRM.externalAPI.model.DseObjectTypeAdminDto;
import admin.api.MRM.externalAPI.model.DseObjectTypeAdminMinDto;
import admin.api.MRM.externalAPI.model.DseObjectTypeCopyParam;
import admin.api.Oper;

import java.lang.reflect.Type;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

import static io.restassured.http.Method.*;

public class DseObjectTypeAdminRestServiceV1Api {

    private Supplier<RequestSpecBuilder> reqSpecSupplier;
    private Consumer<RequestSpecBuilder> reqSpecCustomizer;

    public DseObjectTypeAdminRestServiceV1Api(Supplier<RequestSpecBuilder> reqSpecSupplier) {
        this.reqSpecSupplier = reqSpecSupplier;
    }

    public static DseObjectTypeAdminRestServiceV1Api dseObjectTypeAdminRestServiceV1(Supplier<RequestSpecBuilder> reqSpecSupplier) {
        return new DseObjectTypeAdminRestServiceV1Api(reqSpecSupplier);
    }

    private RequestSpecBuilder createReqSpec() {
        RequestSpecBuilder reqSpec = reqSpecSupplier.get();
        if (reqSpecCustomizer != null) {
            reqSpecCustomizer.accept(reqSpec);
        }
        return reqSpec;
    }

    public List<Oper> getAllOperations() {
        return Arrays.asList(
                dseObjectTypeAdminRestServiceV1DELETERemoveDseObjectType(),
                dseObjectTypeAdminRestServiceV1GETGetAllDseObjectTypes(),
                dseObjectTypeAdminRestServiceV1GETGetDseObjectType(),
                dseObjectTypeAdminRestServiceV1GETGetDseSubObjectTypes(),
                dseObjectTypeAdminRestServiceV1GETGetParentDseObjectTypeOptions(),
                dseObjectTypeAdminRestServiceV1GETGetValidationResults(),
                dseObjectTypeAdminRestServiceV1POSTCopyDseObjectType(),
                dseObjectTypeAdminRestServiceV1POSTCreateDseObjectType(),
                dseObjectTypeAdminRestServiceV1POSTModifyObjectType()
        );
    }

    @ApiOperation(value = "",
            notes = "Delete object type  __Security Roles Allowed:__ PIMEDIA_ORGANISATION_MANAGE_TYPES",
            nickname = "dseObjectTypeAdminRestServiceV1DELETERemoveDseObjectType",
            tags = {"DseObjectTypeAdminRestServiceV1"})
    @ApiResponses(value = {
            @ApiResponse(code = 204, message = "success")})
    public DseObjectTypeAdminRestServiceV1DELETERemoveDseObjectTypeOper dseObjectTypeAdminRestServiceV1DELETERemoveDseObjectType() {
        return new DseObjectTypeAdminRestServiceV1DELETERemoveDseObjectTypeOper(createReqSpec());
    }

    @ApiOperation(value = "",
            notes = "Returns all dse object types, including newly created ones that haven't been published yet  __Security Roles Allowed:__ PIMEDIA_ORGANISATION_MANAGE_TYPES",
            nickname = "dseObjectTypeAdminRestServiceV1GETGetAllDseObjectTypes",
            tags = {"DseObjectTypeAdminRestServiceV1"})
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Array of dseObjectTypes")})
    public DseObjectTypeAdminRestServiceV1GETGetAllDseObjectTypesOper dseObjectTypeAdminRestServiceV1GETGetAllDseObjectTypes() {
        return new DseObjectTypeAdminRestServiceV1GETGetAllDseObjectTypesOper(createReqSpec());
    }

    @ApiOperation(value = "",
            notes = "Get object type data  __Security Roles Allowed:__ PIMEDIA_ORGANISATION_MANAGE_TYPES",
            nickname = "dseObjectTypeAdminRestServiceV1GETGetDseObjectType",
            tags = {"DseObjectTypeAdminRestServiceV1"})
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "object type data")})
    public DseObjectTypeAdminRestServiceV1GETGetDseObjectTypeOper dseObjectTypeAdminRestServiceV1GETGetDseObjectType() {
        return new DseObjectTypeAdminRestServiceV1GETGetDseObjectTypeOper(createReqSpec());
    }

    @ApiOperation(value = "",
            notes = "  __Security Roles Allowed:__ PIMEDIA_ORGANISATION_MANAGE_TYPES  __SeeAlso:__ DseRunModuleEnum , can be JOB, PROCESS or PRODUCT NOTE: if objectTypeId is provided, inheritance is taken from the object type",
            nickname = "dseObjectTypeAdminRestServiceV1GETGetDseSubObjectTypes",
            tags = {"DseObjectTypeAdminRestServiceV1"})
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "list of sub object types")})
    public DseObjectTypeAdminRestServiceV1GETGetDseSubObjectTypesOper dseObjectTypeAdminRestServiceV1GETGetDseSubObjectTypes() {
        return new DseObjectTypeAdminRestServiceV1GETGetDseSubObjectTypesOper(createReqSpec());
    }

    @ApiOperation(value = "",
            notes = "Get list of object types that can be selected as parent type of new object type with single inheritance  __Security Roles Allowed:__ PIMEDIA_ORGANISATION_MANAGE_TYPES",
            nickname = "dseObjectTypeAdminRestServiceV1GETGetParentDseObjectTypeOptions",
            tags = {"DseObjectTypeAdminRestServiceV1"})
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "list of object types")})
    public DseObjectTypeAdminRestServiceV1GETGetParentDseObjectTypeOptionsOper dseObjectTypeAdminRestServiceV1GETGetParentDseObjectTypeOptions() {
        return new DseObjectTypeAdminRestServiceV1GETGetParentDseObjectTypeOptionsOper(createReqSpec());
    }

    @ApiOperation(value = "",
            notes = "Get object type validation results  __Security Roles Allowed:__ PIMEDIA_ORGANISATION_MANAGE_TYPES",
            nickname = "dseObjectTypeAdminRestServiceV1GETGetValidationResults",
            tags = {"DseObjectTypeAdminRestServiceV1"})
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "object type validation results")})
    public DseObjectTypeAdminRestServiceV1GETGetValidationResultsOper dseObjectTypeAdminRestServiceV1GETGetValidationResults() {
        return new DseObjectTypeAdminRestServiceV1GETGetValidationResultsOper(createReqSpec());
    }

    @ApiOperation(value = "",
            notes = "Create object type as copy of specified one  __Security Roles Allowed:__ PIMEDIA_ORGANISATION_MANAGE_TYPES",
            nickname = "dseObjectTypeAdminRestServiceV1POSTCopyDseObjectType",
            tags = {"DseObjectTypeAdminRestServiceV1"})
    @ApiResponses(value = {
            @ApiResponse(code = 201, message = "object type data")})
    public DseObjectTypeAdminRestServiceV1POSTCopyDseObjectTypeOper dseObjectTypeAdminRestServiceV1POSTCopyDseObjectType() {
        return new DseObjectTypeAdminRestServiceV1POSTCopyDseObjectTypeOper(createReqSpec());
    }

    @ApiOperation(value = "",
            notes = "Create dse object type  __Security Roles Allowed:__ PIMEDIA_ORGANISATION_MANAGE_TYPES",
            nickname = "dseObjectTypeAdminRestServiceV1POSTCreateDseObjectType",
            tags = {"DseObjectTypeAdminRestServiceV1"})
    @ApiResponses(value = {
            @ApiResponse(code = 201, message = "created")})
    public DseObjectTypeAdminRestServiceV1POSTCreateDseObjectTypeOper dseObjectTypeAdminRestServiceV1POSTCreateDseObjectType() {
        return new DseObjectTypeAdminRestServiceV1POSTCreateDseObjectTypeOper(createReqSpec());
    }

    @ApiOperation(value = "",
            notes = "Modifies object type by creating non-existed variable types from request  __Security Roles Allowed:__ PIMEDIA_ORGANISATION_MANAGE_TYPES",
            nickname = "dseObjectTypeAdminRestServiceV1POSTModifyObjectType",
            tags = {"DseObjectTypeAdminRestServiceV1"})
    @ApiResponses(value = {
            @ApiResponse(code = 201, message = "modified object type")})
    public DseObjectTypeAdminRestServiceV1POSTModifyObjectTypeOper dseObjectTypeAdminRestServiceV1POSTModifyObjectType() {
        return new DseObjectTypeAdminRestServiceV1POSTModifyObjectTypeOper(createReqSpec());
    }

    /**
     * Customize request specification
     *
     * @param reqSpecCustomizer consumer to modify the RequestSpecBuilder
     * @return api
     */
    public DseObjectTypeAdminRestServiceV1Api reqSpec(Consumer<RequestSpecBuilder> reqSpecCustomizer) {
        this.reqSpecCustomizer = reqSpecCustomizer;
        return this;
    }

    /**
     * Delete object type  __Security Roles Allowed:__ PIMEDIA_ORGANISATION_MANAGE_TYPES
     *
     * @see #dseObjectTypeIdPath id of object type will be deleted (required)
     */
    public static class DseObjectTypeAdminRestServiceV1DELETERemoveDseObjectTypeOper implements Oper {

        public static final Method REQ_METHOD = DELETE;
        public static final String REQ_URI = "/dse/rest/v1.0/admin/object-types/{dseObjectTypeId}";

        private RequestSpecBuilder reqSpec;
        private ResponseSpecBuilder respSpec;

        public DseObjectTypeAdminRestServiceV1DELETERemoveDseObjectTypeOper(RequestSpecBuilder reqSpec) {
            this.reqSpec = reqSpec;
            reqSpec.setAccept("application/json");
            this.respSpec = new ResponseSpecBuilder();
        }

        /**
         * DELETE /dse/rest/v1.0/admin/object-types/{dseObjectTypeId}
         *
         * @param handler handler
         * @param <T>     type
         * @return type
         */
        @Override
        public <T> T execute(Function<Response, T> handler) {
            return handler.apply(RestAssured.given().spec(reqSpec.build()).expect().spec(respSpec.build()).when().request(REQ_METHOD, REQ_URI));
        }

        public static final String DSE_OBJECT_TYPE_ID_PATH = "dseObjectTypeId";

        /**
         * @param dseObjectTypeId (Integer) id of object type will be deleted (required)
         * @return operation
         */
        public DseObjectTypeAdminRestServiceV1DELETERemoveDseObjectTypeOper dseObjectTypeIdPath(Object dseObjectTypeId) {
            reqSpec.addPathParam(DSE_OBJECT_TYPE_ID_PATH, dseObjectTypeId);
            return this;
        }

        /**
         * Customize request specification
         *
         * @param reqSpecCustomizer consumer to modify the RequestSpecBuilder
         * @return operation
         */
        public DseObjectTypeAdminRestServiceV1DELETERemoveDseObjectTypeOper reqSpec(Consumer<RequestSpecBuilder> reqSpecCustomizer) {
            reqSpecCustomizer.accept(reqSpec);
            return this;
        }

        /**
         * Customize response specification
         *
         * @param respSpecCustomizer consumer to modify the ResponseSpecBuilder
         * @return operation
         */
        public DseObjectTypeAdminRestServiceV1DELETERemoveDseObjectTypeOper respSpec(Consumer<ResponseSpecBuilder> respSpecCustomizer) {
            respSpecCustomizer.accept(respSpec);
            return this;
        }
    }

    /**
     * Returns all dse object types, including newly created ones that haven&#39;t been published yet  __Security Roles Allowed:__ PIMEDIA_ORGANISATION_MANAGE_TYPES
     *
     * @see #onlyBriefingQuery  (optional, default to false)
     * return List&lt;DseObjectTypeAdminMinDto&gt;
     */
    public static class DseObjectTypeAdminRestServiceV1GETGetAllDseObjectTypesOper implements Oper {

        public static final Method REQ_METHOD = GET;
        public static final String REQ_URI = "/dse/rest/v1.0/admin/object-types";

        private RequestSpecBuilder reqSpec;
        private ResponseSpecBuilder respSpec;

        public DseObjectTypeAdminRestServiceV1GETGetAllDseObjectTypesOper(RequestSpecBuilder reqSpec) {
            this.reqSpec = reqSpec;
            reqSpec.setAccept("application/json");
            this.respSpec = new ResponseSpecBuilder();
        }

        /**
         * GET /dse/rest/v1.0/admin/object-types
         *
         * @param handler handler
         * @param <T>     type
         * @return type
         */
        @Override
        public <T> T execute(Function<Response, T> handler) {
            return handler.apply(RestAssured.given().spec(reqSpec.build()).expect().spec(respSpec.build()).when().request(REQ_METHOD, REQ_URI));
        }

        /**
         * GET /dse/rest/v1.0/admin/object-types
         *
         * @param handler handler
         * @return List&lt;DseObjectTypeAdminMinDto&gt;
         */
        public List<DseObjectTypeAdminMinDto> executeAs(Function<Response, Response> handler) {
            Type type = new TypeToken<List<DseObjectTypeAdminMinDto>>() {
            }.getType();
            return execute(handler).as(type);
        }

        public static final String ONLY_BRIEFING_QUERY = "onlyBriefing";

        /**
         * @param onlyBriefing (Boolean)  (optional, default to false)
         * @return operation
         */
        public DseObjectTypeAdminRestServiceV1GETGetAllDseObjectTypesOper onlyBriefingQuery(Object... onlyBriefing) {
            reqSpec.addQueryParam(ONLY_BRIEFING_QUERY, onlyBriefing);
            return this;
        }

        /**
         * Customize request specification
         *
         * @param reqSpecCustomizer consumer to modify the RequestSpecBuilder
         * @return operation
         */
        public DseObjectTypeAdminRestServiceV1GETGetAllDseObjectTypesOper reqSpec(Consumer<RequestSpecBuilder> reqSpecCustomizer) {
            reqSpecCustomizer.accept(reqSpec);
            return this;
        }

        /**
         * Customize response specification
         *
         * @param respSpecCustomizer consumer to modify the ResponseSpecBuilder
         * @return operation
         */
        public DseObjectTypeAdminRestServiceV1GETGetAllDseObjectTypesOper respSpec(Consumer<ResponseSpecBuilder> respSpecCustomizer) {
            respSpecCustomizer.accept(respSpec);
            return this;
        }
    }

    /**
     * Get object type data  __Security Roles Allowed:__ PIMEDIA_ORGANISATION_MANAGE_TYPES
     *
     * @see #dseObjectTypeIdPath id for object type of interest (required)
     * return DseObjectTypeAdminDto
     */
    public static class DseObjectTypeAdminRestServiceV1GETGetDseObjectTypeOper implements Oper {

        public static final Method REQ_METHOD = GET;
        public static final String REQ_URI = "/dse/rest/v1.0/admin/object-types/{dseObjectTypeId}";

        private RequestSpecBuilder reqSpec;
        private ResponseSpecBuilder respSpec;

        public DseObjectTypeAdminRestServiceV1GETGetDseObjectTypeOper(RequestSpecBuilder reqSpec) {
            this.reqSpec = reqSpec;
            reqSpec.setAccept("application/json");
            this.respSpec = new ResponseSpecBuilder();
        }

        /**
         * GET /dse/rest/v1.0/admin/object-types/{dseObjectTypeId}
         *
         * @param handler handler
         * @param <T>     type
         * @return type
         */
        @Override
        public <T> T execute(Function<Response, T> handler) {
            return handler.apply(RestAssured.given().spec(reqSpec.build()).expect().spec(respSpec.build()).when().request(REQ_METHOD, REQ_URI));
        }

        /**
         * GET /dse/rest/v1.0/admin/object-types/{dseObjectTypeId}
         *
         * @param handler handler
         * @return DseObjectTypeAdminDto
         */
        public DseObjectTypeAdminDto executeAs(Function<Response, Response> handler) {
            Type type = new TypeToken<DseObjectTypeAdminDto>() {
            }.getType();
            return execute(handler).as(type);
        }

        public static final String DSE_OBJECT_TYPE_ID_PATH = "dseObjectTypeId";

        /**
         * @param dseObjectTypeId (Integer) id for object type of interest (required)
         * @return operation
         */
        public DseObjectTypeAdminRestServiceV1GETGetDseObjectTypeOper dseObjectTypeIdPath(Object dseObjectTypeId) {
            reqSpec.addPathParam(DSE_OBJECT_TYPE_ID_PATH, dseObjectTypeId);
            return this;
        }

        /**
         * Customize request specification
         *
         * @param reqSpecCustomizer consumer to modify the RequestSpecBuilder
         * @return operation
         */
        public DseObjectTypeAdminRestServiceV1GETGetDseObjectTypeOper reqSpec(Consumer<RequestSpecBuilder> reqSpecCustomizer) {
            reqSpecCustomizer.accept(reqSpec);
            return this;
        }

        /**
         * Customize response specification
         *
         * @param respSpecCustomizer consumer to modify the ResponseSpecBuilder
         * @return operation
         */
        public DseObjectTypeAdminRestServiceV1GETGetDseObjectTypeOper respSpec(Consumer<ResponseSpecBuilder> respSpecCustomizer) {
            respSpecCustomizer.accept(respSpec);
            return this;
        }
    }

    /**
     * __Security Roles Allowed:__ PIMEDIA_ORGANISATION_MANAGE_TYPES  __SeeAlso:__ DseRunModuleEnum , can be JOB, PROCESS or PRODUCT NOTE: if objectTypeId is provided, inheritance is taken from the object type
     *
     * @see #inheritanceTypeQuery - optional, used when objectTypeId not provided NOTE: if objectTypeId is provided, inheritance is taken from the object type (optional)
     * @see #localizableQuery - optional, if specified, check that ; (optional)
     * @see #objectTypeIdQuery - optional, id of type that is parent dse object type for subtypes of interest (optional)
     * @see #runModuleQuery - optional, used when objectTypeId not provided, type of dse parent- (and sub-) objects, (optional)
     * return List&lt;DseObjectTypeAdminMinDto&gt;
     */
    public static class DseObjectTypeAdminRestServiceV1GETGetDseSubObjectTypesOper implements Oper {

        public static final Method REQ_METHOD = GET;
        public static final String REQ_URI = "/dse/rest/v1.0/admin/object-types/sub-object-types";

        private RequestSpecBuilder reqSpec;
        private ResponseSpecBuilder respSpec;

        public DseObjectTypeAdminRestServiceV1GETGetDseSubObjectTypesOper(RequestSpecBuilder reqSpec) {
            this.reqSpec = reqSpec;
            reqSpec.setAccept("application/json");
            this.respSpec = new ResponseSpecBuilder();
        }

        /**
         * GET /dse/rest/v1.0/admin/object-types/sub-object-types
         *
         * @param handler handler
         * @param <T>     type
         * @return type
         */
        @Override
        public <T> T execute(Function<Response, T> handler) {
            return handler.apply(RestAssured.given().spec(reqSpec.build()).expect().spec(respSpec.build()).when().request(REQ_METHOD, REQ_URI));
        }

        /**
         * GET /dse/rest/v1.0/admin/object-types/sub-object-types
         *
         * @param handler handler
         * @return List&lt;DseObjectTypeAdminMinDto&gt;
         */
        public List<DseObjectTypeAdminMinDto> executeAs(Function<Response, Response> handler) {
            Type type = new TypeToken<List<DseObjectTypeAdminMinDto>>() {
            }.getType();
            return execute(handler).as(type);
        }

        public static final String INHERITANCE_TYPE_QUERY = "inheritanceType";

        /**
         * @param inheritanceType (String) - optional, used when objectTypeId not provided NOTE: if objectTypeId is provided, inheritance is taken from the object type (optional)
         * @return operation
         */
        public DseObjectTypeAdminRestServiceV1GETGetDseSubObjectTypesOper inheritanceTypeQuery(Object... inheritanceType) {
            reqSpec.addQueryParam(INHERITANCE_TYPE_QUERY, inheritanceType);
            return this;
        }

        public static final String LOCALIZABLE_QUERY = "localizable";

        /**
         * @param localizable (Boolean) - optional, if specified, check that ; (optional)
         * @return operation
         */
        public DseObjectTypeAdminRestServiceV1GETGetDseSubObjectTypesOper localizableQuery(Object... localizable) {
            reqSpec.addQueryParam(LOCALIZABLE_QUERY, localizable);
            return this;
        }

        public static final String OBJECT_TYPE_ID_QUERY = "objectTypeId";

        /**
         * @param objectTypeId (Integer) - optional, id of type that is parent dse object type for subtypes of interest (optional)
         * @return operation
         */
        public DseObjectTypeAdminRestServiceV1GETGetDseSubObjectTypesOper objectTypeIdQuery(Object... objectTypeId) {
            reqSpec.addQueryParam(OBJECT_TYPE_ID_QUERY, objectTypeId);
            return this;
        }

        public static final String RUN_MODULE_QUERY = "runModule";

        /**
         * @param runModule (String) - optional, used when objectTypeId not provided, type of dse parent- (and sub-) objects, (optional)
         * @return operation
         */
        public DseObjectTypeAdminRestServiceV1GETGetDseSubObjectTypesOper runModuleQuery(Object... runModule) {
            reqSpec.addQueryParam(RUN_MODULE_QUERY, runModule);
            return this;
        }

        /**
         * Customize request specification
         *
         * @param reqSpecCustomizer consumer to modify the RequestSpecBuilder
         * @return operation
         */
        public DseObjectTypeAdminRestServiceV1GETGetDseSubObjectTypesOper reqSpec(Consumer<RequestSpecBuilder> reqSpecCustomizer) {
            reqSpecCustomizer.accept(reqSpec);
            return this;
        }

        /**
         * Customize response specification
         *
         * @param respSpecCustomizer consumer to modify the ResponseSpecBuilder
         * @return operation
         */
        public DseObjectTypeAdminRestServiceV1GETGetDseSubObjectTypesOper respSpec(Consumer<ResponseSpecBuilder> respSpecCustomizer) {
            respSpecCustomizer.accept(respSpec);
            return this;
        }
    }

    /**
     * Get list of object types that can be selected as parent type of new object type with single inheritance  __Security Roles Allowed:__ PIMEDIA_ORGANISATION_MANAGE_TYPES
     *
     * @see #runModuleQuery run module of child type (newly created) (optional)
     * return List&lt;DseObjectTypeAdminMinDto&gt;
     */
    public static class DseObjectTypeAdminRestServiceV1GETGetParentDseObjectTypeOptionsOper implements Oper {

        public static final Method REQ_METHOD = GET;
        public static final String REQ_URI = "/dse/rest/v1.0/admin/object-types/_get-parent-type-options";

        private RequestSpecBuilder reqSpec;
        private ResponseSpecBuilder respSpec;

        public DseObjectTypeAdminRestServiceV1GETGetParentDseObjectTypeOptionsOper(RequestSpecBuilder reqSpec) {
            this.reqSpec = reqSpec;
            reqSpec.setAccept("application/json");
            this.respSpec = new ResponseSpecBuilder();
        }

        /**
         * GET /dse/rest/v1.0/admin/object-types/_get-parent-type-options
         *
         * @param handler handler
         * @param <T>     type
         * @return type
         */
        @Override
        public <T> T execute(Function<Response, T> handler) {
            return handler.apply(RestAssured.given().spec(reqSpec.build()).expect().spec(respSpec.build()).when().request(REQ_METHOD, REQ_URI));
        }

        /**
         * GET /dse/rest/v1.0/admin/object-types/_get-parent-type-options
         *
         * @param handler handler
         * @return List&lt;DseObjectTypeAdminMinDto&gt;
         */
        public List<DseObjectTypeAdminMinDto> executeAs(Function<Response, Response> handler) {
            Type type = new TypeToken<List<DseObjectTypeAdminMinDto>>() {
            }.getType();
            return execute(handler).as(type);
        }

        public static final String RUN_MODULE_QUERY = "runModule";

        /**
         * @param runModule (String) run module of child type (newly created) (optional)
         * @return operation
         */
        public DseObjectTypeAdminRestServiceV1GETGetParentDseObjectTypeOptionsOper runModuleQuery(Object... runModule) {
            reqSpec.addQueryParam(RUN_MODULE_QUERY, runModule);
            return this;
        }

        /**
         * Customize request specification
         *
         * @param reqSpecCustomizer consumer to modify the RequestSpecBuilder
         * @return operation
         */
        public DseObjectTypeAdminRestServiceV1GETGetParentDseObjectTypeOptionsOper reqSpec(Consumer<RequestSpecBuilder> reqSpecCustomizer) {
            reqSpecCustomizer.accept(reqSpec);
            return this;
        }

        /**
         * Customize response specification
         *
         * @param respSpecCustomizer consumer to modify the ResponseSpecBuilder
         * @return operation
         */
        public DseObjectTypeAdminRestServiceV1GETGetParentDseObjectTypeOptionsOper respSpec(Consumer<ResponseSpecBuilder> respSpecCustomizer) {
            respSpecCustomizer.accept(respSpec);
            return this;
        }
    }

    /**
     * Get object type validation results  __Security Roles Allowed:__ PIMEDIA_ORGANISATION_MANAGE_TYPES
     *
     * @see #dseObjectTypeIdPath id for object type of interest (required)
     * return DseObjectTypeValidationResults
     */
    public static class DseObjectTypeAdminRestServiceV1GETGetValidationResultsOper implements Oper {

        public static final Method REQ_METHOD = GET;
        public static final String REQ_URI = "/dse/rest/v1.0/admin/object-types/{dseObjectTypeId}/validation-results";

        private RequestSpecBuilder reqSpec;
        private ResponseSpecBuilder respSpec;

        public DseObjectTypeAdminRestServiceV1GETGetValidationResultsOper(RequestSpecBuilder reqSpec) {
            this.reqSpec = reqSpec;
            reqSpec.setAccept("application/json");
            this.respSpec = new ResponseSpecBuilder();
        }

        /**
         * GET /dse/rest/v1.0/admin/object-types/{dseObjectTypeId}/validation-results
         *
         * @param handler handler
         * @param <T>     type
         * @return type
         */
        @Override
        public <T> T execute(Function<Response, T> handler) {
            return handler.apply(RestAssured.given().spec(reqSpec.build()).expect().spec(respSpec.build()).when().request(REQ_METHOD, REQ_URI));
        }

        public static final String DSE_OBJECT_TYPE_ID_PATH = "dseObjectTypeId";

        /**
         * @param dseObjectTypeId (Integer) id for object type of interest (required)
         * @return operation
         */
        public DseObjectTypeAdminRestServiceV1GETGetValidationResultsOper dseObjectTypeIdPath(Object dseObjectTypeId) {
            reqSpec.addPathParam(DSE_OBJECT_TYPE_ID_PATH, dseObjectTypeId);
            return this;
        }

        /**
         * Customize request specification
         *
         * @param reqSpecCustomizer consumer to modify the RequestSpecBuilder
         * @return operation
         */
        public DseObjectTypeAdminRestServiceV1GETGetValidationResultsOper reqSpec(Consumer<RequestSpecBuilder> reqSpecCustomizer) {
            reqSpecCustomizer.accept(reqSpec);
            return this;
        }

        /**
         * Customize response specification
         *
         * @param respSpecCustomizer consumer to modify the ResponseSpecBuilder
         * @return operation
         */
        public DseObjectTypeAdminRestServiceV1GETGetValidationResultsOper respSpec(Consumer<ResponseSpecBuilder> respSpecCustomizer) {
            respSpecCustomizer.accept(respSpec);
            return this;
        }
    }

    /**
     * Create object type as copy of specified one  __Security Roles Allowed:__ PIMEDIA_ORGANISATION_MANAGE_TYPES
     *
     * @see #dseObjectTypeIdPath id of source object type (required)
     * @see #body  (optional)
     * return DseObjectTypeAdminMinDto
     */
    public static class DseObjectTypeAdminRestServiceV1POSTCopyDseObjectTypeOper implements Oper {

        public static final Method REQ_METHOD = POST;
        public static final String REQ_URI = "/dse/rest/v1.0/admin/object-types/{dseObjectTypeId}/copy";

        private RequestSpecBuilder reqSpec;
        private ResponseSpecBuilder respSpec;

        public DseObjectTypeAdminRestServiceV1POSTCopyDseObjectTypeOper(RequestSpecBuilder reqSpec) {
            this.reqSpec = reqSpec;
            reqSpec.setContentType("application/json");
            reqSpec.setAccept("application/json");
            this.respSpec = new ResponseSpecBuilder();
        }

        /**
         * POST /dse/rest/v1.0/admin/object-types/{dseObjectTypeId}/copy
         *
         * @param handler handler
         * @param <T>     type
         * @return type
         */
        @Override
        public <T> T execute(Function<Response, T> handler) {
            return handler.apply(RestAssured.given().spec(reqSpec.build()).expect().spec(respSpec.build()).when().request(REQ_METHOD, REQ_URI));
        }

        /**
         * POST /dse/rest/v1.0/admin/object-types/{dseObjectTypeId}/copy
         *
         * @param handler handler
         * @return DseObjectTypeAdminMinDto
         */
        public DseObjectTypeAdminMinDto executeAs(Function<Response, Response> handler) {
            Type type = new TypeToken<DseObjectTypeAdminMinDto>() {
            }.getType();
            return execute(handler).as(type);
        }

        /**
         * @param dseObjectTypeCopyParam (DseObjectTypeCopyParam)  (optional)
         * @return operation
         */
        public DseObjectTypeAdminRestServiceV1POSTCopyDseObjectTypeOper body(DseObjectTypeCopyParam dseObjectTypeCopyParam) {
            reqSpec.setBody(dseObjectTypeCopyParam);
            return this;
        }

        public static final String DSE_OBJECT_TYPE_ID_PATH = "dseObjectTypeId";

        /**
         * @param dseObjectTypeId (Integer) id of source object type (required)
         * @return operation
         */
        public DseObjectTypeAdminRestServiceV1POSTCopyDseObjectTypeOper dseObjectTypeIdPath(Object dseObjectTypeId) {
            reqSpec.addPathParam(DSE_OBJECT_TYPE_ID_PATH, dseObjectTypeId);
            return this;
        }

        /**
         * Customize request specification
         *
         * @param reqSpecCustomizer consumer to modify the RequestSpecBuilder
         * @return operation
         */
        public DseObjectTypeAdminRestServiceV1POSTCopyDseObjectTypeOper reqSpec(Consumer<RequestSpecBuilder> reqSpecCustomizer) {
            reqSpecCustomizer.accept(reqSpec);
            return this;
        }

        /**
         * Customize response specification
         *
         * @param respSpecCustomizer consumer to modify the ResponseSpecBuilder
         * @return operation
         */
        public DseObjectTypeAdminRestServiceV1POSTCopyDseObjectTypeOper respSpec(Consumer<ResponseSpecBuilder> respSpecCustomizer) {
            respSpecCustomizer.accept(respSpec);
            return this;
        }
    }

    public static class DseObjectTypeAdminRestServiceV1POSTCreateDseObjectTypeOper implements Oper {

        public static final Method REQ_METHOD = POST;
        public static final String REQ_URI = "/dse/rest/v1.0/admin/object-types";

        private RequestSpecBuilder reqSpec;
        private ResponseSpecBuilder respSpec;

        public DseObjectTypeAdminRestServiceV1POSTCreateDseObjectTypeOper(RequestSpecBuilder reqSpec) {
            this.reqSpec = reqSpec;
            reqSpec.setContentType("application/json");
            reqSpec.setAccept("application/json");
            this.respSpec = new ResponseSpecBuilder();
        }

        /**
         * POST /dse/rest/v1.0/admin/object-types
         *
         * @param handler handler
         * @param <T>     type
         * @return type
         */
        @Override
        public <T> T execute(Function<Response, T> handler) {
            return handler.apply(RestAssured.given().spec(reqSpec.build()).expect().spec(respSpec.build()).when().request(REQ_METHOD, REQ_URI));
        }

        /**
         * POST /dse/rest/v1.0/admin/object-types
         *
         * @param handler handler
         * @return DseObjectTypeAdminMinDto
         */
        public DseObjectTypeAdminMinDto executeAs(Function<Response, Response> handler) {
            Type type = new TypeToken<DseObjectTypeAdminMinDto>() {
            }.getType();
            return execute(handler).as(type);
        }

        /**
         * Customize request specification
         *
         * @param reqSpecCustomizer consumer to modify the RequestSpecBuilder
         * @return operation
         */
        public DseObjectTypeAdminRestServiceV1POSTCreateDseObjectTypeOper reqSpec(Consumer<RequestSpecBuilder> reqSpecCustomizer) {
            reqSpecCustomizer.accept(reqSpec);
            return this;
        }

        /**
         * Customize response specification
         *
         * @param respSpecCustomizer consumer to modify the ResponseSpecBuilder
         * @return operation
         */
        public DseObjectTypeAdminRestServiceV1POSTCreateDseObjectTypeOper respSpec(Consumer<ResponseSpecBuilder> respSpecCustomizer) {
            respSpecCustomizer.accept(respSpec);
            return this;
        }
    }

    public static class DseObjectTypeAdminRestServiceV1POSTModifyObjectTypeOper implements Oper {

        public static final Method REQ_METHOD = POST;
        public static final String REQ_URI = "/dse/rest/v1.0/admin/object-types/_modify-object-type";

        private RequestSpecBuilder reqSpec;
        private ResponseSpecBuilder respSpec;

        public DseObjectTypeAdminRestServiceV1POSTModifyObjectTypeOper(RequestSpecBuilder reqSpec) {
            this.reqSpec = reqSpec;
            reqSpec.setContentType("application/json");
            reqSpec.setAccept("application/json");
            this.respSpec = new ResponseSpecBuilder();
        }

        /**
         * POST /dse/rest/v1.0/admin/object-types/_modify-object-type
         *
         * @param handler handler
         * @param <T>     type
         * @return type
         */
        @Override
        public <T> T execute(Function<Response, T> handler) {
            return handler.apply(RestAssured.given().spec(reqSpec.build()).expect().spec(respSpec.build()).when().request(REQ_METHOD, REQ_URI));
        }

        /**
         * POST /dse/rest/v1.0/admin/object-types/_modify-object-type
         *
         * @param handler handler
         * @return DseObjectTypeAdminDto
         */
        public DseObjectTypeAdminDto executeAs(Function<Response, Response> handler) {
            Type type = new TypeToken<DseObjectTypeAdminDto>() {
            }.getType();
            return execute(handler).as(type);
        }

        /**
         * Customize request specification
         *
         * @param reqSpecCustomizer consumer to modify the RequestSpecBuilder
         * @return operation
         */
        public DseObjectTypeAdminRestServiceV1POSTModifyObjectTypeOper reqSpec(Consumer<RequestSpecBuilder> reqSpecCustomizer) {
            reqSpecCustomizer.accept(reqSpec);
            return this;
        }

        /**
         * Customize response specification
         *
         * @param respSpecCustomizer consumer to modify the ResponseSpecBuilder
         * @return operation
         */
        public DseObjectTypeAdminRestServiceV1POSTModifyObjectTypeOper respSpec(Consumer<ResponseSpecBuilder> respSpecCustomizer) {
            respSpecCustomizer.accept(respSpec);
            return this;
        }
    }
}
