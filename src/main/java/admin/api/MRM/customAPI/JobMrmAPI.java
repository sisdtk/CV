package admin.api.MRM.customAPI;

import admin.api.MRM.externalAPI.model.SearchParamDto;
import io.cucumber.java.en.Given;
import io.qameta.allure.Step;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;
import admin.api.MRM.MrmApiClient;
import admin.api.MRM.MrmApiConfig;
import admin.api.MRM.externalAPI.model.FinishWorkflowParamDto;
import admin.api.MRM.externalAPI.model.JobCreateDto;
import admin.api.MRM.externalAPI.model.MoveWorkflowParamDto;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class JobMrmAPI extends MrmApiConfig {
    private static final Logger logger = LoggerFactory.getLogger(JobMrmAPI.class.getSimpleName());
    private final MrmApiClient api = getApiConfig();
    private final String regex = "[^\\d/]";

    @Given("Create a job")
    public Response createJob(String name, String jobTypeName, String workflowName) {

        int dseObjectTypeId = 0;
        int workflowTypeId = 0;

        try {
            dseObjectTypeId = getDseObjectTypeId(jobTypeName);
        } catch (Exception e) {
            logger.info("dseObjectTypeId IS NOT FOUND BY NAME: " + jobTypeName);
        }

        try {
            workflowTypeId = getWorkflowTypeId(workflowName);
        } catch (Exception e) {
            logger.info("workflowTypeId IS NOT FOUND BY NAME: " + workflowName);
        }

        Response createJobResponse = api.jobRestServiceV1()
                .jobRestServiceV1POSTCreateJob()
                .body(new JobCreateDto()
                        .name(name)
                        .dseObjectTypeId(dseObjectTypeId)
                        .workflowTypeId(workflowTypeId))
                .execute(ResponseBody::peek)
                .then()
                .log()
                .ifError()
                .log()
                .ifValidationFails()
                .statusCode(200)
                .extract()
                .response();

        return createJobResponse;
    }

    public void deleteJob(String jobName) {
        int ordinalNumber = getOrdinalNumberId(jobName);

        api.jobRestServiceV1()
                .jobRestServiceV1DELETEDelete()
                .ordinalNumberPath(ordinalNumber)
                .execute(ResponseBody::peek)
                .then()
                .statusCode(200);
    }

    public String getStartDate(String jobName) {
        Response response = api.jobRestServiceV1()
                .jobRestServiceV1POSTSearch()
                .body(new SearchParamDto().fulltext(jobName))
                .execute(Response::then)
                .statusCode(200)
                .extract()
                .response();

        return response.jsonPath().getString("values.values.current__step__start__date.value").replaceAll(regex, "");
    }

    public int getInstanceId(String jobName) {
        return Integer.parseInt(
                api.jobRestServiceV1().jobRestServiceV1POSTSearchIds().body(new SearchParamDto().fulltext(jobName)).execute(Response::jsonPath)
                        .getString("instanceId").replace("[", "").replace("]", ""));
    }

    public int getOrdinalNumberId(String jobName) {
        return Integer.parseInt(api.jobRestServiceV1().jobRestServiceV1POSTSearchIds().body(new SearchParamDto().fulltext(jobName)).execute(
                ResponseBody::jsonPath).getString("ordinalNumber").replace("[", "").replace("]", ""));
    }

    public int getDseObjectTypeId(String jobTypeName) {
        return api.dseObjectTypeAdminRestServiceV1().dseObjectTypeAdminRestServiceV1GETGetAllDseObjectTypes().execute(ResponseBody::jsonPath)
                .getInt("find {e -> e.displayName == '" + jobTypeName + "'}.id");
    }

    public int getWorkflowTypeId(String workflowName) {
        return api.workflowTypeService().getProcessList().execute(ResponseBody::jsonPath)
                .getInt("find {e -> e.name == '" + workflowName + "'}.workflowTypeId");
    }
}
