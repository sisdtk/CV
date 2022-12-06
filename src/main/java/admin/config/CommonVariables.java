package admin.config;

import io.restassured.builder.RequestSpecBuilder;

public abstract class CommonVariables {
    protected static String workingHost = null,
            userName = null,
            passWord = null,
            parallelism = null,
            parallelThreads = null;
}
