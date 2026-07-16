package customerPortal;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseClass {
    public WebDriver driver;       
    public WebDriverWait wait;

    // Runs automatically BEFORE EVERY @Test method in your test classes
    @BeforeMethod
    public void openBrowser() {
        driver = new ChromeDriver();
        wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        driver.manage().window().maximize();
        driver.get("https://customer-v2.traderzdev.com");
    }

    // Runs automatically AFTER EVERY @Test method in your test classes
    @AfterMethod(alwaysRun = true)
    public void closeBrowser() {
        if (driver != null) {
            driver.quit(); // Closes the browser cleanly after the test case finishes
        }
    }
}
