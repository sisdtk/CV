package admin.api.MRM.customAPI;

import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import admin.api.MRM.externalAPI.model.JobCreateDto;
import admin.config.AbstractUITest;

import java.util.ArrayList;
import java.util.LinkedHashMap;

import static io.restassured.RestAssured.given;

public class JobsActions extends AbstractUITest {
    public static int getWorkflowID(String jobTypName, String workflowName) {
        Response response = given()
                .baseUri(workingHost)
                .auth().preemptive().basic(userName, passWord)
                .when()
                .get("/dse/rest/ui/module/16/available-types")
                .then()
                .statusCode(200)
                .extract().response();

        JsonPath jsonPath = new JsonPath(response.asString());
        ArrayList<LinkedHashMap<String, Object>> jobTypeObject = jsonPath.get("find{e -> e.jobTypeName == '" + jobTypName + "'}.jobTypeWorkflows");
        int workflowId = 0;
        for (LinkedHashMap<String, Object> stringObjectLinkedHashMap : jobTypeObject) {
            if (stringObjectLinkedHashMap.containsValue(workflowName)) {
                workflowId = (int) stringObjectLinkedHashMap.get("workflowId");
            }
        }
        return workflowId;
    }

    public static int getWorkflowID(int dseObjectId) {
        Response response = given()
                .baseUri(workingHost)
                .when()
                .get("/dse-wf/admin/old-object-type/" + dseObjectId + "/meta-instances")
                .then()
                .statusCode(200)
                .extract()
                .response();

        JsonPath jsonPath = new JsonPath(response.asString()).setRootPath("workflowMetatype");

        String str = jsonPath.getString("workflowTypeId");
        return Integer.parseInt(str.substring(1, str.length() - 1));
    }
}
