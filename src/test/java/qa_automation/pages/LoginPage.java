package qa_automation.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

public class LoginPage {
    private final WebDriver driver;

    private final By userName = By.xpath("//input[@name='username']");
    private final By password = By.xpath("//input[@name='password']");
    private  final By submitButton = By.xpath("//button[@type='submit']");

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }


    public WebElement getUserNameElement() {
        return driver.findElement(userName);
    }

    public WebElement getPasswordElement() {
        return driver.findElement(password);
    }

    public WebElement getSubmitButtonElement() {
        return driver.findElement(submitButton);
    }
//
//    public void loginShouldBeSuccesfully(String username, String password) throws Exception {
//        inputEmail(username);
//        inputPassword(password);
//        clickSignIn();
//        Thread.sleep(1000);
//        clickSubmit();
//    }


    public void inputEmail(String email) {
        this.getUserNameElement().sendKeys(email);
    }

    public void inputPassword(String password) {
        this.getPasswordElement().sendKeys(password);
    }

    public void clickOnLoginButton() {
        this.getSubmitButtonElement().click();
    }

    public void waitForPageLoaded() {
        ExpectedCondition<Boolean> expectation = new ExpectedCondition<Boolean>() {
            public Boolean apply(WebDriver driver) {
                return ((JavascriptExecutor) driver).executeScript("return document.readyState").toString()
                        .equals("complete");
            }
        };
        try {
            Thread.sleep(1000);
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
            wait.until(expectation);
        } catch (Throwable error) {
            Assert.fail("Timeout waiting for Page Load Request to complete.");
        }
    }
}
