package testCases.UI;

import io.qameta.allure.Link;
import io.qameta.allure.Owner;
import admin.api.MRM.customAPI.JobMrmAPI;
import admin.config.AbstractUITest;
import pages.MrmGridOverviewUtils;
import pages.MrmItemEditorUtils;
import pages.LoginDo;
import org.apache.commons.lang3.RandomStringUtils;
import org.junit.jupiter.api.*;

import java.text.SimpleDateFormat;
import java.util.Calendar;

import static com.codeborne.selenide.Selenide.closeWebDriver;
import static admin.api.MRM.customAPI.MrmTypes.deleteMRMType;
import static java.lang.Integer.parseInt;
import static utils.ImportMRMtype.importMRMtype;

@Tags({@Tag("group"), @Tag("version"), @Tag("AdvancedSearch")})
@DisplayName("AdvancedSearch")
@Owner("Maxim Bastrygin")
@Link("www.jira.com")
public class AdvancedSearchTest extends AbstractUITest {
    public static final String RESOURCES_PREFIX = "FindJobDo_",
            NAME_OF_WORKFLOW = "@qa 2 steps",
            NAME_OF_MRM_TYPE = "@QA_Type_" + AdvancedSearchTest.class.getSimpleName(),
            NAME_OF_MRM_ITEM = "QA_Job_" + AdvancedSearchTest.class.getSimpleName(),
            NAME_OF_ITEM = NAME_OF_MRM_ITEM + "_" + RandomStringUtils.randomNumeric(6),
            TODAY = new SimpleDateFormat("MM/dd/yyyy").format(Calendar.getInstance().getTime());
    private final LoginDo loginDo = new LoginDo();
    private final MrmGridOverviewUtils mrm = new MrmGridOverviewUtils();
    private final MrmItemEditorUtils editor = new MrmItemEditorUtils();
    private final JobMrmAPI jobAPI = new JobMrmAPI();

    @BeforeAll
    static void beforeAll() {
        importMRMtype(NAME_OF_MRM_TYPE, NAME_OF_WORKFLOW);
    }

    @BeforeEach
    void beforeEach() {
        loginDo.loginViaJS(userName, passWord);
        jobAPI.createJob(NAME_OF_ITEM, NAME_OF_MRM_TYPE, NAME_OF_WORKFLOW);
        mrm.openJobUsingDeepLink(NAME_OF_ITEM);
        editor.selectTabIntoJobEditor(getResourceValue(RESOURCES_PREFIX, "typeSpannedVariablesTab"));
        editor.isUnsavedChangesDisplayed(false);
    }

    @AfterEach
    void tearDown() {
        jobAPI.deleteJob(NAME_OF_ITEM);
        logout();
    }

    @AfterAll
    static void afterAll() {
        deleteMRMType(NAME_OF_MRM_TYPE);
        closeWebDriver();
    }

    @Test
    @DisplayName("TS: Combo box")
    void advancedSearchTsComboBox() {
        editor.setComboBoxVariable();
        editor.clickOnCloseItem();
        mrm.createAdvancedSearchFilterWithoutSaving("TS: Combo box", "RGB");
        mrm.verifyDSEItem(NAME_OF_ITEM, true, 1);
    }

    @Test
    @DisplayName("TS: DP")
    void advancedSearchTsDP() {
        editor.setDataPickerVariable(TODAY);
        editor.clickOnCloseItem();
        mrm.createAdvancedSearchFilterWithoutSaving("TS: DP", TODAY);
        mrm.verifyDSEItem(NAME_OF_ITEM, true, 1);
    }

    @Test
    @DisplayName("TS: DPWT")
    void advancedSearchTsDPWT() {
        editor.setDataPickerWithTimeVariable(TODAY);
        editor.clickOnCloseItem();
        mrm.createAdvancedSearchFilterWithoutSaving("TS: DPWT", TODAY);
        mrm.verifyDSEItem(NAME_OF_ITEM, true, 1);
    }

    @Test
    @DisplayName("TS: Multiple values input lines")
    void advancedSearchTsMVIL() {
        editor.writeInLeftField();
        editor.writeInRightField();
        editor.clickOnSave();
        editor.clickOnCloseItem();
        mrm.createAdvancedSearchFilterWithoutSaving("TS: MVIL", "TS: Multiple values input lines");
        mrm.verifyDSEItem(NAME_OF_ITEM, true, 1);
    }

    @Test
    @DisplayName("TS: Multiple lines input area")
    void advancedSearchTsMLIA() {
        editor.writeTextInMultiLineInputArea();
        editor.clickOnSave();
        editor.clickOnCloseItem();
        mrm.createAdvancedSearchFilterWithoutSaving("TS: MLIA", "TS: Multiple lines input area");
        mrm.verifyDSEItem(NAME_OF_ITEM, true, 1);
    }

    @Test
    @DisplayName("TS:Numbers")
    void advancedSearchTsNumbers() {
        String value = "1";
        editor.setNumbersVariable(parseInt(value));
        editor.clickOnCloseItem();
        mrm.createAdvancedSearchFilterWithoutSaving("TS: Numbers", value);
        mrm.verifyDSEItem(NAME_OF_ITEM, true, 1);
    }

    @Test
    @DisplayName("TS: SIL")
    void advancedSearchTsSil() {
        editor.setSingleInputLineVariable("TS: SIL");
        editor.clickOnCloseItem();
        mrm.createAdvancedSearchFilterWithoutSaving("TS: SIL", "TS: SIL");
        mrm.verifyDSEItem(NAME_OF_ITEM, true, 1);
    }
}
