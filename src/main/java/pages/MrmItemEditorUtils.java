package pages;

import admin.config.AbstractUITest;
import com.codeborne.selenide.*;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utils.ExtractableDate;

import java.time.*;
import java.util.*;

import static com.codeborne.selenide.ClickOptions.*;
import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.*;

public class MrmItemEditorUtils extends AbstractUITest implements ExtractableDate {
    private static final String EDITOR_TOOLBAR = ".xdse-navigation-toolbar",
            DSE_EDITOR_FRAME = "dseEditorFrame",
            LOCATOR_DSE_EDITOR_FRAME = "#dseEditorFrame",
            JOB_TABS_NAME = ".x-tab-inner-default",
            RIGHT_ARROW_ON_TAB_LINE = ".xdse-panel-tabscontainer .x-box-scroller-right",
            CLOSE_DSE_EDITOR_POPUP = "[data-qtip='Close dialog']",
            SAVE_BUTTON = ".xdse-button-save",
            MULTIPLE_VALUES_INPUT_LINES = "[data-test-id='MultiValueInputLineVariableType - ts_multiple_values_input_lines']",
            MULTI_LINE_INPUT_AREA = "[data-test-id='MultilineInputAreaVariableType - ts_mlia']",
            COMBO_BOX = "[data-test-id='ComboBoxVariableType - ts_combo_box']",
            DATA_PICKER = "[data-test-id='DateInputLineVariableType - ts_dp']",
            NUMBER = "[data-test-id='RealNumberVariableType - ts_numbers']",
            INHERITANCE_SINGLE_INPUT_LINE = "[data-test-id='SingleInputLineVariableType - ts_sil']",
            INHERITANCE_ASSET_SELECTOR = "[data-test-id='MediaMultiSelectorVariableType - ts_asset_selector']",
            INHERITANCE_DATA_PICKER_WITH_TIME = "[data-test-id='DateWithTimeInputLineVariableType - ts_dpwt']",
            INHERITANCE_RELATION = "[data-test-id='RelationVariableType - ts_relation']",
            LEFT_FIELD = ".xdse-variabletype-multivalueinputline-column1",
            RIGHT_FIELD = ".xdse-variabletype-multivalueinputline-column2",
            XDSE_INFORMATION_LABEL_MARKED = ".xdse-information-label-marked",
            COMMONS_SAVE_TO_LOWER_CASE_BUTTON = "commons.saveToLowerCase.button",
            TEST_MESSAGE = "text for ",
            DATA_TEST_ID = "data-test-id",
            RESOURCES_PREFIX = "FindJobDo_";

    public static ElementsCollection getTabWithName(String tabName) {
        return $$(".xdse-panel-tabscontainer .x-box-scroller-body-horizontal a").filterBy(text(tabName));
    }

    public void clickOnSave() {
        $(SAVE_BUTTON).shouldBe(visible, Duration.ofSeconds(20)).click();
        $(SAVE_BUTTON).shouldBe(hidden, Duration.ofSeconds(40));
        $(".x-toast").shouldBe(visible);
    }

    public void clickOnCloseItem() {
        switchTo().parentFrame();
        SelenideElement closeItemButton = $(CLOSE_DSE_EDITOR_POPUP);
        closeItemButton.shouldBe(enabled, Duration.ofSeconds(10)).click();
        $("#dseOverviewTabPanel-body").shouldBe(visible, Duration.ofSeconds(10));
    }

    public void selectTabIntoJobEditor(String nameOfTAB) {
        if ($(LOCATOR_DSE_EDITOR_FRAME).isDisplayed())
            switchTo().innerFrame(DSE_EDITOR_FRAME);
        SelenideElement tab = getTabWithName(nameOfTAB).get(0);
        $$(JOB_TABS_NAME).findBy(text(getResourceValue(RESOURCES_PREFIX, "JobDiscussion"))).shouldBe(visible, Duration.ofSeconds(10));
        boolean flagOfVisibility = tab.is(hidden);
        if (flagOfVisibility) {
            $(RIGHT_ARROW_ON_TAB_LINE).shouldBe(visible, Duration.ofSeconds(40));
            while (!tab.is(visible)) {
                for (int i = 0; i < 10; i++)
                    $(RIGHT_ARROW_ON_TAB_LINE).click();
            }
            for (int i = 0; i < 3; i++)
                $(RIGHT_ARROW_ON_TAB_LINE).click();
        }
        tab.click();
    }

    public void isUnsavedChangesDisplayed(boolean b) {
        List<String> buttons = List.of("UnsavedChanges", "UndoChanges", "ButtonSave");
        String p = (b) ? " " : " not ";
        buttons.forEach(button ->
        {
            String label = getResourceValue(RESOURCES_PREFIX, button);
            if (b) {
                $(XDSE_INFORMATION_LABEL_MARKED).shouldBe(visible.because(errorMessage(label, p)));
            } else {
                $(XDSE_INFORMATION_LABEL_MARKED).shouldNotBe(visible.because(errorMessage(label, p)));
            }
        });
    }

