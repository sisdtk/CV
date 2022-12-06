package pages;

import admin.api.MRM.externalAPI.model.SearchParamDto;
import com.codeborne.selenide.*;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.response.Response;
import admin.api.MRM.MrmApiConfig;
import admin.config.AbstractUITest;

import java.time.Duration;

import static com.codeborne.selenide.ClickOptions.usingJavaScript;
import static com.codeborne.selenide.CollectionCondition.*;
import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selectors.by;
import static com.codeborne.selenide.Selectors.byTitle;
import static com.codeborne.selenide.Selenide.*;
import static admin.api.MRM.customAPI.JobsActions.getWorkflowID;
import static utils.Tools.spinningWheel;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class MrmGridOverviewUtils extends AbstractUITest {
    private static final String FIRST_ITEM = ".x-grid-item",
            STANDARD_FILTER = "#viewPickerBtn",
            CONTENT_OF_GRID = "#dseObjectGrid1-body",
            FIELD_SEARCH = "#viewSearchText-inputEl",
            GRID_ITEM_CONTAINER = " .x-grid-item-container",
            DSE_EDITOR_POPUP = "#DseEditorPopup",
            STANDARD_FILTER_DROP_DOWN_LIST = ".xdse-viewpicker-btn-menu-body",
            SEARCH_BUTTON = "#searchBtn",
            ADVANCED_SEARCH_EDIT_BUTTON = "#viewEditBtn";
    public static final String DSE_EDITOR_FRAME = "dseEditorFrame";
    public static final String DSE_EDITOR_FRAME1 = "#dseEditorFrame";
    public static final String DSE_WEB_OPEN_JOB_INSTANCE_ID = "/dse/web/OpenJob?instanceId=";
    public static final String DATA_TEST_ID = "data-test-id";
    public static final String DATA_TEST_ID_CONTAINS = DATA_TEST_ID + "*";
    public static final String INPUT = "input";
    public static final String XDSE_FILTER_BTN_ADVANCED = ".xdse-filter-btn-advanced";

    private final MrmApiConfig apiCore = new MrmApiConfig();

    public void verifyDSEItem(String nameOfItem, boolean condition, int amount) {
        String locator = CONTENT_OF_GRID + GRID_ITEM_CONTAINER;
        $(locator).shouldBe(visible, Duration.ofSeconds(20));

        ElementsCollection listOfDSEItems = simpleSearch(nameOfItem);
        if (condition) {
            $(FIRST_ITEM).shouldBe(visible, Duration.ofSeconds(20));
            listOfDSEItems.shouldHave(textsInAnyOrder(nameOfItem));
            $$(locator + " table").shouldHave(sizeLessThanOrEqual(amount).because("***ERROR one job should be found"));
        } else {
            listOfDSEItems.get(0).shouldNotHave(exactText(nameOfItem));
        }
    }

    public ElementsCollection simpleSearch(String searchCriteria) {
        spinningWheel();
        $(FIELD_SEARCH).shouldBe(visible, Duration.ofSeconds(20)).click();
        $(FIELD_SEARCH).setValue(searchCriteria);
        $(SEARCH_BUTTON).shouldBe(visible, Duration.ofSeconds(10)).hover().click(usingJavaScript());
        spinningWheel();
        $(CONTENT_OF_GRID).shouldBe(visible, Duration.ofSeconds(100));
        return $$(CONTENT_OF_GRID + GRID_ITEM_CONTAINER);
    }

    public void clickStandardFilter() {
        $(".x-mask-loading").shouldBe(disappear, Duration.ofSeconds(30));
        $(STANDARD_FILTER).shouldBe(visible, Duration.ofSeconds(30)).click();
        $(STANDARD_FILTER_DROP_DOWN_LIST).shouldBe(appear, Duration.ofSeconds(30));
    }

    public void createAdvancedSearchFilterWithoutSaving(String variable, String value) {
        clickStandardFilter();
        $(XDSE_FILTER_BTN_ADVANCED).click();
        $(ADVANCED_SEARCH_EDIT_BUTTON).shouldBe(visible, Duration.ofSeconds(40)).click();
        switchTo().frame(0);
        $(by(DATA_TEST_ID_CONTAINS, "jobType")).shouldBe(visible).click();
        $(byTitle("General")).shouldBe(visible).click();
        $(by(DATA_TEST_ID_CONTAINS, "fieldName")).shouldBe(visible).click();
        $(byTitle(variable)).shouldBe(visible).click();
        $(by(DATA_TEST_ID_CONTAINS, "restriction")).shouldBe(visible).click();
        $(byTitle("equal to")).shouldBe(visible).click();
        switch (variable) {
            case "TS: Combo box":
                $(by(DATA_TEST_ID_CONTAINS, "Combobox")).shouldBe(visible).click();
                $(by(DATA_TEST_ID, value)).shouldBe(visible).click();
                break;
            case "TS: DPWT":
                $("#value_1_Date").shouldBe(visible, Duration.ofSeconds(20)).setValue(value);
                $("#value_1_Hours").shouldBe(visible, Duration.ofSeconds(20)).setValue("0");
                $("#value_1_Minutes").shouldBe(visible, Duration.ofSeconds(20)).setValue("0");
                break;
            case "TS: MVIL":
                $(by(DATA_TEST_ID_CONTAINS, "firstValue")).$(INPUT).shouldBe(visible).setValue(value + " left field");
                $(by(DATA_TEST_ID_CONTAINS, "secondValue")).$(INPUT).shouldBe(visible).setValue(value + " right field");
                break;
            case "TS: SIL":
            case "TS: DP":
            case "TS: MLIA":
            case "TS: Numbers":
                $(by(DATA_TEST_ID_CONTAINS, "SingleInputLine")).$(INPUT).shouldBe(visible).setValue(value);
                break;
        }
        $(by(DATA_TEST_ID, "advanced-search-search-button")).shouldBe(visible).click();
        $(by(DATA_TEST_ID, "advanced-search-SaveModal-searchButton")).shouldBe(visible).click();
        switchTo().parentFrame();
    }

    public void openJobUsingDeepLink(String jobName) {
        int instanceId = getInstanceId(jobName);
        String compositeUrl = workingHost + DSE_WEB_OPEN_JOB_INSTANCE_ID + instanceId;
        open(compositeUrl);
        switchToInnerFrame();
    }

    private int getInstanceId(String jobName) {
        return Integer.parseInt(apiCore.getApiConfig()
                .jobRestServiceV1()
                .jobRestServiceV1POSTSearchIds()
                .body(new SearchParamDto().fulltext(jobName))
                .execute(Response::jsonPath)
                .getString("instanceId")
                .replace("[", "").replace("]", ""));
    }

    private static void switchToInnerFrame() {
        $(DSE_EDITOR_POPUP).shouldBe(visible, Duration.ofSeconds(20));
        if ($(DSE_EDITOR_FRAME1).isEnabled())
            switchTo().innerFrame(DSE_EDITOR_FRAME);
    }
}