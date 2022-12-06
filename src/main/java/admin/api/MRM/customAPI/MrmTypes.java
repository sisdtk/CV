package admin.api.MRM.customAPI;

import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import admin.config.CommonVariables;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.FileReader;
import java.io.IOException;

import static io.restassured.RestAssured.given;

public class MrmTypes extends CommonVariables {
    private static final Logger logger = LoggerFactory.getLogger(MrmTypes.class);
    public static final String DSE_REST_V_1_0_ADMIN_OBJECT_TYPES = "/dse/rest/v1.0/admin/object-types",
            DSE_REST_V_1_0_ADMIN_METADATA_MIGRATION = "/dse/rest/v1.0/admin/metadata-migration/",
            DSE_METADATA_ADMIN_OBJECT_TYPE = "/dse-metadata/admin/object-type/",
            DSE_REST_UI_ADMIN_IMPORT_OBJECT_TYPE = "/dse/rest/ui/admin/import-object-type",
            DSE_WF_ADMIN_OLD_OBJECT_TYPE = "/dse-wf/admin/old-object-type/",
            DSE_METADATA_ADMIN_OBJECT_TYPE_LAYOUT = "/dse-metadata/admin/object-type-layout/",
            WF_OLD_TYPE = "/wf/old/type",
            SRC_TEST_RESOURCES_DATASETS_MRMTYPES = "src/test/resources/datasets/MRMtypes/";

    public static int getDSEObjects(String jobTypeName) {
        Response response = given()
                .baseUri(workingHost)
                .auth().preemptive().basic(userName, passWord)
                .when()
                .get(DSE_REST_V_1_0_ADMIN_OBJECT_TYPES)
                .then()
                .statusCode(200)
                .extract().response();
        JsonPath jsonPath = new JsonPath(response.asString());
        return Integer.parseInt(jsonPath.get("find {e -> e.displayName == '" + jobTypeName + "'}.id").toString());
    }

    public static boolean verifyMRMtypePresence(String jobTypeName) {
        boolean presence;
        Response response = given()
                .baseUri(workingHost)
                .auth().preemptive().basic(userName, passWord)
                .when()
                .get(DSE_REST_V_1_0_ADMIN_OBJECT_TYPES)
                .then()
                .statusCode(200)
                .extract().response();
        JsonPath jsonPath = new JsonPath(response.asString());
        presence = null != jsonPath.getString("find {e -> e.displayName == '" + jobTypeName + "'}.displayName");
        return presence;
    }

    private static void getVariables(int id) {
        given()
                .baseUri(workingHost)
                .auth().preemptive().basic(userName, passWord)
                .basePath(DSE_REST_V_1_0_ADMIN_OBJECT_TYPES + id + "/variables")
                .contentType(ContentType.JSON)
                .when()
                .get()
                .then()
                .statusCode(200);
    }

    private static void refreshLayout(int id) {
        given()
                .baseUri(workingHost)
                .auth().preemptive().basic(userName, passWord)
                .basePath(DSE_METADATA_ADMIN_OBJECT_TYPE_LAYOUT + id)
                .contentType(ContentType.JSON)
                .when()
                .get()
                .then()
                .statusCode(200);
    }

    public static void applyChangesToJMObjectType(int dseObjectId) {
        given()
                .baseUri(workingHost)
                .auth().preemptive().basic(userName, passWord)
                .basePath(DSE_REST_V_1_0_ADMIN_METADATA_MIGRATION + dseObjectId)
                .contentType(ContentType.JSON)
                .when()
                .put()
                .then()
                .statusCode(200);

        getVariables(dseObjectId);
        refreshLayout(dseObjectId);
    }

    public static void deleteMRMType(int dseObjectId) {
        given()
                .baseUri(workingHost)
                .auth().preemptive().basic(userName, passWord)
                .contentType(ContentType.JSON)
                .when()
                .delete(DSE_REST_V_1_0_ADMIN_OBJECT_TYPES + dseObjectId)
                .then()
                .statusCode(200);

        applyChangesToJMObjectType(dseObjectId);
    }

    public static void deleteMRMType(String jobTypeName) {
        int dseObjectId = getDSEObjects(jobTypeName);

        given()
                .baseUri(workingHost)
                .auth().preemptive().basic(userName, passWord)
                .contentType(ContentType.JSON)
                .when()
                .delete(DSE_REST_V_1_0_ADMIN_OBJECT_TYPES + dseObjectId)
                .then()
                .statusCode(200);

        applyChangesToJMObjectType(dseObjectId);
    }

    public static void assignWorkflowToMRMType(int dseObjectId, int workflowTypeId) {
        given()
                .baseUri(workingHost)
                .auth().preemptive().basic(userName, passWord)
                .contentType(ContentType.JSON)
                .when()
                .get(DSE_WF_ADMIN_OLD_OBJECT_TYPE + dseObjectId + "/meta-instances/" + workflowTypeId)
                .then()
                .statusCode(200)
                .extract().response();

        validationResults(dseObjectId);
    }

    public static void importMRMType(String jobTypeName) {

        StringBuilder stringBuilder = new StringBuilder();
        try (FileReader fileReader = new FileReader(SRC_TEST_RESOURCES_DATASETS_MRMTYPES + jobTypeName + ".json")) {
            int c;
            while (-1 != (c = fileReader.read())) {
                stringBuilder.append((char) c);
            }
        } catch (java.io.FileNotFoundException e) {
            logger.warn("File named: " + jobTypeName + " has not been found by path: src/test/resources/datasets/MRMtypes/");
        } catch (IOException e) {
            logger.warn("IOException");
        }

        String s = stringBuilder.toString();

        given()
                .baseUri(workingHost)
                .auth().preemptive().basic(userName, passWord)
                .contentType(ContentType.JSON)
                .body(s)
                .when()
                .put(DSE_REST_UI_ADMIN_IMPORT_OBJECT_TYPE)
                .then()
                .statusCode(204);

        validationResults(getDSEObjects(jobTypeName));
    }

    public static int getWorkflowId(String workflowName) {
        Response response = given()
                .baseUri(workingHost)
                .auth().preemptive().basic(userName, passWord)
                .contentType(ContentType.JSON)
                .when()
                .get(WF_OLD_TYPE)
                .then()
                .statusCode(200)
                .extract().response();

        JsonPath jsonPath = new JsonPath(response.asString());
        return Integer.parseInt(jsonPath.getString("find {e -> e.name == '" + workflowName + "'}.workflowTypeId"));
    }

    private static void validationResults(int instanceId) {
        given()
                .baseUri(workingHost)
                .auth().preemptive().basic(userName, passWord)
                .contentType(ContentType.JSON)
                .when()
                .get(DSE_METADATA_ADMIN_OBJECT_TYPE + instanceId + "/validation-results")
                .then()
                .statusCode(200);
    }
}