    private String errorMessage(String button, String prefix) {
        return "*** ERROR: Button <" + button + "> should be" + prefix + "visible!";
    }

    public void selectValueInComboBox(String comboBoxVariable) {
        $(comboBoxVariable).scrollIntoView(true).shouldBe(visible, Duration.ofSeconds(40));
        $(comboBoxVariable + " .x-form-arrow-trigger-default").click();
        $$(".x-boundlist-item").findBy(text("RGB")).shouldBe(visible, Duration.ofSeconds(10)).click();
    }

    public void writeInLeftField() {
        $(MULTIPLE_VALUES_INPUT_LINES).scrollIntoView(true).shouldBe(visible, Duration.ofSeconds(20));
        $(LEFT_FIELD).click();
        $(LEFT_FIELD).$("input").setValue(TEST_MESSAGE + "left field");
    }

    public void writeInRightField() {
        $(MULTIPLE_VALUES_INPUT_LINES).scrollIntoView(true).shouldBe(visible, Duration.ofSeconds(20));
        $(RIGHT_FIELD).click();
        $(RIGHT_FIELD).$("input").setValue(TEST_MESSAGE + "right field");
    }

    private void writeTextInSingleInputLine(String value) {
        $(INHERITANCE_SINGLE_INPUT_LINE).scrollIntoView(true).shouldBe(visible, Duration.ofSeconds(20));
        SelenideElement input = $(INHERITANCE_SINGLE_INPUT_LINE).$("input");
        input.shouldBe(visible).click();
        input.setValue(value);
    }

    public void writeTextInMultiLineInputArea() {
        $(MULTI_LINE_INPUT_AREA).scrollIntoView(true).shouldBe(visible, Duration.ofSeconds(50));
        SelenideElement inputField = $(MULTI_LINE_INPUT_AREA + " textarea").scrollIntoView(true)
                .shouldBe(visible, Duration.ofSeconds(30));
        inputField.setValue(TEST_MESSAGE + "Multiline Input Area variable");
    }

    public void writeTextInNumbers(int numberValue) {
        $(NUMBER).scrollIntoView(true).shouldBe(visible, Duration.ofSeconds(20));
        $(NUMBER + " input").setValue(String.valueOf(numberValue));
        ElementsCollection metricsTriangle = $(NUMBER).$$(".x-form-arrow-trigger-default");
        metricsTriangle.get(1).click(usingJavaScript());
        $$(".x-boundlist li").get(1).shouldBe(visible, Duration.ofSeconds(30)).click();
    }

    public void setSingleInputLineVariable(String value) {
        writeTextInSingleInputLine(value);
        clickOnSave();
        SelenideElement saveButton = $(EDITOR_TOOLBAR).find(byText(getCommonResourceValue(COMMONS_SAVE_TO_LOWER_CASE_BUTTON)));
        saveButton.shouldNotBe(visible);
    }

    public void setNumbersVariable(int numberValue) {
        writeTextInNumbers(numberValue);
        SelenideElement saveButton = $(EDITOR_TOOLBAR)
                .find(byText(getCommonResourceValue(COMMONS_SAVE_TO_LOWER_CASE_BUTTON)));
        clickOnSave();
        saveButton.shouldNotBe(visible);
    }

    public void setDataPickerVariable(String date) {
        String day = extractDayFromDate(date);
        String month = extractMonthFromDate(date);
        $(DATA_PICKER).scrollIntoView(true).shouldBe(visible);
        $(DATA_PICKER + " .x-form-trigger-default").scrollIntoView(true).click();
        $("tbody [aria-label='" + month + " " + day + "']").click();
        SelenideElement saveButton = $(EDITOR_TOOLBAR)
                .find(byText(getCommonResourceValue(COMMONS_SAVE_TO_LOWER_CASE_BUTTON)));
        clickOnSave();
        saveButton.shouldNotBe(visible);
    }

    public void setDataPickerWithTimeVariable(String date) {
        String day = extractDayFromDate(date);
        String month = extractMonthFromDate(date);
        $(INHERITANCE_DATA_PICKER_WITH_TIME).scrollIntoView(true).shouldBe(visible);
        $(INHERITANCE_DATA_PICKER_WITH_TIME + " .x-form-trigger-default").scrollIntoView(true).click();
        $("tbody [aria-label='" + month + " " + day + "']").click();
        SelenideElement saveButton = $(EDITOR_TOOLBAR)
                .find(byText(getCommonResourceValue(COMMONS_SAVE_TO_LOWER_CASE_BUTTON)));
        clickOnSave();
        saveButton.shouldNotBe(visible);
    }

    public void setComboBoxVariable() {
        selectValueInComboBox(COMBO_BOX);
        SelenideElement saveButton = $(EDITOR_TOOLBAR)
                .find(byText(getCommonResourceValue(COMMONS_SAVE_TO_LOWER_CASE_BUTTON)));
        clickOnSave();
        saveButton.shouldNotBe(visible);
    }
}
