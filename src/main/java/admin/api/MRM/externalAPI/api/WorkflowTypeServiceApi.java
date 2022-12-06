

package admin.api.MRM.externalAPI.api;

import admin.api.MRM.externalAPI.model.WorkflowMetatypeList;
import admin.api.MRM.externalAPI.model.WorkflowType;
import admin.api.Oper;
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

import java.io.File;
import java.lang.reflect.Type;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

import static io.restassured.http.Method.*;

public class WorkflowTypeServiceApi {

    private Supplier<RequestSpecBuilder> reqSpecSupplier;
    private Consumer<RequestSpecBuilder> reqSpecCustomizer;

    private WorkflowTypeServiceApi(Supplier<RequestSpecBuilder> reqSpecSupplier) {
        this.reqSpecSupplier = reqSpecSupplier;
    }

    public static WorkflowTypeServiceApi workflowTypeService(Supplier<RequestSpecBuilder> reqSpecSupplier) {
        return new WorkflowTypeServiceApi(reqSpecSupplier);
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
                findByWorkflowTypeId(),
                findNotDeletedWorkflowMetatypes(),
                getProcessList(),
                getProcessList2(),
                isWorkflowTypeExists()
        );
    }

    @ApiOperation(value = "",
            notes = "",
            nickname = "findByWorkflowTypeId",
            tags = {"WorkflowTypeService"})
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "")})
    public FindByWorkflowTypeIdOper findByWorkflowTypeId() {
        return new FindByWorkflowTypeIdOper(createReqSpec());
    }

    @ApiOperation(value = "",
            notes = "",
            nickname = "findNotDeletedWorkflowMetatypes",
            tags = {"WorkflowTypeService"})
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "")})
    public FindNotDeletedWorkflowMetatypesOper findNotDeletedWorkflowMetatypes() {
        return new FindNotDeletedWorkflowMetatypesOper(createReqSpec());
    }

    @ApiOperation(value = "",
            notes = "",
            nickname = "getProcessList",
            tags = {"WorkflowTypeService"})
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "")})
    public GetProcessListOper getProcessList() {
        return new GetProcessListOper(createReqSpec());
    }

    @ApiOperation(value = "",
            notes = "",
            nickname = "getProcessList2",
            tags = {"WorkflowTypeService"})
    @ApiResponses(value = {
            @ApiResponse(code = 201, message = "")})
    public GetProcessList2Oper getProcessList2() {
        return new GetProcessList2Oper(createReqSpec());
    }

    @ApiOperation(value = "",
            notes = "",
            nickname = "isWorkflowTypeExists",
            tags = {"WorkflowTypeService"})
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "")})
    public IsWorkflowTypeExistsOper isWorkflowTypeExists() {
        return new IsWorkflowTypeExistsOper(createReqSpec());
    }

    /**
     * Customize request specification
     *
     * @param reqSpecCustomizer consumer to modify the RequestSpecBuilder
     * @return api
     */
    public WorkflowTypeServiceApi reqSpec(Consumer<RequestSpecBuilder> reqSpecCustomizer) {
        this.reqSpecCustomizer = reqSpecCustomizer;
        return this;
    }

    /**
     * @see #workflowTypeIdPath  (required)
     * return WorkflowType
     */
    public static class FindByWorkflowTypeIdOper implements Oper {

        public static final Method REQ_METHOD = GET;
        public static final String REQ_URI = "/type/{workflowTypeId}";

        private RequestSpecBuilder reqSpec;
        private ResponseSpecBuilder respSpec;

        public FindByWorkflowTypeIdOper(RequestSpecBuilder reqSpec) {
            this.reqSpec = reqSpec;
            reqSpec.setAccept("application/json");
            this.respSpec = new ResponseSpecBuilder();
        }

        /**
         * GET /type/{workflowTypeId}
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
         * GET /type/{workflowTypeId}
         *
         * @param handler handler
         * @return WorkflowType
         */
        public WorkflowType executeAs(Function<Response, Response> handler) {
            Type type = new TypeToken<WorkflowType>() {
            }.getType();
            return execute(handler).as(type);
        }

        public static final String WORKFLOW_TYPE_ID_PATH = "workflowTypeId";

        /**
         * @param workflowTypeId (Integer)  (required)
         * @return operation
         */
        public FindByWorkflowTypeIdOper workflowTypeIdPath(Object workflowTypeId) {
            reqSpec.addPathParam(WORKFLOW_TYPE_ID_PATH, workflowTypeId);
            return this;
        }

        /**
         * Customize request specification
         *
         * @param reqSpecCustomizer consumer to modify the RequestSpecBuilder
         * @return operation
         */
        public FindByWorkflowTypeIdOper reqSpec(Consumer<RequestSpecBuilder> reqSpecCustomizer) {
            reqSpecCustomizer.accept(reqSpec);
            return this;
        }

        /**
         * Customize response specification
         *
         * @param respSpecCustomizer consumer to modify the ResponseSpecBuilder
         * @return operation
         */
        public FindByWorkflowTypeIdOper respSpec(Consumer<ResponseSpecBuilder> respSpecCustomizer) {
            respSpecCustomizer.accept(respSpec);
            return this;
        }
    }

    /**
     * @see #workflowTypeIdPath  (required)
     * @see #workflowObjectTypeIdQuery  (optional)
     * return WorkflowMetatypeList
     */
    public static class FindNotDeletedWorkflowMetatypesOper implements Oper {

        public static final Method REQ_METHOD = GET;
        public static final String REQ_URI = "/type/{workflowTypeId}/meta-types";

        private RequestSpecBuilder reqSpec;
        private ResponseSpecBuilder respSpec;

        public FindNotDeletedWorkflowMetatypesOper(RequestSpecBuilder reqSpec) {
            this.reqSpec = reqSpec;
            reqSpec.setAccept("application/json");
            this.respSpec = new ResponseSpecBuilder();
        }

        /**
         * GET /type/{workflowTypeId}/meta-types
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
         * GET /type/{workflowTypeId}/meta-types
         *
         * @param handler handler
         * @return WorkflowMetatypeList
         */
        public WorkflowMetatypeList executeAs(Function<Response, Response> handler) {
            Type type = new TypeToken<WorkflowMetatypeList>() {
            }.getType();
            return execute(handler).as(type);
        }

        public static final String WORKFLOW_TYPE_ID_PATH = "workflowTypeId";

        /**
         * @param workflowTypeId (Integer)  (required)
         * @return operation
         */
        public FindNotDeletedWorkflowMetatypesOper workflowTypeIdPath(Object workflowTypeId) {
            reqSpec.addPathParam(WORKFLOW_TYPE_ID_PATH, workflowTypeId);
            return this;
        }

        public static final String WORKFLOW_OBJECT_TYPE_ID_QUERY = "workflowObjectTypeId";

        /**
         * @param workflowObjectTypeId (Integer)  (optional)
         * @return operation
         */
        public FindNotDeletedWorkflowMetatypesOper workflowObjectTypeIdQuery(Object... workflowObjectTypeId) {
            reqSpec.addQueryParam(WORKFLOW_OBJECT_TYPE_ID_QUERY, workflowObjectTypeId);
            return this;
        }

        /**
         * Customize request specification
         *
         * @param reqSpecCustomizer consumer to modify the RequestSpecBuilder
         * @return operation
         */
        public FindNotDeletedWorkflowMetatypesOper reqSpec(Consumer<RequestSpecBuilder> reqSpecCustomizer) {
            reqSpecCustomizer.accept(reqSpec);
            return this;
        }

        /**
         * Customize response specification
         *
         * @param respSpecCustomizer consumer to modify the ResponseSpecBuilder
         * @return operation
         */
        public FindNotDeletedWorkflowMetatypesOper respSpec(Consumer<ResponseSpecBuilder> respSpecCustomizer) {
            respSpecCustomizer.accept(respSpec);
            return this;
        }
    }

    /**
     * return List&lt;WorkflowType&gt;
     */
    public static class GetProcessListOper implements Oper {

        public static final Method REQ_METHOD = GET;
        public static final String REQ_URI = "/wf/type";

        private RequestSpecBuilder reqSpec;
        private ResponseSpecBuilder respSpec;

        public GetProcessListOper(RequestSpecBuilder reqSpec) {
            this.reqSpec = reqSpec;
            reqSpec.setAccept("application/json");
            this.respSpec = new ResponseSpecBuilder();
        }

        /**
         * GET /wf/type
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
         * GET /wf/type
         *
         * @param handler handler
         * @return List&lt;WorkflowType&gt;
         */
        public List<WorkflowType> executeAs(Function<Response, Response> handler) {
            Type type = new TypeToken<List<WorkflowType>>() {
            }.getType();
            return execute(handler).as(type);
        }

        /**
         * Customize request specification
         *
         * @param reqSpecCustomizer consumer to modify the RequestSpecBuilder
         * @return operation
         */
        public GetProcessListOper reqSpec(Consumer<RequestSpecBuilder> reqSpecCustomizer) {
            reqSpecCustomizer.accept(reqSpec);
            return this;
        }

        /**
         * Customize response specification
         *
         * @param respSpecCustomizer consumer to modify the ResponseSpecBuilder
         * @return operation
         */
        public GetProcessListOper respSpec(Consumer<ResponseSpecBuilder> respSpecCustomizer) {
            respSpecCustomizer.accept(respSpec);
            return this;
        }
    }

    /**
     * @see #body  (optional)
     * return List&lt;WorkflowType&gt;
     */
    public static class GetProcessList2Oper implements Oper {

        public static final Method REQ_METHOD = POST;
        public static final String REQ_URI = "/type/_ids";

        private RequestSpecBuilder reqSpec;
        private ResponseSpecBuilder respSpec;

        public GetProcessList2Oper(RequestSpecBuilder reqSpec) {
            this.reqSpec = reqSpec;
            reqSpec.setContentType("application/json");
            reqSpec.setAccept("application/json");
            this.respSpec = new ResponseSpecBuilder();
        }

        /**
         * POST /type/_ids
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
         * POST /type/_ids
         *
         * @param handler handler
         * @return List&lt;WorkflowType&gt;
         */
        public List<WorkflowType> executeAs(Function<Response, Response> handler) {
            Type type = new TypeToken<List<WorkflowType>>() {
            }.getType();
            return execute(handler).as(type);
        }

        /**
         * @param body (List&lt;Integer&gt;)  (optional)
         * @return operation
         */
        public GetProcessList2Oper body(List<Integer> body) {
            reqSpec.setBody(body);
            return this;
        }

        /**
         * Customize request specification
         *
         * @param reqSpecCustomizer consumer to modify the RequestSpecBuilder
         * @return operation
         */
        public GetProcessList2Oper reqSpec(Consumer<RequestSpecBuilder> reqSpecCustomizer) {
            reqSpecCustomizer.accept(reqSpec);
            return this;
        }

        /**
         * Customize response specification
         *
         * @param respSpecCustomizer consumer to modify the ResponseSpecBuilder
         * @return operation
         */
        public GetProcessList2Oper respSpec(Consumer<ResponseSpecBuilder> respSpecCustomizer) {
            respSpecCustomizer.accept(respSpec);
            return this;
        }
    }

    /**
     * @see #workflowTypeIdPath  (required)
     * return File
     */
    public static class IsWorkflowTypeExistsOper implements Oper {

        public static final Method REQ_METHOD = HEAD;
        public static final String REQ_URI = "/type/{workflowTypeId}";

        private RequestSpecBuilder reqSpec;
        private ResponseSpecBuilder respSpec;

        public IsWorkflowTypeExistsOper(RequestSpecBuilder reqSpec) {
            this.reqSpec = reqSpec;
            reqSpec.setAccept("application/json");
            this.respSpec = new ResponseSpecBuilder();
        }

        /**
         * HEAD /type/{workflowTypeId}
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
         * HEAD /type/{workflowTypeId}
         *
         * @param handler handler
         * @return File
         */
        public File executeAs(Function<Response, Response> handler) {
            Type type = new TypeToken<File>() {
            }.getType();
            return execute(handler).as(type);
        }

        public static final String WORKFLOW_TYPE_ID_PATH = "workflowTypeId";

        /**
         * @param workflowTypeId (Integer)  (required)
         * @return operation
         */
        public IsWorkflowTypeExistsOper workflowTypeIdPath(Object workflowTypeId) {
            reqSpec.addPathParam(WORKFLOW_TYPE_ID_PATH, workflowTypeId);
            return this;
        }

        /**
         * Customize request specification
         *
         * @param reqSpecCustomizer consumer to modify the RequestSpecBuilder
         * @return operation
         */
        public IsWorkflowTypeExistsOper reqSpec(Consumer<RequestSpecBuilder> reqSpecCustomizer) {
            reqSpecCustomizer.accept(reqSpec);
            return this;
        }

        /**
         * Customize response specification
         *
         * @param respSpecCustomizer consumer to modify the ResponseSpecBuilder
         * @return operation
         */
        public IsWorkflowTypeExistsOper respSpec(Consumer<ResponseSpecBuilder> respSpecCustomizer) {
            respSpecCustomizer.accept(respSpec);
            return this;
        }
    }
}
