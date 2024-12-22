package qa_automation.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseSetup {
    protected WebDriver driver;
    private String baseUrl = "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login"; // URL cố định

    @BeforeClass
    public void setUp() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        System.out.println("Driver initialized");

        navigateToBaseUrl();
    }

    public void navigateToBaseUrl() {
        driver.get(baseUrl);
    }

    @AfterClass
    public void tearDown() {
        if (driver != null) {
            System.out.println("Driver closed");
        }
    }
}