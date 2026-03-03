package customerPortal;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseClass {
    protected WebDriver driver;
    protected WebDriverWait wait;

    // Runs once before any @Test methods in the subclass
    @BeforeClass
    public void beforeAll() {
        openBrowser();
    }

    // Runs once after all @Test methods in the subclass
    @AfterClass(alwaysRun = true)
    public void afterAll() {
        closeBrowser();
    }

    public void openBrowser() {
        driver = new ChromeDriver();
        wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        driver.manage().window().maximize();
        driver.get("https://customer-v2.traderzdev.com/auth/login");
    }

    public void closeBrowser() {
        if (driver != null) {
            driver.quit();
        }
    }
}
