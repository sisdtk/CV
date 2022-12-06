package admin.config;

import org.aeonbits.owner.ConfigFactory;

public class ConfigHelper {
    private static WebConfig getConfig() {
        if (System.getProperty("env") == null)
            System.setProperty("env", "envDev");
        return ConfigFactory.newInstance().create(WebConfig.class, System.getProperties());
    }

    private static ParallelExecutionConfig getParallelParameters() {
        System.setProperty("parallel", "junit-platform");
        return ConfigFactory.newInstance().create(ParallelExecutionConfig.class, System.getProperties());
    }

    public static String getBrowserName() {
        return getConfig().browserName();
    }

    public static String getBrowserVersion() {
        return getConfig().browserVersion();
    }

    public static String getLocaleTag() {
        return getConfig().localeTag();
    }

    public static String getWorkingHost() {
        return getConfig().workingHost();
    }

    public static String getLogin() {
        return getConfig().login();
    }

    public static String getPassword() {
        return getConfig().password();
    }

    public static String getParallelism() {
        return getParallelParameters().parallelism();
    }

    public static String getGroups() {
        return getConfig().groups();
    }

    public static String getParallelThreads() {
        return getParallelParameters().parallelThreads();
    }

    public static String getRemoteHostIP() {
        return getConfig().remoteHostIp();
    }

    public static String getSelenoidHostIP() {
        return getConfig().selenoidHostIp();
    }

    public static Boolean getSelenoid() {
        return getConfig().selenoid();
    }

}
