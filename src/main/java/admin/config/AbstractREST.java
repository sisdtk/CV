package admin.config;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;

public abstract class AbstractREST extends CommonVariables {
    @BeforeAll
    static void setUp() {
        initEnvVars();
    }

    private static void initEnvVars() {
        workingHost = ConfigHelper.getWorkingHost();
        userName = ConfigHelper.getLogin();
        passWord = ConfigHelper.getPassword();
        parallelism = ConfigHelper.getParallelism();
        parallelThreads = ConfigHelper.getParallelThreads();
    }
}
