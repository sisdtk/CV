package testCases.REST;

import admin.api.MRM.MrmApiConfig;
import admin.api.MRM.externalAPI.api.JobRestServiceV1Api;
import admin.api.MRM.externalAPI.model.*;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;
import org.junit.jupiter.api.*;
import utils.Generator;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class JobRestServiceV1MrmApiTest extends MrmApiConfig {
    private static final String TRUE = "true";
    private static final String SUCCESS = "success";
    private static final String INSTANCE_ID = "instanceId";
    private final JobRestServiceV1Api api = getApiConfig().jobRestServiceV1();
    private final Generator generator = new Generator();
    private final JobCreateDto jobCreateDto = new JobCreateDto();
    private final JobCreateDto generatedDto = generator.generate(jobCreateDto);
    private int ordinalNumber;
    private Response createJobResponse;

//    @BeforeEach
    public void shouldSee200AfterJobRestServiceV1POSTCreateJob() {
        createJobResponse = api.jobRestServiceV1POSTCreateJob()
                .body(generatedDto)
                .execute(ResponseBody::prettyPeek)
                .then()
                .statusCode(200)
                .extract()
                .response();

        ordinalNumber = Integer.parseInt(createJobResponse
                .jsonPath()
                .getString("ordinalNumber").replaceAll("^\\D", ""));
    }

    @AfterEach
    public void shouldSee200AfterJobRestServiceV1DELETEDelete() {
        Response response = api.jobRestServiceV1DELETEDelete()
                .ordinalNumberPath(ordinalNumber)
                .execute(ResponseBody::prettyPeek)
                .then()
                .statusCode(200)
                .extract()
                .response();

        assertEquals(TRUE, response.asString());
    }

    @Test
    public void shouldSee200AfterJobRestServiceV1GETGet() {
        JsonPath jsonPath = api.jobRestServiceV1GETGet()
                .ordinalNumberPath(ordinalNumber)
                .execute(ResponseBody::prettyPeek)
                .then()
                .statusCode(200)
                .extract()
                .response()
                .jsonPath();

        assertEquals(jobCreateDto.getName(), jsonPath.getString("name"));
    }

    @Test
    public void shouldSee200AfterJobRestServiceV1GETGetIds() {
        api.jobRestServiceV1GETGetIds()
                .ordinalNumberPath(ordinalNumber)
                .execute(ResponseBody::prettyPeek)
                .then()
                .statusCode(200);
    }

    @Test
    public void shouldSee200AfterJobRestServiceV1GETGetWorkflow() {
        api.jobRestServiceV1GETGetWorkflow()
                .ordinalNumberPath(ordinalNumber)
                .execute(ResponseBody::prettyPeek)
                .then()
                .statusCode(200);
    }

    @Test
    public void shouldSee200AfterJobRestServiceV1POSTAssign() {
        MoveWorkflowParamDto moveWorkflowParamDto = new MoveWorkflowParamDto();
        moveWorkflowParamDto.assigneeId(123);
        api.jobRestServiceV1POSTAssign()
                .ordinalNumberPath(ordinalNumber)
                .execute(ResponseBody::prettyPeek)
                .then()
                .statusCode(200);
    }

    @Test
    public void shouldSee200AfterJobRestServiceV1POSTCancel() {
        Response response = api.jobRestServiceV1POSTCancel()
                .ordinalNumberPath(ordinalNumber)
                .execute(ResponseBody::prettyPeek)
                .then()
                .statusCode(200)
                .extract()
                .response();

        assertEquals(TRUE, response.asString());
    }

    @Test
    public void shouldSee201AfterJobRestServiceV1POSTCopy() {
        String name = "Copy of " + generatedDto.getName();
        Response response = api.jobRestServiceV1POSTCopy()
                .ordinalNumberPath(ordinalNumber)
                .nameForm(name)
                .execute(ResponseBody::prettyPeek)
                .then()
                .statusCode(200)
                .extract()
                .response();

        JsonPath jsonPath = response.jsonPath();

        assertEquals(name, jsonPath.getString("name"));
    }

    @Test
    public void shouldSee200AfterJobRestServiceV1POSTFinish() {
        FinishWorkflowParamDto finishWorkflowParamDto = new FinishWorkflowParamDto();
        finishWorkflowParamDto.comment("Finish");

        Response response = api.jobRestServiceV1POSTFinish()
                .ordinalNumberPath(ordinalNumber)
                .body(finishWorkflowParamDto)
                .execute(ResponseBody::prettyPeek)
                .then()
                .statusCode(200)
                .extract()
                .response();

        assertEquals(TRUE, response.asString());
    }

    @Test
    public void shouldSee200AfterJobRestServiceV1POSTForward() {
        MoveWorkflowParamDto moveWorkflowParamDto = new MoveWorkflowParamDto();
        moveWorkflowParamDto.comment("Forward");

        Response response = api.jobRestServiceV1POSTForward()
                .ordinalNumberPath(ordinalNumber)
                .body(moveWorkflowParamDto)
                .execute(ResponseBody::prettyPeek)
                .then()
                .statusCode(200)
                .extract()
                .response();

        String success = response.jsonPath()
                .getString(SUCCESS);

        assertEquals(TRUE, success);
    }

    @Test
    public void shouldSee200AfterJobRestServiceV1POSTForwardDefault() {
        Response response = api.jobRestServiceV1POSTForwardDefault()
                .ordinalNumberPath(ordinalNumber)
                .execute(ResponseBody::prettyPeek)
                .then()
                .statusCode(200)
                .extract()
                .response();

        String success = response.jsonPath()
                .getString(SUCCESS);

        assertEquals(TRUE, success);
    }

    @Test
    public void shouldSee200AfterJobRestServiceV1POSTReject() {
        MoveWorkflowParamDto moveWorkflowParamDto = new MoveWorkflowParamDto();
        moveWorkflowParamDto.comment("Reject");

        Response response = api.jobRestServiceV1POSTReject()
                .ordinalNumberPath(ordinalNumber)
                .body(moveWorkflowParamDto)
                .execute(ResponseBody::prettyPeek)
                .then()
                .statusCode(200)
                .extract()
                .response();

        String success = response.jsonPath()
                .getString(SUCCESS);

        assertEquals(TRUE, success);
    }

    @Test
    public void shouldSee200AfterJobRestServiceV1POSTRejectDefault() {
        Response response = api.jobRestServiceV1POSTRejectDefault()
                .ordinalNumberPath(ordinalNumber)
                .execute(ResponseBody::prettyPeek)
                .then()
                .statusCode(200)
                .extract()
                .response();

        String success = response.jsonPath()
                .getString(SUCCESS);

        assertEquals(TRUE, success);
    }

    @Test
    public void shouldSee200AfterJobRestServiceV1POSTSearch() {
        SearchParamDto searchParamDto = new SearchParamDto();
        searchParamDto.fulltext(generatedDto.getName()).limit(1);

        Response response = api.jobRestServiceV1POSTSearch()
                .body(searchParamDto)
                .execute(ResponseBody::prettyPeek)
                .then()
                .statusCode(200)
                .extract()
                .response();

        String name = response.jsonPath()
                .setRootPath("values")
                .getString("name")
                .replaceAll("[^\\w && \\S]", "");

        assertEquals(generatedDto.getName(), name);
    }

    @Test
    public void shouldSee200AfterJobRestServiceV1POSTSearchIds() {
        SearchParamDto searchParamDto = new SearchParamDto();
        searchParamDto.fulltext(generatedDto.getName());

        Response response = api.jobRestServiceV1POSTSearchIds()
                .body(searchParamDto)
                .execute(ResponseBody::prettyPeek)
                .then()
                .statusCode(200)
                .extract()
                .response();

        String instanceId = Arrays.stream(response.jsonPath().getString(INSTANCE_ID).replaceAll("[^\\d && \\S]", "").split("\\s")).max(String::compareToIgnoreCase).get();
        assertEquals(createJobResponse.jsonPath().getString(INSTANCE_ID).replaceAll("[^\\d]", ""), instanceId);
    }

    @Test
    public void shouldSee200AfterJobRestServiceV1PUTUpdateJob() {
        JobUpdateDto jobUpdateDto = new JobUpdateDto();
        JobUpdateValueDto jobUpdateValueDto = new JobUpdateValueDto();
        jobUpdateDto.addValuesItem(jobUpdateValueDto.technicalName("job__name").value("newTechnicalName"));

        Response response = api.jobRestServiceV1PUTUpdateJob()
                .ordinalNumberPath(ordinalNumber)
                .body(jobUpdateDto)
                .execute(ResponseBody::prettyPeek)
                .then()
                .statusCode(200)
                .extract()
                .response();

        JsonPath jsonPath = response.jsonPath().setRootPath("values.job__name");

        String displayValue = jsonPath.getString("displayValue");
        String value = jsonPath.getString("value");

        assertEquals(jobUpdateValueDto.getValue(), displayValue);
        assertEquals(jobUpdateValueDto.getValue(), value.replaceAll("\\D", ""));
    }
}