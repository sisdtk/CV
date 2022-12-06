package pages;

import com.codeborne.selenide.SelenideElement;
import admin.config.AbstractUITest;
import io.cucumber.java.en.Given;

import java.time.Duration;
import java.util.Objects;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class LoginDo extends AbstractUITest {
    private static final String RESOURCES_PREFIX = "LoginDo_",
            LOGIN_PAGE = "#auth-root",
            LOGIN_BUTTON = "[data-test-id='login-form-button']",
            WORK_AREA = "#workArea",
            BUTTONS = WORK_AREA + " .buttons",
            H2_TITLE = WORK_AREA + " h2.title",
            USER_NAME = "#userName",
            PASSWORD = "#password",
            JS_CODE_USER_NAME = "document.querySelector(\"" + USER_NAME + "\").value = arguments[0]",
            JS_CODE_PASSWORD = "document.querySelector(\"" + PASSWORD + "\").value = arguments[0]",
            LOGIN_FORM = "#login-form",
            CONTAINER_MIDDLE = "#containerMiddle",
            LABEL_VALIDATE_USER_EMAIL = "labelValidateUserEmail",
            BUTTON_CONFIRM = "buttonConfirm",
            BUTTON_CHECK_LATER = "buttonCheckLater",
            BUTTON_CONTINUE = "buttonContinue",
            IS_ACCEPTED_CHECK_BOX = "#isAcceptedCheckBox",
            LABEL_GTC = "labelGTC";

    public void loginViaJS(String name, String password) {
        open(workingHost);
        $(LOGIN_PAGE).shouldBe(visible, Duration.ofSeconds(20));
        $(LOGIN_FORM).shouldBe(visible);
        executeJavaScript(JS_CODE_USER_NAME, name);
        executeJavaScript(JS_CODE_PASSWORD, password);
        $(LOGIN_BUTTON).click();

        checkRequestForGTC();
        checkValidateUserEmail();
    }

    private void checkRequestForGTC() {
        String labelGTC = getResourceValue(RESOURCES_PREFIX, LABEL_GTC);
        String labelContinue = getResourceValue(RESOURCES_PREFIX, BUTTON_CONTINUE);

        if ($(CONTAINER_MIDDLE).is(visible)
                && Objects.requireNonNull(title()).contains(labelGTC)) {
            $(IS_ACCEPTED_CHECK_BOX).click();
            SelenideElement buttonContinue = $(BUTTONS).find(byText(labelContinue));
            buttonContinue.shouldBe(enabled);
            buttonContinue.click();
        }
    }

    private void checkValidateUserEmail() {
        String labelValidateUserEmail = getResourceValue(RESOURCES_PREFIX, LABEL_VALIDATE_USER_EMAIL);
        String buttonConfirm = getResourceValue(RESOURCES_PREFIX, BUTTON_CONFIRM);
        String buttonCheckLater = getResourceValue(RESOURCES_PREFIX, BUTTON_CHECK_LATER);
        if ($(CONTAINER_MIDDLE).is(visible)) {
            if ($(H2_TITLE).is(not(visible))) {
                return;
            }
            if ($(H2_TITLE).text().contains(labelValidateUserEmail)) {
                $(WORK_AREA).find(byText(buttonConfirm)).shouldBe(visible);
                $(WORK_AREA).find(byText(buttonCheckLater)).click();
            }
        }
    }
}
