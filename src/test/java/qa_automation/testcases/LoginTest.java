package qa_automation.testcases;

import com.fasterxml.jackson.databind.JsonNode;
import qa_automation.base.BaseSetup;
import qa_automation.pages.LoginPage;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import qa_automation.utils.DataUtil;

import java.util.Map;

public class LoginTest extends BaseSetup {
    private LoginPage loginPage;
    private JsonNode testData;

    @BeforeClass
    public void setupTest() {
        loginPage = new LoginPage(driver);
        navigateToBaseUrl();
        testData = DataUtil.getDataFromJson("D:\\mcareer-automation\\src\\test\\java\\qa_automation\\data\\credential.json");
    }

    @Test
    public void loginTest() {
        String username = testData.get("user").get("username").asText();
        String password = testData.get("user").get("password").asText();
        loginPage.inputEmail(username);
        loginPage.inputPassword(password);
        loginPage.clickOnLoginButton();
    }
}
