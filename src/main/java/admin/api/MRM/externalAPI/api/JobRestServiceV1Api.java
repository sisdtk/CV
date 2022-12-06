

package admin.api.MRM.externalAPI.api;

import admin.api.MRM.externalAPI.model.*;
import admin.api.Oper;
import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.common.mapper.TypeRef;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

import static io.restassured.http.Method.*;

public class JobRestServiceV1Api {

    private Supplier<RequestSpecBuilder> reqSpecSupplier;
    private Consumer<RequestSpecBuilder> reqSpecCustomizer;

    private JobRestServiceV1Api(Supplier<RequestSpecBuilder> reqSpecSupplier) {
        this.reqSpecSupplier = reqSpecSupplier;
    }

    public static JobRestServiceV1Api jobRestServiceV1(Supplier<RequestSpecBuilder> reqSpecSupplier) {
        return new JobRestServiceV1Api(reqSpecSupplier);
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
                jobRestServiceV1DELETEDelete(),
                jobRestServiceV1GETFindTypesByFilterId(),
                jobRestServiceV1GETGet(),
                jobRestServiceV1GETGetIds(),
                jobRestServiceV1GETGetSubJobIds(),
                jobRestServiceV1GETGetSubJobs(),
                jobRestServiceV1GETGetWorkflow(),
                jobRestServiceV1POSTAssign(),
                jobRestServiceV1POSTCancel(),
                jobRestServiceV1POSTCancelSubJobs(),
                jobRestServiceV1POSTCopy(),
                jobRestServiceV1POSTCreateJob(),
                jobRestServiceV1POSTDeleteSubJobs(),
                jobRestServiceV1POSTFinish(),
                jobRestServiceV1POSTForward(),
                jobRestServiceV1POSTForwardDefault(),
                jobRestServiceV1POSTGetCommentByWorkflowStep(),
                jobRestServiceV1POSTReject(),
                jobRestServiceV1POSTRejectDefault(),
                jobRestServiceV1POSTSearch(),
                jobRestServiceV1POSTSearchIds(),
                jobRestServiceV1PUTUpdateJob()
        );
    }

    @ApiOperation(value = "",
            notes = "Delete job by ordinal number.  __Security Roles Allowed:__ JOB_MANAGER_MODULE_ACCESS",
            nickname = "jobRestServiceV1DELETEDelete",
            tags = {"JobRestServiceV1"})
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Success"),
            @ApiResponse(code = 404, message = "Job with such id doesn't exist or job is BPMN")})
    public JobRestServiceV1DELETEDeleteOper jobRestServiceV1DELETEDelete() {
        return new JobRestServiceV1DELETEDeleteOper(createReqSpec());
    }

    @ApiOperation(value = "",
            notes = "Return job types by id filter.  __Security Roles Allowed:__ JOB_MANAGER_MODULE_ACCESS",
            nickname = "jobRestServiceV1GETFindTypesByFilterId",
            tags = {"JobRestServiceV1"})
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Success"),
            @ApiResponse(code = 403, message = "User does not have permission to access it"),
            @ApiResponse(code = 404, message = "Filter with such id doesn't exist")})
    public JobRestServiceV1GETFindTypesByFilterIdOper jobRestServiceV1GETFindTypesByFilterId() {
        return new JobRestServiceV1GETFindTypesByFilterIdOper(createReqSpec());
    }

    @ApiOperation(value = "",
            notes = "Return Job.  __Security Roles Allowed:__ JOB_MANAGER_MODULE_ACCESS",
            nickname = "jobRestServiceV1GETGet",
            tags = {"JobRestServiceV1"})
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Success"),
            @ApiResponse(code = 404, message = "Job with such id doesn't exist or job is BPMN")})
    public JobRestServiceV1GETGetOper jobRestServiceV1GETGet() {
        return new JobRestServiceV1GETGetOper(createReqSpec());
    }

    @ApiOperation(value = "",
            notes = "Returns only ids of Job.  __Security Roles Allowed:__ JOB_MANAGER_MODULE_ACCESS",
            nickname = "jobRestServiceV1GETGetIds",
            tags = {"JobRestServiceV1"})
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Success"),
            @ApiResponse(code = 404, message = "Job with such id doesn't exist or job is BPMN")})
    public JobRestServiceV1GETGetIdsOper jobRestServiceV1GETGetIds() {
        return new JobRestServiceV1GETGetIdsOper(createReqSpec());
    }

    @ApiOperation(value = "",
            notes = "Returns ids sub jobs by parent ordinal number.  __Security Roles Allowed:__ JOB_MANAGER_MODULE_ACCESS",
            nickname = "jobRestServiceV1GETGetSubJobIds",
            tags = {"JobRestServiceV1"})
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Success"),
            @ApiResponse(code = 404, message = "Job with such id doesn't exist or job is BPMN")})
    public JobRestServiceV1GETGetSubJobIdsOper jobRestServiceV1GETGetSubJobIds() {
        return new JobRestServiceV1GETGetSubJobIdsOper(createReqSpec());
    }

    @ApiOperation(value = "",
            notes = "Returns sub jobs by parent ordinal number.  __Security Roles Allowed:__ JOB_MANAGER_MODULE_ACCESS",
            nickname = "jobRestServiceV1GETGetSubJobs",
            tags = {"JobRestServiceV1"})
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Success"),
            @ApiResponse(code = 404, message = "Job with such id doesn't exist or job is BPMN")})
    public JobRestServiceV1GETGetSubJobsOper jobRestServiceV1GETGetSubJobs() {
        return new JobRestServiceV1GETGetSubJobsOper(createReqSpec());
    }

    @ApiOperation(value = "",
            notes = "Returns job workflow.  __Security Roles Allowed:__ JOB_MANAGER_MODULE_ACCESS",
            nickname = "jobRestServiceV1GETGetWorkflow",
            tags = {"JobRestServiceV1"})
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Success"),
            @ApiResponse(code = 404, message = "Job with such id doesn't exist or job is BPMN")})
    public JobRestServiceV1GETGetWorkflowOper jobRestServiceV1GETGetWorkflow() {
        return new JobRestServiceV1GETGetWorkflowOper(createReqSpec());
    }

    @ApiOperation(value = "",
            notes = "The method change an assignee on the current step of the workflow of the job given. New assigneeID is passed as parameter, userGroupId is needed as an identifier of the userGroup. In case it's been missed the system will take userGroupId as a AREA_ID from WorkflowStepTemplate of the current Workflow Step. There is a parameter comment provided, that will appear in Job Discussion When user wants to set assignee as a group one should send an empty assigneeId field. If at the particular step has individual assignment only sending an empty assigneeId will lead to having current user as assignee  __Security Roles Allowed:__ JOB_MANAGER_MODULE_ACCESS",
            nickname = "jobRestServiceV1POSTAssign",
            tags = {"JobRestServiceV1"})
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Success"),
            @ApiResponse(code = 404, message = "Job with such id doesn't exist or job is BPMN")})
    public JobRestServiceV1POSTAssignOper jobRestServiceV1POSTAssign() {
        return new JobRestServiceV1POSTAssignOper(createReqSpec());
    }

    @ApiOperation(value = "",
            notes = "Cancel job by ordinal number.  __Security Roles Allowed:__ JOB_MANAGER_MODULE_ACCESS",
            nickname = "jobRestServiceV1POSTCancel",
            tags = {"JobRestServiceV1"})
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Success"),
            @ApiResponse(code = 403, message = "User does not have permission to access it"),
            @ApiResponse(code = 404, message = "Job with such id doesn't exist or job is BPMN")})
    public JobRestServiceV1POSTCancelOper jobRestServiceV1POSTCancel() {
        return new JobRestServiceV1POSTCancelOper(createReqSpec());
    }

    @ApiOperation(value = "",
            notes = "Cancel sub jobs by parent's ordinal number  __Security Roles Allowed:__ JOB_MANAGER_MODULE_ACCESS",
            nickname = "jobRestServiceV1POSTCancelSubJobs",
            tags = {"JobRestServiceV1"})
    @ApiResponses(value = {
            @ApiResponse(code = 201, message = "success")})
    public JobRestServiceV1POSTCancelSubJobsOper jobRestServiceV1POSTCancelSubJobs() {
        return new JobRestServiceV1POSTCancelSubJobsOper(createReqSpec());
    }

    @ApiOperation(value = "",
            notes = "  __Security Roles Allowed:__ JOB_MANAGER_MODULE_ACCESS",
            nickname = "jobRestServiceV1POSTCopy",
            tags = {"JobRestServiceV1"})
    @ApiResponses(value = {
            @ApiResponse(code = 201, message = "201")})
    public JobRestServiceV1POSTCopyOper jobRestServiceV1POSTCopy() {
        return new JobRestServiceV1POSTCopyOper(createReqSpec());
    }

    @ApiOperation(value = "",
            notes = "Create Job.  __Security Roles Allowed:__ JOB_MANAGER_MODULE_ACCESS",
            nickname = "jobRestServiceV1POSTCreateJob",
            tags = {"JobRestServiceV1"})
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Success"),
            @ApiResponse(code = 404, message = "Job type with such id doesn't exist or job type is BPMN")})
    public JobRestServiceV1POSTCreateJobOper jobRestServiceV1POSTCreateJob() {
        return new JobRestServiceV1POSTCreateJobOper(createReqSpec());
    }

    @ApiOperation(value = "",
            notes = "Delete sub jobs by parent's ordinal number  __Security Roles Allowed:__ JOB_MANAGER_MODULE_ACCESS",
            nickname = "jobRestServiceV1POSTDeleteSubJobs",
            tags = {"JobRestServiceV1"})
    @ApiResponses(value = {
            @ApiResponse(code = 201, message = "success")})
    public JobRestServiceV1POSTDeleteSubJobsOper jobRestServiceV1POSTDeleteSubJobs() {
        return new JobRestServiceV1POSTDeleteSubJobsOper(createReqSpec());
    }

    @ApiOperation(value = "",
            notes = "This method finishes job by ordinal number. Jobs is finished only at last step of workflow.  __Security Roles Allowed:__ JOB_MANAGER_MODULE_ACCESS",
            nickname = "jobRestServiceV1POSTFinish",
            tags = {"JobRestServiceV1"})
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Success"),
            @ApiResponse(code = 403, message = "User does not have permission to access it"),
            @ApiResponse(code = 404, message = "Job with such id doesn't exist or job is BPMN"),
            @ApiResponse(code = 409, message = "Job is inactive")})
    public JobRestServiceV1POSTFinishOper jobRestServiceV1POSTFinish() {
        return new JobRestServiceV1POSTFinishOper(createReqSpec());
    }

    @ApiOperation(value = "",
            notes = "The method moves a job by ordinal number to the next step or finish it if the last step has been already reached. For the next workflow step assigneeID is passed as parameter There is a parameter comment provided, that will appear in Job Discussion When user wants to set assignee as a group one should send an empty assigneeId field. If at the particular step has individual assignment only sending an empty assigneeId will lead to having current user as assignee  __Security Roles Allowed:__ JOB_MANAGER_MODULE_ACCESS",
            nickname = "jobRestServiceV1POSTForward",
            tags = {"JobRestServiceV1"})
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Success"),
            @ApiResponse(code = 404, message = "Job with such id doesn't exist or job is BPMN")})
    public JobRestServiceV1POSTForwardOper jobRestServiceV1POSTForward() {
        return new JobRestServiceV1POSTForwardOper(createReqSpec());
    }

    @ApiOperation(value = "",
            notes = "The method moves a job by ordinal number to the next step or finish it if the last step has been already reached. For the next workflow step users are assigned from predefined or already existed job assignees in case when they exist in required user groups.  __Security Roles Allowed:__ JOB_MANAGER_MODULE_ACCESS",
            nickname = "jobRestServiceV1POSTForwardDefault",
            tags = {"JobRestServiceV1"})
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Success"),
            @ApiResponse(code = 404, message = "Job with such id doesn't exist or job is BPMN")})
    public JobRestServiceV1POSTForwardDefaultOper jobRestServiceV1POSTForwardDefault() {
        return new JobRestServiceV1POSTForwardDefaultOper(createReqSpec());
    }

    @ApiOperation(value = "",
            notes = "Returns the comment for a specific Workflow Step as it was applied with a forward/reject action.  __Security Roles Allowed:__ JOB_MANAGER_MODULE_ACCESS",
            nickname = "jobRestServiceV1POSTGetCommentByWorkflowStep",
            tags = {"JobRestServiceV1"})
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Success"),
            @ApiResponse(code = 404, message = "Job with such id doesn't exist or job is BPMN")})
    public JobRestServiceV1POSTGetCommentByWorkflowStepOper jobRestServiceV1POSTGetCommentByWorkflowStep() {
        return new JobRestServiceV1POSTGetCommentByWorkflowStepOper(createReqSpec());
    }

    @ApiOperation(value = "",
            notes = "The method moves a job by ordinal number to the next step back. For the previous workflow step assigneeID is passed as parameter There is a parameter comment provided, that will appear in Job Discussion When user wants to set assignee as a group one should send an empty assigneeId field. If at the particular step has individual assignment only sending an empty assigneeId will lead to having current user as assignee  __Security Roles Allowed:__ JOB_MANAGER_MODULE_ACCESS",
            nickname = "jobRestServiceV1POSTReject",
            tags = {"JobRestServiceV1"})
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Success"),
            @ApiResponse(code = 404, message = "Job with such id doesn't exist or job is BPMN")})
    public JobRestServiceV1POSTRejectOper jobRestServiceV1POSTReject() {
        return new JobRestServiceV1POSTRejectOper(createReqSpec());
    }

    @ApiOperation(value = "",
            notes = "The method moves job by ordinal number to the previous step. For the previous workflow step users are assigned from predefined or already existed job assignees in case when they exist in required user groups.  __Security Roles Allowed:__ JOB_MANAGER_MODULE_ACCESS",
            nickname = "jobRestServiceV1POSTRejectDefault",
            tags = {"JobRestServiceV1"})
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Success"),
            @ApiResponse(code = 404, message = "Job with such id doesn't exist or job is BPMN")})
    public JobRestServiceV1POSTRejectDefaultOper jobRestServiceV1POSTRejectDefault() {
        return new JobRestServiceV1POSTRejectDefaultOper(createReqSpec());
    }

    @ApiOperation(value = "",
            notes = "The method return jobs for specified filter.  __Security Roles Allowed:__ JOB_MANAGER_MODULE_ACCESS",
            nickname = "jobRestServiceV1POSTSearch",
            tags = {"JobRestServiceV1"})
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Success"),
            @ApiResponse(code = 404, message = "Filter with such id doesn't exist")})
    public JobRestServiceV1POSTSearchOper jobRestServiceV1POSTSearch() {
        return new JobRestServiceV1POSTSearchOper(createReqSpec());
    }

    @ApiOperation(value = "",
            notes = "The method return jobs for specified filter.  __Security Roles Allowed:__ JOB_MANAGER_MODULE_ACCESS",
            nickname = "jobRestServiceV1POSTSearchIds",
            tags = {"JobRestServiceV1"})
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Success")})
    public JobRestServiceV1POSTSearchIdsOper jobRestServiceV1POSTSearchIds() {
        return new JobRestServiceV1POSTSearchIdsOper(createReqSpec());
    }

    @ApiOperation(value = "",
            notes = "Update Job.  __Security Roles Allowed:__ JOB_MANAGER_MODULE_ACCESS",
            nickname = "jobRestServiceV1PUTUpdateJob",
            tags = {"JobRestServiceV1"})
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Success"),
            @ApiResponse(code = 404, message = "Job with such id doesn't exist or job is BPMN"),
            @ApiResponse(code = 409, message = "Invalid parameters")})
    public JobRestServiceV1PUTUpdateJobOper jobRestServiceV1PUTUpdateJob() {
        return new JobRestServiceV1PUTUpdateJobOper(createReqSpec());
    }

    /**
     * Customize request specification
     *
     * @param reqSpecCustomizer consumer to modify the RequestSpecBuilder
     * @return api
     */
    public JobRestServiceV1Api reqSpec(Consumer<RequestSpecBuilder> reqSpecCustomizer) {
        this.reqSpecCustomizer = reqSpecCustomizer;
        return this;
    }

    /**
     * Delete job by ordinal number.  __Security Roles Allowed:__ JOB_MANAGER_MODULE_ACCESS
     *
     * @see #ordinalNumberPath is unique serial job number. (required)
     * return Boolean
     */
    public static class JobRestServiceV1DELETEDeleteOper implements Oper {

        public static final Method REQ_METHOD = DELETE;
        public static final String REQ_URI = "/dse/rest/v1.0/jobs/{ordinalNumber}";

        private RequestSpecBuilder reqSpec;
        private ResponseSpecBuilder respSpec;

        public JobRestServiceV1DELETEDeleteOper(RequestSpecBuilder reqSpec) {
            this.reqSpec = reqSpec;
            reqSpec.setAccept("application/json");
            this.respSpec = new ResponseSpecBuilder();
        }

        /**
         * DELETE /dse/rest/v1.0/jobs/{ordinalNumber}
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
         * DELETE /dse/rest/v1.0/jobs/{ordinalNumber}
         *
         * @param handler handler
         * @return Boolean
         */
        public Boolean executeAs(Function<Response, Response> handler) {
            TypeRef<Boolean> type = new TypeRef<Boolean>() {
            };
            return execute(handler).as(type);
        }

        public static final String ORDINAL_NUMBER_PATH = "ordinalNumber";

        /**
         * @param ordinalNumber (Integer) is unique serial job number. (required)
         * @return operation
         */
        public JobRestServiceV1DELETEDeleteOper ordinalNumberPath(Object ordinalNumber) {
            reqSpec.addPathParam(ORDINAL_NUMBER_PATH, ordinalNumber);
            return this;
        }

        /**
         * Customize request specification
         *
         * @param reqSpecCustomizer consumer to modify the RequestSpecBuilder
         * @return operation
         */
        public JobRestServiceV1DELETEDeleteOper reqSpec(Consumer<RequestSpecBuilder> reqSpecCustomizer) {
            reqSpecCustomizer.accept(reqSpec);
            return this;
        }

        /**
         * Customize response specification
         *
         * @param respSpecCustomizer consumer to modify the ResponseSpecBuilder
         * @return operation
         */
        public JobRestServiceV1DELETEDeleteOper respSpec(Consumer<ResponseSpecBuilder> respSpecCustomizer) {
            respSpecCustomizer.accept(respSpec);
            return this;
        }
    }

    /**
     * Return job types by id filter.  __Security Roles Allowed:__ JOB_MANAGER_MODULE_ACCESS
     *
     * @see #filterIdPath unique id of dse filter. (required)
     * @see #limitQuery the maximal number of items returned from the result set. Default 20. (optional, default to 20)
     * @see #offsetQuery the offset in the query result set on which the returned body starts. Default 0. (optional, default to 0)
     * return DseObjectTypeDtoWithPaging
     */
    public static class JobRestServiceV1GETFindTypesByFilterIdOper implements Oper {

        public static final Method REQ_METHOD = GET;
        public static final String REQ_URI = "/dse/rest/v1.0/jobs/filters/{filterId}/types";

        private RequestSpecBuilder reqSpec;
        private ResponseSpecBuilder respSpec;

        public JobRestServiceV1GETFindTypesByFilterIdOper(RequestSpecBuilder reqSpec) {
            this.reqSpec = reqSpec;
            reqSpec.setAccept("application/json");
            this.respSpec = new ResponseSpecBuilder();
        }

        /**
         * GET /dse/rest/v1.0/jobs/filters/{filterId}/types
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
         * GET /dse/rest/v1.0/jobs/filters/{filterId}/types
         *
         * @param handler handler
         * @return DseObjectTypeDtoWithPaging
         */
        public DseObjectTypeDtoWithPaging executeAs(Function<Response, Response> handler) {
            TypeRef<DseObjectTypeDtoWithPaging> type = new TypeRef<DseObjectTypeDtoWithPaging>() {
            };
            return execute(handler).as(type);
        }

        public static final String FILTER_ID_PATH = "filterId";

        /**
         * @param filterId (Integer) unique id of dse filter. (required)
         * @return operation
         */
        public JobRestServiceV1GETFindTypesByFilterIdOper filterIdPath(Object filterId) {
            reqSpec.addPathParam(FILTER_ID_PATH, filterId);
            return this;
        }

        public static final String LIMIT_QUERY = "limit";

        /**
         * @param limit (Integer) the maximal number of items returned from the result set. Default 20. (optional, default to 20)
         * @return operation
         */
        public JobRestServiceV1GETFindTypesByFilterIdOper limitQuery(Object... limit) {
            reqSpec.addQueryParam(LIMIT_QUERY, limit);
            return this;
        }

        public static final String OFFSET_QUERY = "offset";

        /**
         * @param offset (Integer) the offset in the query result set on which the returned body starts. Default 0. (optional, default to 0)
         * @return operation
         */
        public JobRestServiceV1GETFindTypesByFilterIdOper offsetQuery(Object... offset) {
            reqSpec.addQueryParam(OFFSET_QUERY, offset);
            return this;
        }

        /**
         * Customize request specification
         *
         * @param reqSpecCustomizer consumer to modify the RequestSpecBuilder
         * @return operation
         */
        public JobRestServiceV1GETFindTypesByFilterIdOper reqSpec(Consumer<RequestSpecBuilder> reqSpecCustomizer) {
            reqSpecCustomizer.accept(reqSpec);
            return this;
        }

        /**
         * Customize response specification
         *
         * @param respSpecCustomizer consumer to modify the ResponseSpecBuilder
         * @return operation
         */
        public JobRestServiceV1GETFindTypesByFilterIdOper respSpec(Consumer<ResponseSpecBuilder> respSpecCustomizer) {
            respSpecCustomizer.accept(respSpec);
            return this;
        }
    }

    /**
     * Return Job.  __Security Roles Allowed:__ JOB_MANAGER_MODULE_ACCESS
     *
     * @see #ordinalNumberPath is unique serial job number. (required)
     * return DseObjectDto
     */
    public static class JobRestServiceV1GETGetOper implements Oper {

        public static final Method REQ_METHOD = GET;
        public static final String REQ_URI = "/dse/rest/v1.0/jobs/{ordinalNumber}";

        private RequestSpecBuilder reqSpec;
        private ResponseSpecBuilder respSpec;

        public JobRestServiceV1GETGetOper(RequestSpecBuilder reqSpec) {
            this.reqSpec = reqSpec;
            reqSpec.setAccept("application/json");
            this.respSpec = new ResponseSpecBuilder();
        }

        /**
         * GET /dse/rest/v1.0/jobs/{ordinalNumber}
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
         * GET /dse/rest/v1.0/jobs/{ordinalNumber}
         *
         * @param handler handler
         * @return DseObjectDto
         */
        public DseObjectDto executeAs(Function<Response, Response> handler) {
            TypeRef<DseObjectDto> type = new TypeRef<DseObjectDto>() {
            };
            return execute(handler).as(type);
        }

        public static final String ORDINAL_NUMBER_PATH = "ordinalNumber";

        /**
         * @param ordinalNumber (Integer) is unique serial job number. (required)
         * @return operation
         */
        public JobRestServiceV1GETGetOper ordinalNumberPath(Object ordinalNumber) {
            reqSpec.addPathParam(ORDINAL_NUMBER_PATH, ordinalNumber);
            return this;
        }

        /**
         * Customize request specification
         *
         * @param reqSpecCustomizer consumer to modify the RequestSpecBuilder
         * @return operation
         */
        public JobRestServiceV1GETGetOper reqSpec(Consumer<RequestSpecBuilder> reqSpecCustomizer) {
            reqSpecCustomizer.accept(reqSpec);
            return this;
        }

        /**
         * Customize response specification
         *
         * @param respSpecCustomizer consumer to modify the ResponseSpecBuilder
         * @return operation
         */
        public JobRestServiceV1GETGetOper respSpec(Consumer<ResponseSpecBuilder> respSpecCustomizer) {
            respSpecCustomizer.accept(respSpec);
            return this;
        }
    }

    /**
     * Returns only ids of Job.  __Security Roles Allowed:__ JOB_MANAGER_MODULE_ACCESS
     *
     * @see #ordinalNumberPath is unique serial job number. (required)
     * return JobIdsDto
     */
    public static class JobRestServiceV1GETGetIdsOper implements Oper {

        public static final Method REQ_METHOD = GET;
        public static final String REQ_URI = "/dse/rest/v1.0/jobs/{ordinalNumber}/ids";

        private RequestSpecBuilder reqSpec;
        private ResponseSpecBuilder respSpec;

        public JobRestServiceV1GETGetIdsOper(RequestSpecBuilder reqSpec) {
            this.reqSpec = reqSpec;
            reqSpec.setAccept("application/json");
            this.respSpec = new ResponseSpecBuilder();
        }

        /**
         * GET /dse/rest/v1.0/jobs/{ordinalNumber}/ids
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
         * GET /dse/rest/v1.0/jobs/{ordinalNumber}/ids
         *
         * @param handler handler
         * @return JobIdsDto
         */
        public JobIdsDto executeAs(Function<Response, Response> handler) {
            TypeRef<JobIdsDto> type = new TypeRef<JobIdsDto>() {
            };
            return execute(handler).as(type);
        }

        public static final String ORDINAL_NUMBER_PATH = "ordinalNumber";

        /**
         * @param ordinalNumber (Integer) is unique serial job number. (required)
         * @return operation
         */
        public JobRestServiceV1GETGetIdsOper ordinalNumberPath(Object ordinalNumber) {
            reqSpec.addPathParam(ORDINAL_NUMBER_PATH, ordinalNumber);
            return this;
        }

        /**
         * Customize request specification
         *
         * @param reqSpecCustomizer consumer to modify the RequestSpecBuilder
         * @return operation
         */
        public JobRestServiceV1GETGetIdsOper reqSpec(Consumer<RequestSpecBuilder> reqSpecCustomizer) {
            reqSpecCustomizer.accept(reqSpec);
            return this;
        }

        /**
         * Customize response specification
         *
         * @param respSpecCustomizer consumer to modify the ResponseSpecBuilder
         * @return operation
         */
        public JobRestServiceV1GETGetIdsOper respSpec(Consumer<ResponseSpecBuilder> respSpecCustomizer) {
            respSpecCustomizer.accept(respSpec);
            return this;
        }
    }

    /**
     * Returns ids sub jobs by parent ordinal number.  __Security Roles Allowed:__ JOB_MANAGER_MODULE_ACCESS
     *
     * @see #ordinalNumberPath is unique serial job number. (required)
     * @see #limitQuery the maximal number of items returned from the result set. Default 20. (optional, default to 20)
     * @see #offsetQuery the offset in the query result set on which the returned body starts. Default 0. (optional, default to 0)
     * @see #stateQuery ACTIVE, CANCELED, DELETED, FINISHED. (optional)
     * return PagingWrapperDtoOfJobIdsDto
     */
    public static class JobRestServiceV1GETGetSubJobIdsOper implements Oper {

        public static final Method REQ_METHOD = GET;
        public static final String REQ_URI = "/dse/rest/v1.0/jobs/{ordinalNumber}/subjobs/ids";

        private RequestSpecBuilder reqSpec;
        private ResponseSpecBuilder respSpec;

        public JobRestServiceV1GETGetSubJobIdsOper(RequestSpecBuilder reqSpec) {
            this.reqSpec = reqSpec;
            reqSpec.setAccept("application/json");
            this.respSpec = new ResponseSpecBuilder();
        }

        /**
         * GET /dse/rest/v1.0/jobs/{ordinalNumber}/subjobs/ids
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
         * GET /dse/rest/v1.0/jobs/{ordinalNumber}/subjobs/ids
         *
         * @param handler handler
         * @return PagingWrapperDtoOfJobIdsDto
         */
        public PagingWrapperDtoOfJobIdsDto executeAs(Function<Response, Response> handler) {
            TypeRef<PagingWrapperDtoOfJobIdsDto> type = new TypeRef<PagingWrapperDtoOfJobIdsDto>() {
            };
            return execute(handler).as(type);
        }

        public static final String ORDINAL_NUMBER_PATH = "ordinalNumber";

        /**
         * @param ordinalNumber (Integer) is unique serial job number. (required)
         * @return operation
         */
        public JobRestServiceV1GETGetSubJobIdsOper ordinalNumberPath(Object ordinalNumber) {
            reqSpec.addPathParam(ORDINAL_NUMBER_PATH, ordinalNumber);
            return this;
        }

        public static final String LIMIT_QUERY = "limit";

        /**
         * @param limit (Integer) the maximal number of items returned from the result set. Default 20. (optional, default to 20)
         * @return operation
         */
        public JobRestServiceV1GETGetSubJobIdsOper limitQuery(Object... limit) {
            reqSpec.addQueryParam(LIMIT_QUERY, limit);
            return this;
        }

        public static final String OFFSET_QUERY = "offset";

        /**
         * @param offset (Integer) the offset in the query result set on which the returned body starts. Default 0. (optional, default to 0)
         * @return operation
         */
        public JobRestServiceV1GETGetSubJobIdsOper offsetQuery(Object... offset) {
            reqSpec.addQueryParam(OFFSET_QUERY, offset);
            return this;
        }

        public static final String STATE_QUERY = "state";

        /**
         * @param state (List&lt;String&gt;) ACTIVE, CANCELED, DELETED, FINISHED. (optional)
         * @return operation
         */
        public JobRestServiceV1GETGetSubJobIdsOper stateQuery(Object... state) {
            reqSpec.addQueryParam(STATE_QUERY, state);
            return this;
        }

        /**
         * Customize request specification
         *
         * @param reqSpecCustomizer consumer to modify the RequestSpecBuilder
         * @return operation
         */
        public JobRestServiceV1GETGetSubJobIdsOper reqSpec(Consumer<RequestSpecBuilder> reqSpecCustomizer) {
            reqSpecCustomizer.accept(reqSpec);
            return this;
        }

        /**
         * Customize response specification
         *
         * @param respSpecCustomizer consumer to modify the ResponseSpecBuilder
         * @return operation
         */
        public JobRestServiceV1GETGetSubJobIdsOper respSpec(Consumer<ResponseSpecBuilder> respSpecCustomizer) {
            respSpecCustomizer.accept(respSpec);
            return this;
        }
    }

    /**
     * Returns sub jobs by parent ordinal number.  __Security Roles Allowed:__ JOB_MANAGER_MODULE_ACCESS
     *
     * @see #ordinalNumberPath is unique serial job number. (required)
     * @see #limitQuery the maximal number of items returned from the result set. Default 20. (optional, default to 20)
     * @see #offsetQuery the offset in the query result set on which the returned body starts. Default 0. (optional, default to 0)
     * @see #stateQuery ACTIVE, CANCELED, DELETED, FINISHED. (optional)
     * return PagingWrapperDtoOfDseObjectDto
     */
    public static class JobRestServiceV1GETGetSubJobsOper implements Oper {

        public static final Method REQ_METHOD = GET;
        public static final String REQ_URI = "/dse/rest/v1.0/jobs/{ordinalNumber}/subjobs";

        private RequestSpecBuilder reqSpec;
        private ResponseSpecBuilder respSpec;

        public JobRestServiceV1GETGetSubJobsOper(RequestSpecBuilder reqSpec) {
            this.reqSpec = reqSpec;
            reqSpec.setAccept("application/json");
            this.respSpec = new ResponseSpecBuilder();
        }

        /**
         * GET /dse/rest/v1.0/jobs/{ordinalNumber}/subjobs
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
         * GET /dse/rest/v1.0/jobs/{ordinalNumber}/subjobs
         *
         * @param handler handler
         * @return PagingWrapperDtoOfDseObjectDto
         */
        public PagingWrapperDtoOfDseObjectDto executeAs(Function<Response, Response> handler) {
            TypeRef<PagingWrapperDtoOfDseObjectDto> type = new TypeRef<PagingWrapperDtoOfDseObjectDto>() {
            };
            return execute(handler).as(type);
        }

        public static final String ORDINAL_NUMBER_PATH = "ordinalNumber";

        /**
         * @param ordinalNumber (Integer) is unique serial job number. (required)
         * @return operation
         */
        public JobRestServiceV1GETGetSubJobsOper ordinalNumberPath(Object ordinalNumber) {
            reqSpec.addPathParam(ORDINAL_NUMBER_PATH, ordinalNumber);
            return this;
        }

        public static final String LIMIT_QUERY = "limit";

        /**
         * @param limit (Integer) the maximal number of items returned from the result set. Default 20. (optional, default to 20)
         * @return operation
         */
        public JobRestServiceV1GETGetSubJobsOper limitQuery(Object... limit) {
            reqSpec.addQueryParam(LIMIT_QUERY, limit);
            return this;
        }

        public static final String OFFSET_QUERY = "offset";

        /**
         * @param offset (Integer) the offset in the query result set on which the returned body starts. Default 0. (optional, default to 0)
         * @return operation
         */
        public JobRestServiceV1GETGetSubJobsOper offsetQuery(Object... offset) {
            reqSpec.addQueryParam(OFFSET_QUERY, offset);
            return this;
        }

        public static final String STATE_QUERY = "state";

        /**
         * @param state (List&lt;String&gt;) ACTIVE, CANCELED, DELETED, FINISHED. (optional)
         * @return operation
         */
        public JobRestServiceV1GETGetSubJobsOper stateQuery(Object... state) {
            reqSpec.addQueryParam(STATE_QUERY, state);
            return this;
        }

        /**
         * Customize request specification
         *
         * @param reqSpecCustomizer consumer to modify the RequestSpecBuilder
         * @return operation
         */
        public JobRestServiceV1GETGetSubJobsOper reqSpec(Consumer<RequestSpecBuilder> reqSpecCustomizer) {
            reqSpecCustomizer.accept(reqSpec);
            return this;
        }

        /**
         * Customize response specification
         *
         * @param respSpecCustomizer consumer to modify the ResponseSpecBuilder
         * @return operation
         */
        public JobRestServiceV1GETGetSubJobsOper respSpec(Consumer<ResponseSpecBuilder> respSpecCustomizer) {
            respSpecCustomizer.accept(respSpec);
            return this;
        }
    }

    /**
     * Returns job workflow.  __Security Roles Allowed:__ JOB_MANAGER_MODULE_ACCESS
     *
     * @see #ordinalNumberPath is unique serial job number. (required)
     * return WorkflowDto
     */
    public static class JobRestServiceV1GETGetWorkflowOper implements Oper {

        public static final Method REQ_METHOD = GET;
        public static final String REQ_URI = "/dse/rest/v1.0/jobs/{ordinalNumber}/workflow";

        private RequestSpecBuilder reqSpec;
        private ResponseSpecBuilder respSpec;

        public JobRestServiceV1GETGetWorkflowOper(RequestSpecBuilder reqSpec) {
            this.reqSpec = reqSpec;
            reqSpec.setAccept("application/json");
            this.respSpec = new ResponseSpecBuilder();
        }

        /**
         * GET /dse/rest/v1.0/jobs/{ordinalNumber}/workflow
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
         * GET /dse/rest/v1.0/jobs/{ordinalNumber}/workflow
         *
         * @param handler handler
         * @return WorkflowDto
         */
        public WorkflowDto executeAs(Function<Response, Response> handler) {
            TypeRef<WorkflowDto> type = new TypeRef<WorkflowDto>() {
            };
            return execute(handler).as(type);
        }

        public static final String ORDINAL_NUMBER_PATH = "ordinalNumber";

        /**
         * @param ordinalNumber (Integer) is unique serial job number. (required)
         * @return operation
         */
        public JobRestServiceV1GETGetWorkflowOper ordinalNumberPath(Object ordinalNumber) {
            reqSpec.addPathParam(ORDINAL_NUMBER_PATH, ordinalNumber);
            return this;
        }

        /**
         * Customize request specification
         *
         * @param reqSpecCustomizer consumer to modify the RequestSpecBuilder
         * @return operation
         */
        public JobRestServiceV1GETGetWorkflowOper reqSpec(Consumer<RequestSpecBuilder> reqSpecCustomizer) {
            reqSpecCustomizer.accept(reqSpec);
            return this;
        }

        /**
         * Customize response specification
         *
         * @param respSpecCustomizer consumer to modify the ResponseSpecBuilder
         * @return operation
         */
        public JobRestServiceV1GETGetWorkflowOper respSpec(Consumer<ResponseSpecBuilder> respSpecCustomizer) {
            respSpecCustomizer.accept(respSpec);
            return this;
        }
    }

    /**
     * The method change an assignee on the current step of the workflow of the job given. New assigneeID is passed as parameter, userGroupId is needed as an identifier of the userGroup. In case it&#39;s been missed the system will take userGroupId as a AREA_ID from WorkflowStepTemplate of the current Workflow Step. There is a parameter comment provided, that will appear in Job Discussion When user wants to set assignee as a group one should send an empty assigneeId field. If at the particular step has individual assignment only sending an empty assigneeId will lead to having current user as assignee  __Security Roles Allowed:__ JOB_MANAGER_MODULE_ACCESS
     *
     * @see #ordinalNumberPath is unique serial job number. (required)
     * @see #body  (optional)
     * return ProcessWorkflowDto
     */
    public static class JobRestServiceV1POSTAssignOper implements Oper {

        public static final Method REQ_METHOD = POST;
        public static final String REQ_URI = "/dse/rest/v1.0/jobs/{ordinalNumber}/_assign";

        private RequestSpecBuilder reqSpec;
        private ResponseSpecBuilder respSpec;

        public JobRestServiceV1POSTAssignOper(RequestSpecBuilder reqSpec) {
            this.reqSpec = reqSpec;
            reqSpec.setContentType("application/json");
            reqSpec.setAccept("application/json");
            this.respSpec = new ResponseSpecBuilder();
        }

        /**
         * POST /dse/rest/v1.0/jobs/{ordinalNumber}/_assign
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
         * POST /dse/rest/v1.0/jobs/{ordinalNumber}/_assign
         *
         * @param handler handler
         * @return ProcessWorkflowDto
         */
        public ProcessWorkflowDto executeAs(Function<Response, Response> handler) {
            TypeRef<ProcessWorkflowDto> type = new TypeRef<ProcessWorkflowDto>() {
            };
            return execute(handler).as(type);
        }

        /**
         * @param moveWorkflowParamDto (MoveWorkflowParamDto)  (optional)
         * @return operation
         */
        public JobRestServiceV1POSTAssignOper body(MoveWorkflowParamDto moveWorkflowParamDto) {
            reqSpec.setBody(moveWorkflowParamDto);
            return this;
        }

        public static final String ORDINAL_NUMBER_PATH = "ordinalNumber";

        /**
         * @param ordinalNumber (Integer) is unique serial job number. (required)
         * @return operation
         */
        public JobRestServiceV1POSTAssignOper ordinalNumberPath(Object ordinalNumber) {
            reqSpec.addPathParam(ORDINAL_NUMBER_PATH, ordinalNumber);
            return this;
        }

        /**
         * Customize request specification
         *
         * @param reqSpecCustomizer consumer to modify the RequestSpecBuilder
         * @return operation
         */
        public JobRestServiceV1POSTAssignOper reqSpec(Consumer<RequestSpecBuilder> reqSpecCustomizer) {
            reqSpecCustomizer.accept(reqSpec);
            return this;
        }

        /**
         * Customize response specification
         *
         * @param respSpecCustomizer consumer to modify the ResponseSpecBuilder
         * @return operation
         */
        public JobRestServiceV1POSTAssignOper respSpec(Consumer<ResponseSpecBuilder> respSpecCustomizer) {
            respSpecCustomizer.accept(respSpec);
            return this;
        }
    }

    /**
     * Cancel job by ordinal number.  __Security Roles Allowed:__ JOB_MANAGER_MODULE_ACCESS
     *
     * @see #ordinalNumberPath is unique serial job number. (required)
     * return Boolean
     */
    public static class JobRestServiceV1POSTCancelOper implements Oper {

        public static final Method REQ_METHOD = POST;
        public static final String REQ_URI = "/dse/rest/v1.0/jobs/{ordinalNumber}/_cancel";

        private RequestSpecBuilder reqSpec;
        private ResponseSpecBuilder respSpec;

        public JobRestServiceV1POSTCancelOper(RequestSpecBuilder reqSpec) {
            this.reqSpec = reqSpec;
            reqSpec.setAccept("application/json");
            this.respSpec = new ResponseSpecBuilder();
        }

        /**
         * POST /dse/rest/v1.0/jobs/{ordinalNumber}/_cancel
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
         * POST /dse/rest/v1.0/jobs/{ordinalNumber}/_cancel
         *
         * @param handler handler
         * @return Boolean
         */
        public Boolean executeAs(Function<Response, Response> handler) {
            TypeRef<Boolean> type = new TypeRef<Boolean>() {
            };
            return execute(handler).as(type);
        }

        public static final String ORDINAL_NUMBER_PATH = "ordinalNumber";

        /**
         * @param ordinalNumber (Integer) is unique serial job number. (required)
         * @return operation
         */
        public JobRestServiceV1POSTCancelOper ordinalNumberPath(Object ordinalNumber) {
            reqSpec.addPathParam(ORDINAL_NUMBER_PATH, ordinalNumber);
            return this;
        }

        /**
         * Customize request specification
         *
         * @param reqSpecCustomizer consumer to modify the RequestSpecBuilder
         * @return operation
         */
        public JobRestServiceV1POSTCancelOper reqSpec(Consumer<RequestSpecBuilder> reqSpecCustomizer) {
            reqSpecCustomizer.accept(reqSpec);
            return this;
        }

        /**
         * Customize response specification
         *
         * @param respSpecCustomizer consumer to modify the ResponseSpecBuilder
         * @return operation
         */
        public JobRestServiceV1POSTCancelOper respSpec(Consumer<ResponseSpecBuilder> respSpecCustomizer) {
            respSpecCustomizer.accept(respSpec);
            return this;
        }
    }

    /**
     * Cancel sub jobs by parent&#39;s ordinal number  __Security Roles Allowed:__ JOB_MANAGER_MODULE_ACCESS
     *
     * @see #ordinalNumberPath ordinal number of parent object (required)
     */
    public static class JobRestServiceV1POSTCancelSubJobsOper implements Oper {

        public static final Method REQ_METHOD = POST;
        public static final String REQ_URI = "/dse/rest/v1.0/jobs/{ordinalNumber}/subjobs/_cancel";

        private RequestSpecBuilder reqSpec;
        private ResponseSpecBuilder respSpec;

        public JobRestServiceV1POSTCancelSubJobsOper(RequestSpecBuilder reqSpec) {
            this.reqSpec = reqSpec;
            reqSpec.setAccept("application/json");
            this.respSpec = new ResponseSpecBuilder();
        }

        /**
         * POST /dse/rest/v1.0/jobs/{ordinalNumber}/subjobs/_cancel
         *
         * @param handler handler
         * @param <T>     type
         * @return type
         */
        @Override
        public <T> T execute(Function<Response, T> handler) {
            return handler.apply(RestAssured.given().spec(reqSpec.build()).expect().spec(respSpec.build()).when().request(REQ_METHOD, REQ_URI));
        }

        public static final String ORDINAL_NUMBER_PATH = "ordinalNumber";

        /**
         * @param ordinalNumber (Integer) ordinal number of parent object (required)
         * @return operation
         */
        public JobRestServiceV1POSTCancelSubJobsOper ordinalNumberPath(Object ordinalNumber) {
            reqSpec.addPathParam(ORDINAL_NUMBER_PATH, ordinalNumber);
            return this;
        }

        /**
         * Customize request specification
         *
         * @param reqSpecCustomizer consumer to modify the RequestSpecBuilder
         * @return operation
         */
        public JobRestServiceV1POSTCancelSubJobsOper reqSpec(Consumer<RequestSpecBuilder> reqSpecCustomizer) {
            reqSpecCustomizer.accept(reqSpec);
            return this;
        }

        /**
         * Customize response specification
         *
         * @param respSpecCustomizer consumer to modify the ResponseSpecBuilder
         * @return operation
         */
        public JobRestServiceV1POSTCancelSubJobsOper respSpec(Consumer<ResponseSpecBuilder> respSpecCustomizer) {
            respSpecCustomizer.accept(respSpec);
            return this;
        }
    }

    /**
     * __Security Roles Allowed:__ JOB_MANAGER_MODULE_ACCESS
     *
     * @see #ordinalNumberPath  (required)
     * @see #dataSheetIdsForm  (optional)
     * @see #nameForm  (optional)
     * return DseObjectUpdateResultDto
     */
    public static class JobRestServiceV1POSTCopyOper implements Oper {

        public static final Method REQ_METHOD = POST;
        public static final String REQ_URI = "/dse/rest/v1.0/jobs/{ordinalNumber}/_copy";

        private RequestSpecBuilder reqSpec;
        private ResponseSpecBuilder respSpec;

        public JobRestServiceV1POSTCopyOper(RequestSpecBuilder reqSpec) {
            this.reqSpec = reqSpec;
            reqSpec.setContentType("application/x-www-form-urlencoded");
            reqSpec.setAccept("application/json");
            this.respSpec = new ResponseSpecBuilder();
        }

        /**
         * POST /dse/rest/v1.0/jobs/{ordinalNumber}/_copy
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
         * POST /dse/rest/v1.0/jobs/{ordinalNumber}/_copy
         *
         * @param handler handler
         * @return DseObjectUpdateResultDto
         */
        public DseObjectUpdateResultDto executeAs(Function<Response, Response> handler) {
            TypeRef<DseObjectUpdateResultDto> type = new TypeRef<DseObjectUpdateResultDto>() {
            };
            return execute(handler).as(type);
        }

        public static final String ORDINAL_NUMBER_PATH = "ordinalNumber";

        /**
         * @param ordinalNumber (Integer)  (required)
         * @return operation
         */
        public JobRestServiceV1POSTCopyOper ordinalNumberPath(Object ordinalNumber) {
            reqSpec.addPathParam(ORDINAL_NUMBER_PATH, ordinalNumber);
            return this;
        }

        public static final String DATA_SHEET_IDS_FORM = "dataSheetIds";

        /**
         * @param dataSheetIds (List&lt;String&gt;)  (optional)
         * @return operation
         */
        public JobRestServiceV1POSTCopyOper dataSheetIdsForm(Object... dataSheetIds) {
            reqSpec.addFormParam(DATA_SHEET_IDS_FORM, dataSheetIds);
            return this;
        }

        public static final String NAME_FORM = "name";

        /**
         * @param name (String)  (optional)
         * @return operation
         */
        public JobRestServiceV1POSTCopyOper nameForm(Object... name) {
            reqSpec.addFormParam(NAME_FORM, name);
            return this;
        }

        /**
         * Customize request specification
         *
         * @param reqSpecCustomizer consumer to modify the RequestSpecBuilder
         * @return operation
         */
        public JobRestServiceV1POSTCopyOper reqSpec(Consumer<RequestSpecBuilder> reqSpecCustomizer) {
            reqSpecCustomizer.accept(reqSpec);
            return this;
        }

        /**
         * Customize response specification
         *
         * @param respSpecCustomizer consumer to modify the ResponseSpecBuilder
         * @return operation
         */
        public JobRestServiceV1POSTCopyOper respSpec(Consumer<ResponseSpecBuilder> respSpecCustomizer) {
            respSpecCustomizer.accept(respSpec);
            return this;
        }
    }

    /**
     * Create Job.  __Security Roles Allowed:__ JOB_MANAGER_MODULE_ACCESS
     *
     * @see #body dto for creating new job. (optional)
     * return DseObjectDto
     */
    public static class JobRestServiceV1POSTCreateJobOper implements Oper {

        public static final Method REQ_METHOD = POST;
        public static final String REQ_URI = "/dse/rest/v1.0/jobs";

        private RequestSpecBuilder reqSpec;
        private ResponseSpecBuilder respSpec;

        public JobRestServiceV1POSTCreateJobOper(RequestSpecBuilder reqSpec) {
            this.reqSpec = reqSpec;
            reqSpec.setContentType("application/json");
            reqSpec.setAccept("application/json");
            this.respSpec = new ResponseSpecBuilder();
        }

        /**
         * POST /dse/rest/v1.0/jobs
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
         * POST /dse/rest/v1.0/jobs
         *
         * @param handler handler
         * @return DseObjectDto
         */
        public DseObjectDto executeAs(Function<Response, Response> handler) {
            TypeRef<DseObjectDto> type = new TypeRef<DseObjectDto>() {
            };
            return execute(handler).as(type);
        }

        /**
         * @param jobCreateDto (JobCreateDto) dto for creating new job. (optional)
         * @return operation
         */
        public JobRestServiceV1POSTCreateJobOper body(JobCreateDto jobCreateDto) {
            reqSpec.setBody(jobCreateDto);
            return this;
        }

        /**
         * Customize request specification
         *
         * @param reqSpecCustomizer consumer to modify the RequestSpecBuilder
         * @return operation
         */
        public JobRestServiceV1POSTCreateJobOper reqSpec(Consumer<RequestSpecBuilder> reqSpecCustomizer) {
            reqSpecCustomizer.accept(reqSpec);
            return this;
        }

        /**
         * Customize response specification
         *
         * @param respSpecCustomizer consumer to modify the ResponseSpecBuilder
         * @return operation
         */
        public JobRestServiceV1POSTCreateJobOper respSpec(Consumer<ResponseSpecBuilder> respSpecCustomizer) {
            respSpecCustomizer.accept(respSpec);
            return this;
        }
    }

    /**
     * Delete sub jobs by parent&#39;s ordinal number  __Security Roles Allowed:__ JOB_MANAGER_MODULE_ACCESS
     *
     * @see #ordinalNumberPath ordinal number of parent object (required)
     */
    public static class JobRestServiceV1POSTDeleteSubJobsOper implements Oper {

        public static final Method REQ_METHOD = POST;
        public static final String REQ_URI = "/dse/rest/v1.0/jobs/{ordinalNumber}/subjobs/_delete";

        private RequestSpecBuilder reqSpec;
        private ResponseSpecBuilder respSpec;

        public JobRestServiceV1POSTDeleteSubJobsOper(RequestSpecBuilder reqSpec) {
            this.reqSpec = reqSpec;
            reqSpec.setAccept("application/json");
            this.respSpec = new ResponseSpecBuilder();
        }

        /**
         * POST /dse/rest/v1.0/jobs/{ordinalNumber}/subjobs/_delete
         *
         * @param handler handler
         * @param <T>     type
         * @return type
         */
        @Override
        public <T> T execute(Function<Response, T> handler) {
            return handler.apply(RestAssured.given().spec(reqSpec.build()).expect().spec(respSpec.build()).when().request(REQ_METHOD, REQ_URI));
        }

        public static final String ORDINAL_NUMBER_PATH = "ordinalNumber";

        /**
         * @param ordinalNumber (Integer) ordinal number of parent object (required)
         * @return operation
         */
        public JobRestServiceV1POSTDeleteSubJobsOper ordinalNumberPath(Object ordinalNumber) {
            reqSpec.addPathParam(ORDINAL_NUMBER_PATH, ordinalNumber);
            return this;
        }

        /**
         * Customize request specification
         *
         * @param reqSpecCustomizer consumer to modify the RequestSpecBuilder
         * @return operation
         */
        public JobRestServiceV1POSTDeleteSubJobsOper reqSpec(Consumer<RequestSpecBuilder> reqSpecCustomizer) {
            reqSpecCustomizer.accept(reqSpec);
            return this;
        }

        /**
         * Customize response specification
         *
         * @param respSpecCustomizer consumer to modify the ResponseSpecBuilder
         * @return operation
         */
        public JobRestServiceV1POSTDeleteSubJobsOper respSpec(Consumer<ResponseSpecBuilder> respSpecCustomizer) {
            respSpecCustomizer.accept(respSpec);
            return this;
        }
    }

    /**
     * This method finishes job by ordinal number. Jobs is finished only at last step of workflow.  __Security Roles Allowed:__ JOB_MANAGER_MODULE_ACCESS
     *
     * @see #ordinalNumberPath is unique serial job number (required)
     * @see #body DTO for finish workflow (optional)
     * return ProcessWorkflowDto
     */
    public static class JobRestServiceV1POSTFinishOper implements Oper {

        public static final Method REQ_METHOD = POST;
        public static final String REQ_URI = "/dse/rest/v1.0/jobs/{ordinalNumber}/_finish";

        private RequestSpecBuilder reqSpec;
        private ResponseSpecBuilder respSpec;

        public JobRestServiceV1POSTFinishOper(RequestSpecBuilder reqSpec) {
            this.reqSpec = reqSpec;
            reqSpec.setContentType("application/json");
            reqSpec.setAccept("application/json");
            this.respSpec = new ResponseSpecBuilder();
        }

        /**
         * POST /dse/rest/v1.0/jobs/{ordinalNumber}/_finish
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
         * POST /dse/rest/v1.0/jobs/{ordinalNumber}/_finish
         *
         * @param handler handler
         * @return ProcessWorkflowDto
         */
        public ProcessWorkflowDto executeAs(Function<Response, Response> handler) {
            TypeRef<ProcessWorkflowDto> type = new TypeRef<ProcessWorkflowDto>() {
            };
            return execute(handler).as(type);
        }

        /**
         * @param finishWorkflowParamDto (FinishWorkflowParamDto) DTO for finish workflow (optional)
         * @return operation
         */
        public JobRestServiceV1POSTFinishOper body(FinishWorkflowParamDto finishWorkflowParamDto) {
            reqSpec.setBody(finishWorkflowParamDto);
            return this;
        }

        public static final String ORDINAL_NUMBER_PATH = "ordinalNumber";

        /**
         * @param ordinalNumber (Integer) is unique serial job number (required)
         * @return operation
         */
        public JobRestServiceV1POSTFinishOper ordinalNumberPath(Object ordinalNumber) {
            reqSpec.addPathParam(ORDINAL_NUMBER_PATH, ordinalNumber);
            return this;
        }

        /**
         * Customize request specification
         *
         * @param reqSpecCustomizer consumer to modify the RequestSpecBuilder
         * @return operation
         */
        public JobRestServiceV1POSTFinishOper reqSpec(Consumer<RequestSpecBuilder> reqSpecCustomizer) {
            reqSpecCustomizer.accept(reqSpec);
            return this;
        }

        /**
         * Customize response specification
         *
         * @param respSpecCustomizer consumer to modify the ResponseSpecBuilder
         * @return operation
         */
        public JobRestServiceV1POSTFinishOper respSpec(Consumer<ResponseSpecBuilder> respSpecCustomizer) {
            respSpecCustomizer.accept(respSpec);
            return this;
        }
    }

    /**
     * The method moves a job by ordinal number to the next step or finish it if the last step has been already reached. For the next workflow step assigneeID is passed as parameter There is a parameter comment provided, that will appear in Job Discussion When user wants to set assignee as a group one should send an empty assigneeId field. If at the particular step has individual assignment only sending an empty assigneeId will lead to having current user as assignee  __Security Roles Allowed:__ JOB_MANAGER_MODULE_ACCESS
     *
     * @see #ordinalNumberPath is unique serial job number. (required)
     * @see #body  (optional)
     * return ProcessWorkflowDto
     */
    public static class JobRestServiceV1POSTForwardOper implements Oper {

        public static final Method REQ_METHOD = POST;
        public static final String REQ_URI = "/dse/rest/v1.0/jobs/{ordinalNumber}/_forward";

        private RequestSpecBuilder reqSpec;
        private ResponseSpecBuilder respSpec;

        public JobRestServiceV1POSTForwardOper(RequestSpecBuilder reqSpec) {
            this.reqSpec = reqSpec;
            reqSpec.setContentType("application/json");
            reqSpec.setAccept("application/json");
            this.respSpec = new ResponseSpecBuilder();
        }

        /**
         * POST /dse/rest/v1.0/jobs/{ordinalNumber}/_forward
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
         * POST /dse/rest/v1.0/jobs/{ordinalNumber}/_forward
         *
         * @param handler handler
         * @return ProcessWorkflowDto
         */
        public ProcessWorkflowDto executeAs(Function<Response, Response> handler) {
            TypeRef<ProcessWorkflowDto> type = new TypeRef<ProcessWorkflowDto>() {
            };
            return execute(handler).as(type);
        }

        /**
         * @param moveWorkflowParamDto (MoveWorkflowParamDto)  (optional)
         * @return operation
         */
        public JobRestServiceV1POSTForwardOper body(MoveWorkflowParamDto moveWorkflowParamDto) {
            reqSpec.setBody(moveWorkflowParamDto);
            return this;
        }

        public static final String ORDINAL_NUMBER_PATH = "ordinalNumber";

        /**
         * @param ordinalNumber (Integer) is unique serial job number. (required)
         * @return operation
         */
        public JobRestServiceV1POSTForwardOper ordinalNumberPath(Object ordinalNumber) {
            reqSpec.addPathParam(ORDINAL_NUMBER_PATH, ordinalNumber);
            return this;
        }

        /**
         * Customize request specification
         *
         * @param reqSpecCustomizer consumer to modify the RequestSpecBuilder
         * @return operation
         */
        public JobRestServiceV1POSTForwardOper reqSpec(Consumer<RequestSpecBuilder> reqSpecCustomizer) {
            reqSpecCustomizer.accept(reqSpec);
            return this;
        }

        /**
         * Customize response specification
         *
         * @param respSpecCustomizer consumer to modify the ResponseSpecBuilder
         * @return operation
         */
        public JobRestServiceV1POSTForwardOper respSpec(Consumer<ResponseSpecBuilder> respSpecCustomizer) {
            respSpecCustomizer.accept(respSpec);
            return this;
        }
    }

    /**
     * The method moves a job by ordinal number to the next step or finish it if the last step has been already reached. For the next workflow step users are assigned from predefined or already existed job assignees in case when they exist in required user groups.  __Security Roles Allowed:__ JOB_MANAGER_MODULE_ACCESS
     *
     * @see #ordinalNumberPath is unique serial job number. (required)
     * @see #commentForm  (optional)
     * return ProcessWorkflowDto
     */
    public static class JobRestServiceV1POSTForwardDefaultOper implements Oper {

        public static final Method REQ_METHOD = POST;
        public static final String REQ_URI = "/dse/rest/v1.0/jobs/{ordinalNumber}/_forward-default";

        private RequestSpecBuilder reqSpec;
        private ResponseSpecBuilder respSpec;

        public JobRestServiceV1POSTForwardDefaultOper(RequestSpecBuilder reqSpec) {
            this.reqSpec = reqSpec;
            reqSpec.setContentType("application/x-www-form-urlencoded");
            reqSpec.setAccept("application/json");
            this.respSpec = new ResponseSpecBuilder();
        }

        /**
         * POST /dse/rest/v1.0/jobs/{ordinalNumber}/_forward-default
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
         * POST /dse/rest/v1.0/jobs/{ordinalNumber}/_forward-default
         *
         * @param handler handler
         * @return ProcessWorkflowDto
         */
        public ProcessWorkflowDto executeAs(Function<Response, Response> handler) {
            TypeRef<ProcessWorkflowDto> type = new TypeRef<ProcessWorkflowDto>() {
            };
            return execute(handler).as(type);
        }

        public static final String ORDINAL_NUMBER_PATH = "ordinalNumber";

        /**
         * @param ordinalNumber (Integer) is unique serial job number. (required)
         * @return operation
         */
        public JobRestServiceV1POSTForwardDefaultOper ordinalNumberPath(Object ordinalNumber) {
            reqSpec.addPathParam(ORDINAL_NUMBER_PATH, ordinalNumber);
            return this;
        }

        public static final String COMMENT_FORM = "comment";

        /**
         * @param comment (String)  (optional)
         * @return operation
         */
        public JobRestServiceV1POSTForwardDefaultOper commentForm(Object... comment) {
            reqSpec.addFormParam(COMMENT_FORM, comment);
            return this;
        }

        /**
         * Customize request specification
         *
         * @param reqSpecCustomizer consumer to modify the RequestSpecBuilder
         * @return operation
         */
        public JobRestServiceV1POSTForwardDefaultOper reqSpec(Consumer<RequestSpecBuilder> reqSpecCustomizer) {
            reqSpecCustomizer.accept(reqSpec);
            return this;
        }

        /**
         * Customize response specification
         *
         * @param respSpecCustomizer consumer to modify the ResponseSpecBuilder
         * @return operation
         */
        public JobRestServiceV1POSTForwardDefaultOper respSpec(Consumer<ResponseSpecBuilder> respSpecCustomizer) {
            respSpecCustomizer.accept(respSpec);
            return this;
        }
    }

    /**
     * Returns the comment for a specific Workflow Step as it was applied with a forward/reject action.  __Security Roles Allowed:__ JOB_MANAGER_MODULE_ACCESS
     *
     * @see #ordinalNumberPath is unique serial job number. (required)
     * @see #wfStepIdForm  (optional)
     * return LabelValueDuplicateDto
     */
    public static class JobRestServiceV1POSTGetCommentByWorkflowStepOper implements Oper {

        public static final Method REQ_METHOD = POST;
        public static final String REQ_URI = "/dse/rest/v1.0/jobs/{ordinalNumber}/_find-wf-comment";

        private RequestSpecBuilder reqSpec;
        private ResponseSpecBuilder respSpec;

        public JobRestServiceV1POSTGetCommentByWorkflowStepOper(RequestSpecBuilder reqSpec) {
            this.reqSpec = reqSpec;
            reqSpec.setContentType("application/x-www-form-urlencoded");
            reqSpec.setAccept("application/json");
            this.respSpec = new ResponseSpecBuilder();
        }

        /**
         * POST /dse/rest/v1.0/jobs/{ordinalNumber}/_find-wf-comment
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
         * POST /dse/rest/v1.0/jobs/{ordinalNumber}/_find-wf-comment
         *
         * @param handler handler
         * @return LabelValueDuplicateDto
         */
        public LabelValueDuplicateDto executeAs(Function<Response, Response> handler) {
            TypeRef<LabelValueDuplicateDto> type = new TypeRef<LabelValueDuplicateDto>() {
            };
            return execute(handler).as(type);
        }

        public static final String ORDINAL_NUMBER_PATH = "ordinalNumber";

        /**
         * @param ordinalNumber (Integer) is unique serial job number. (required)
         * @return operation
         */
        public JobRestServiceV1POSTGetCommentByWorkflowStepOper ordinalNumberPath(Object ordinalNumber) {
            reqSpec.addPathParam(ORDINAL_NUMBER_PATH, ordinalNumber);
            return this;
        }

        public static final String WF_STEP_ID_FORM = "wfStepId";

        /**
         * @param wfStepId (Integer)  (optional)
         * @return operation
         */
        public JobRestServiceV1POSTGetCommentByWorkflowStepOper wfStepIdForm(Object... wfStepId) {
            reqSpec.addFormParam(WF_STEP_ID_FORM, wfStepId);
            return this;
        }

        /**
         * Customize request specification
         *
         * @param reqSpecCustomizer consumer to modify the RequestSpecBuilder
         * @return operation
         */
        public JobRestServiceV1POSTGetCommentByWorkflowStepOper reqSpec(Consumer<RequestSpecBuilder> reqSpecCustomizer) {
            reqSpecCustomizer.accept(reqSpec);
            return this;
        }

        /**
         * Customize response specification
         *
         * @param respSpecCustomizer consumer to modify the ResponseSpecBuilder
         * @return operation
         */
        public JobRestServiceV1POSTGetCommentByWorkflowStepOper respSpec(Consumer<ResponseSpecBuilder> respSpecCustomizer) {
            respSpecCustomizer.accept(respSpec);
            return this;
        }
    }

    /**
     * The method moves a job by ordinal number to the next step back. For the previous workflow step assigneeID is passed as parameter There is a parameter comment provided, that will appear in Job Discussion When user wants to set assignee as a group one should send an empty assigneeId field. If at the particular step has individual assignment only sending an empty assigneeId will lead to having current user as assignee  __Security Roles Allowed:__ JOB_MANAGER_MODULE_ACCESS
     *
     * @see #ordinalNumberPath is unique serial job number. (required)
     * @see #body  (optional)
     * return ProcessWorkflowDto
     */
    public static class JobRestServiceV1POSTRejectOper implements Oper {

        public static final Method REQ_METHOD = POST;
        public static final String REQ_URI = "/dse/rest/v1.0/jobs/{ordinalNumber}/_reject";

        private RequestSpecBuilder reqSpec;
        private ResponseSpecBuilder respSpec;

        public JobRestServiceV1POSTRejectOper(RequestSpecBuilder reqSpec) {
            this.reqSpec = reqSpec;
            reqSpec.setContentType("application/json");
            reqSpec.setAccept("application/json");
            this.respSpec = new ResponseSpecBuilder();
        }

        /**
         * POST /dse/rest/v1.0/jobs/{ordinalNumber}/_reject
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
         * POST /dse/rest/v1.0/jobs/{ordinalNumber}/_reject
         *
         * @param handler handler
         * @return ProcessWorkflowDto
         */
        public ProcessWorkflowDto executeAs(Function<Response, Response> handler) {
            TypeRef<ProcessWorkflowDto> type = new TypeRef<ProcessWorkflowDto>() {
            };
            return execute(handler).as(type);
        }

        /**
         * @param moveWorkflowParamDto (MoveWorkflowParamDto)  (optional)
         * @return operation
         */
        public JobRestServiceV1POSTRejectOper body(MoveWorkflowParamDto moveWorkflowParamDto) {
            reqSpec.setBody(moveWorkflowParamDto);
            return this;
        }

        public static final String ORDINAL_NUMBER_PATH = "ordinalNumber";

        /**
         * @param ordinalNumber (Integer) is unique serial job number. (required)
         * @return operation
         */
        public JobRestServiceV1POSTRejectOper ordinalNumberPath(Object ordinalNumber) {
            reqSpec.addPathParam(ORDINAL_NUMBER_PATH, ordinalNumber);
            return this;
        }

        /**
         * Customize request specification
         *
         * @param reqSpecCustomizer consumer to modify the RequestSpecBuilder
         * @return operation
         */
        public JobRestServiceV1POSTRejectOper reqSpec(Consumer<RequestSpecBuilder> reqSpecCustomizer) {
            reqSpecCustomizer.accept(reqSpec);
            return this;
        }

        /**
         * Customize response specification
         *
         * @param respSpecCustomizer consumer to modify the ResponseSpecBuilder
         * @return operation
         */
        public JobRestServiceV1POSTRejectOper respSpec(Consumer<ResponseSpecBuilder> respSpecCustomizer) {
            respSpecCustomizer.accept(respSpec);
            return this;
        }
    }

    /**
     * The method moves job by ordinal number to the previous step. For the previous workflow step users are assigned from predefined or already existed job assignees in case when they exist in required user groups.  __Security Roles Allowed:__ JOB_MANAGER_MODULE_ACCESS
     *
     * @see #ordinalNumberPath is unique serial job number. (required)
     * @see #commentForm  (optional)
     * return ProcessWorkflowDto
     */
    public static class JobRestServiceV1POSTRejectDefaultOper implements Oper {

        public static final Method REQ_METHOD = POST;
        public static final String REQ_URI = "/dse/rest/v1.0/jobs/{ordinalNumber}/_reject-default";

        private RequestSpecBuilder reqSpec;
        private ResponseSpecBuilder respSpec;

        public JobRestServiceV1POSTRejectDefaultOper(RequestSpecBuilder reqSpec) {
            this.reqSpec = reqSpec;
            reqSpec.setContentType("application/x-www-form-urlencoded");
            reqSpec.setAccept("application/json");
            this.respSpec = new ResponseSpecBuilder();
        }

        /**
         * POST /dse/rest/v1.0/jobs/{ordinalNumber}/_reject-default
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
         * POST /dse/rest/v1.0/jobs/{ordinalNumber}/_reject-default
         *
         * @param handler handler
         * @return ProcessWorkflowDto
         */
        public ProcessWorkflowDto executeAs(Function<Response, Response> handler) {
            TypeRef<ProcessWorkflowDto> type = new TypeRef<ProcessWorkflowDto>() {
            };
            return execute(handler).as(type);
        }

        public static final String ORDINAL_NUMBER_PATH = "ordinalNumber";

        /**
         * @param ordinalNumber (Integer) is unique serial job number. (required)
         * @return operation
         */
        public JobRestServiceV1POSTRejectDefaultOper ordinalNumberPath(Object ordinalNumber) {
            reqSpec.addPathParam(ORDINAL_NUMBER_PATH, ordinalNumber);
            return this;
        }

        public static final String COMMENT_FORM = "comment";

        /**
         * @param comment (String)  (optional)
         * @return operation
         */
        public JobRestServiceV1POSTRejectDefaultOper commentForm(Object... comment) {
            reqSpec.addFormParam(COMMENT_FORM, comment);
            return this;
        }

        /**
         * Customize request specification
         *
         * @param reqSpecCustomizer consumer to modify the RequestSpecBuilder
         * @return operation
         */
        public JobRestServiceV1POSTRejectDefaultOper reqSpec(Consumer<RequestSpecBuilder> reqSpecCustomizer) {
            reqSpecCustomizer.accept(reqSpec);
            return this;
        }

        /**
         * Customize response specification
         *
         * @param respSpecCustomizer consumer to modify the ResponseSpecBuilder
         * @return operation
         */
        public JobRestServiceV1POSTRejectDefaultOper respSpec(Consumer<ResponseSpecBuilder> respSpecCustomizer) {
            respSpecCustomizer.accept(respSpec);
            return this;
        }
    }

    /**
     * The method return jobs for specified filter.  __Security Roles Allowed:__ JOB_MANAGER_MODULE_ACCESS
     *
     * @see #body is possible to specify filter id, from and limit params. (optional)
     * return SearchResultDto
     */
    public static class JobRestServiceV1POSTSearchOper implements Oper {

        public static final Method REQ_METHOD = POST;
        public static final String REQ_URI = "/dse/rest/v1.0/jobs/_search";

        private RequestSpecBuilder reqSpec;
        private ResponseSpecBuilder respSpec;

        public JobRestServiceV1POSTSearchOper(RequestSpecBuilder reqSpec) {
            this.reqSpec = reqSpec;
            reqSpec.setContentType("application/json");
            reqSpec.setAccept("application/json");
            this.respSpec = new ResponseSpecBuilder();
        }

        /**
         * POST /dse/rest/v1.0/jobs/_search
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
         * POST /dse/rest/v1.0/jobs/_search
         *
         * @param handler handler
         * @return SearchResultDto
         */
        public SearchResultDto executeAs(Function<Response, Response> handler) {
            TypeRef<SearchResultDto> type = new TypeRef<SearchResultDto>() {
            };
            return execute(handler).as(type);
        }

        /**
         * @param searchParamDto (SearchParamDto) is possible to specify filter id, from and limit params. (optional)
         * @return operation
         */
        public JobRestServiceV1POSTSearchOper body(SearchParamDto searchParamDto) {
            reqSpec.setBody(searchParamDto);
            return this;
        }

        /**
         * Customize request specification
         *
         * @param reqSpecCustomizer consumer to modify the RequestSpecBuilder
         * @return operation
         */
        public JobRestServiceV1POSTSearchOper reqSpec(Consumer<RequestSpecBuilder> reqSpecCustomizer) {
            reqSpecCustomizer.accept(reqSpec);
            return this;
        }

        /**
         * Customize response specification
         *
         * @param respSpecCustomizer consumer to modify the ResponseSpecBuilder
         * @return operation
         */
        public JobRestServiceV1POSTSearchOper respSpec(Consumer<ResponseSpecBuilder> respSpecCustomizer) {
            respSpecCustomizer.accept(respSpec);
            return this;
        }
    }

    /**
     * The method return jobs for specified filter.  __Security Roles Allowed:__ JOB_MANAGER_MODULE_ACCESS
     *
     * @see #body is possible to specify filter id, from and limit params. (optional)
     * return List&lt;JobIdsDto&gt;
     */
    public static class JobRestServiceV1POSTSearchIdsOper implements Oper {

        public static final Method REQ_METHOD = POST;
        public static final String REQ_URI = "/dse/rest/v1.0/jobs/_search/ids";

        private RequestSpecBuilder reqSpec;
        private ResponseSpecBuilder respSpec;

        public JobRestServiceV1POSTSearchIdsOper(RequestSpecBuilder reqSpec) {
            this.reqSpec = reqSpec;
            reqSpec.setContentType("application/json");
            reqSpec.setAccept("application/json");
            this.respSpec = new ResponseSpecBuilder();
        }

        /**
         * POST /dse/rest/v1.0/jobs/_search/ids
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
         * POST /dse/rest/v1.0/jobs/_search/ids
         *
         * @param handler handler
         * @return List&lt;JobIdsDto&gt;
         */
        public List<JobIdsDto> executeAs(Function<Response, Response> handler) {
            TypeRef<List<JobIdsDto>> type = new TypeRef<List<JobIdsDto>>() {
            };
            return execute(handler).as(type);
        }

        /**
         * @param searchParamDto (SearchParamDto) is possible to specify filter id, from and limit params. (optional)
         * @return operation
         */
        public JobRestServiceV1POSTSearchIdsOper body(SearchParamDto searchParamDto) {
            reqSpec.setBody(searchParamDto);
            return this;
        }

        /**
         * Customize request specification
         *
         * @param reqSpecCustomizer consumer to modify the RequestSpecBuilder
         * @return operation
         */
        public JobRestServiceV1POSTSearchIdsOper reqSpec(Consumer<RequestSpecBuilder> reqSpecCustomizer) {
            reqSpecCustomizer.accept(reqSpec);
            return this;
        }

        /**
         * Customize response specification
         *
         * @param respSpecCustomizer consumer to modify the ResponseSpecBuilder
         * @return operation
         */
        public JobRestServiceV1POSTSearchIdsOper respSpec(Consumer<ResponseSpecBuilder> respSpecCustomizer) {
            respSpecCustomizer.accept(respSpec);
            return this;
        }
    }

    /**
     * Update Job.  __Security Roles Allowed:__ JOB_MANAGER_MODULE_ACCESS
     *
     * @see #ordinalNumberPath is unique serial job number. (required)
     * @see #body dto for updating job. (optional)
     * return DseObjectDto
     */
    public static class JobRestServiceV1PUTUpdateJobOper implements Oper {

        public static final Method REQ_METHOD = PUT;
        public static final String REQ_URI = "/dse/rest/v1.0/jobs/{ordinalNumber}";

        private RequestSpecBuilder reqSpec;
        private ResponseSpecBuilder respSpec;

        public JobRestServiceV1PUTUpdateJobOper(RequestSpecBuilder reqSpec) {
            this.reqSpec = reqSpec;
            reqSpec.setContentType("application/json");
            reqSpec.setAccept("application/json");
            this.respSpec = new ResponseSpecBuilder();
        }

        /**
         * PUT /dse/rest/v1.0/jobs/{ordinalNumber}
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
         * PUT /dse/rest/v1.0/jobs/{ordinalNumber}
         *
         * @param handler handler
         * @return DseObjectDto
         */
        public DseObjectDto executeAs(Function<Response, Response> handler) {
            TypeRef<DseObjectDto> type = new TypeRef<DseObjectDto>() {
            };
            return execute(handler).as(type);
        }

        /**
         * @param jobUpdateDto (JobUpdateDto) dto for updating job. (optional)
         * @return operation
         */
        public JobRestServiceV1PUTUpdateJobOper body(JobUpdateDto jobUpdateDto) {
            reqSpec.setBody(jobUpdateDto);
            return this;
        }

        public static final String ORDINAL_NUMBER_PATH = "ordinalNumber";

        /**
         * @param ordinalNumber (Integer) is unique serial job number. (required)
         * @return operation
         */
        public JobRestServiceV1PUTUpdateJobOper ordinalNumberPath(Object ordinalNumber) {
            reqSpec.addPathParam(ORDINAL_NUMBER_PATH, ordinalNumber);
            return this;
        }

        /**
         * Customize request specification
         *
         * @param reqSpecCustomizer consumer to modify the RequestSpecBuilder
         * @return operation
         */
        public JobRestServiceV1PUTUpdateJobOper reqSpec(Consumer<RequestSpecBuilder> reqSpecCustomizer) {
            reqSpecCustomizer.accept(reqSpec);
            return this;
        }

        /**
         * Customize response specification
         *
         * @param respSpecCustomizer consumer to modify the ResponseSpecBuilder
         * @return operation
         */
        public JobRestServiceV1PUTUpdateJobOper respSpec(Consumer<ResponseSpecBuilder> respSpecCustomizer) {
            respSpecCustomizer.accept(respSpec);
            return this;
        }
    }
}
