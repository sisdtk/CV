package admin.config;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import com.google.common.collect.ImmutableMap;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.http.Method;
import io.restassured.response.Response;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.Duration;
import java.util.*;
import java.util.stream.Collectors;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Configuration.*;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.WebDriverRunner.currentFrameUrl;
import static com.github.automatedowl.tools.AllureEnvironmentWriter.allureEnvironmentWriter;
import static io.restassured.RestAssured.given;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

public abstract class AbstractUITest extends CommonVariables {
    private static String localeTag = null,
            groups = null,
            browserName = null,
            browserVersion = null,
            remoteHostIp = null,
            selenoidHostIp = null;
    private static Boolean selenoid = false;
    private static final String LOGOUT_DO = "/Logout.do",
            RESOURCES_PATH = "src/test/resources",
            RESOURCES_POSTFIX = ".properties",
            COMMON_RESOURCES_PREFIX = "Commons_";
    private static final Map<String, Map<String, Map<String, String>>> resources = new HashMap<>();

    @BeforeAll
    public static void config() {
        initEnvVars();
        browserLaunchConfig();
        setAllureEnvironment();
        initAllResources();
        open(baseUrl);
    }

    @AfterAll
    public static void closeDriver() {
        closeWebDriver();
    }

    private static void browserLaunchConfig() {
        baseUrl = workingHost;
        browser = browserName;
        Configuration.browserVersion = browserVersion;
        browserSize = "1920x1080";
        timeout = 10000;
        headless = false;
        reopenBrowserOnFail = true;
        fastSetValue = false;
        webdriverLogsEnabled = true;
        if (selenoid)
            selenoidBrowserSettings();
    }

    private static void selenoidBrowserSettings() {
        remote = selenoidHostIp;
        ArrayList<String> hostsEntries = new ArrayList<>();
        hostsEntries.add(workingHost.replaceFirst("\\D{8}", "").replaceFirst("\\d{5}", "") + remoteHostIp);
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("browserName", browserName);
        capabilities.setCapability("browserVersion", browserVersion);
        capabilities.setCapability("selenoid:options", Map.<String, Object>of(
                "enableVNC", true,
                "hostsEntries", hostsEntries,
                "enableVideo", false
        ));
        browserCapabilities = capabilities;
    }

    private static void initEnvVars() {
        workingHost = ConfigHelper.getWorkingHost();
        browserName = ConfigHelper.getBrowserName();
        browserVersion = ConfigHelper.getBrowserVersion();
        localeTag = ConfigHelper.getLocaleTag();
        userName = ConfigHelper.getLogin();
        passWord = ConfigHelper.getPassword();
        parallelism = ConfigHelper.getParallelism();
        groups = ConfigHelper.getGroups();
        parallelThreads = ConfigHelper.getParallelThreads();
        remoteHostIp = ConfigHelper.getRemoteHostIP();
        selenoidHostIp = ConfigHelper.getSelenoidHostIP();
        selenoid = ConfigHelper.getSelenoid();
    }

    private static void setAllureEnvironment() {
        allureEnvironmentWriter(
                ImmutableMap.<String, String>builder()
                        .put("Locale Tag", localeTag)
                        .put("Working Host", workingHost)
                        .put("Browser", browser)
                        .put("Parallelism", parallelism)
                        .put("Parallel threads", parallelThreads)
                        .build());
    }

    public static void logout() {
        open(LOGOUT_DO);
        $("#login-form").shouldBe(visible, Duration.ofSeconds(20));
    }

    public static String getResourceValue(final String filePrefix, final String key) {
        assertTrue(resources.containsKey(filePrefix)
                , String.format("***ERROR: Resources was not found by prefix '%s'", filePrefix));
        assertTrue(resources.get(filePrefix).containsKey(localeTag)
                , String.format("***ERROR: Resources was not found by language '%s' (prefix is '%s')", localeTag,
                        filePrefix));

        String value = resources.get(filePrefix).get(localeTag).get(key);

        assertNotNull(value, String.format("Value was not found by key '%s' (prefix = '%s', language = '%s')", key, filePrefix, localeTag));

        return value;
    }

    public static String getCommonResourceValue(final String key) {
        return getResourceValue(COMMON_RESOURCES_PREFIX, key);
    }

    private static void initAllResources() {
        getAllResourcesPaths().forEach(path ->
        {
            if (!path.toString().contains(localeTag)) {
                return;
            }

            String resourceFilePrefix = path.getFileName().toString().replace(localeTag + RESOURCES_POSTFIX, "");

            resources.putIfAbsent(resourceFilePrefix, new HashMap<>());
            resources.get(resourceFilePrefix).put(localeTag, new HashMap<>());

            int wholeLength = path.toString().length();
            ResourceBundle bundle = ResourceBundle
                    .getBundle(path.toString()
                            .substring(RESOURCES_PATH.length() + 1, wholeLength)
                            .replace(RESOURCES_POSTFIX, ""));
            bundle.keySet().forEach(
                    key -> resources.get(resourceFilePrefix).get(localeTag).put(key, bundle.getString(key)));
        });
    }

    private static List<Path> getAllResourcesPaths() {
        String separator = File.separator;
        try {
            return Files.walk(Paths.get(RESOURCES_PATH))
                    .filter(p -> !Files.isDirectory(p))
                    .filter(p -> (p.toString().contains("allure") || p.toString().contains("junit")
                                    && p.toString().endsWith(RESOURCES_POSTFIX))
                                    || (p.toString().endsWith(localeTag + RESOURCES_POSTFIX)
                                    && (p.toString().contains(separator + (groups.split(" ,_")[0].toLowerCase()))
                                    || p.toString().contains("Commons")
                                    || p.toString().contains("portal" + separator + "Login")
                                    || p.toString().contains("portal" + separator + "Settings")
                                    || p.toString().contains("portal" + separator + "User")
                            )
                            )
                    )
                    .collect(Collectors.toList());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static String getLocaleTag() {
        return localeTag;
    }

    public static String getGroups() {
        return groups;
    }
}
