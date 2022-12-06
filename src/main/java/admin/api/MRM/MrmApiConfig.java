package admin.api.MRM;

import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.filter.log.LogDetail;
import io.restassured.http.ContentType;

import static admin.api.MRM.MrmApiClient.Config.apiConfig;
import static io.restassured.RestAssured.*;

/**
 * !!! HIGHLY RECOMMENDED !!!
 * 1. Create new instance of this class if you want to use it in UI testing
 * 2. Extend this class if you want to use it in creating a custom api
 * 3. Extend this class if you want to use it in REST testing
 */
public class MrmApiConfig extends MrmApiClient {
    private final RequestSpecBuilder requestSpecBuilder = new RequestSpecBuilder()
            .setBaseUri(workingHost)
            .setAuth(oauth2(given()
                    .formParam("login", userName)
                    .formParam("password", passWord)
                    .contentType(ContentType.URLENC)
                    .when()
                    .post(workingHost + "/rest/sso/auth").jsonPath().getString("access_token")))
            .log(LogDetail.METHOD)
            .log(LogDetail.URI)
            .log(LogDetail.BODY);
    private final MrmApiClient apiConfig = new MrmApiClient(apiConfig().reqSpecSupplier(
            () -> requestSpecBuilder
    ));

    public MrmApiClient getApiConfig() {
        return apiConfig;
    }

    public RequestSpecBuilder getRequestSpecBuilder() {
        return requestSpecBuilder;
    }
}
