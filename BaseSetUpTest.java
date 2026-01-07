import io.github.bonigarcia.wdm.WebDriverManager;
import io.qameta.allure.Attachment;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class BaseSetUpTest {

    protected WebDriver driver;
    protected WebDriverWait wait;

    @BeforeEach
    protected void setUp() {
        WebDriverManager.chromedriver().browserVersion("143").setup();
        driver = new ChromeDriver();
        wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        driver.get("https://mts.by");

        acceptCookiesIfPresent();

        setZoomLevel(0.50);
    }

    protected void setZoomLevel(double zoom) {
        ((JavascriptExecutor) driver).executeScript(
                "document.body.style.zoom = arguments[0];", String.valueOf(zoom)
        );
    }

    protected void acceptCookiesIfPresent() {
        try {
            WebElement acceptCookiesButton = wait.until(ExpectedConditions.elementToBeClickable(By.id("cookie-agree")));
            acceptCookiesButton.click();
        } catch (Exception ignored) {

        }
    }

    @AfterEach
    protected void tearDown() {
        attachScreenshot();
        driver.quit();
    }

    @Attachment(value = "Screenshot", type = "image/png")
    public byte[] attachScreenshot() {
        return ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
    }
}