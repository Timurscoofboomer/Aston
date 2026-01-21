import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class PaymentPage {
    private final WebDriver driver;
    private final WebDriverWait wait;

    private final By paymentIframe = By.xpath("//iframe[contains(@src,'bepaid')]");

    private final By amountLocator = By.xpath("//span[contains(normalize-space(),'BYN')]");
    private final By payButtonLocator = By.xpath("//span[contains(text(),'Оплатить')]");
    private final By phoneLocator = By.xpath("//span[contains(text(),'Номер:')]");
    private final By cardNumberLabelLocator = By.xpath("//label[contains(text(),'Номер карты')]");
    private final By expirationDateLabelLocator = By.xpath("//input[@formcontrolname='expirationDate']/following-sibling::label");
    private final By cvcLabelLocator = By.xpath("//input[@formcontrolname='cvc']/following-sibling::label");
    private final By cardHolderLabelLocator = By.xpath("//input[@formcontrolname='holder']/following-sibling::label");

    private final By visaLogoLocator = By.cssSelector("img[src*='visa-system.svg']");
    private final By mastercardLogoLocator = By.cssSelector("img[src*='mastercard-system.svg']");
    private final By belkartLogoLocator = By.cssSelector("img[src*='belkart-system.svg']");
    private final By mirLogoLocator = By.cssSelector("img[src*='mir-system-ru.svg']");

    public PaymentPage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    public String getAmountText() {
        // ждём iframe bePaid и переключаемся в него
        wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(paymentIframe));
        WebElement amountElement = wait.until(ExpectedConditions.visibilityOfElementLocated(amountLocator));
        String amount = amountElement.getText().trim();
        driver.switchTo().defaultContent();
        return amount;
    }


    public String getPayButtonText() {

        wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(paymentIframe));
        WebElement payButtonElement = wait.until(ExpectedConditions.visibilityOfElementLocated(payButtonLocator));
        String text = payButtonElement.getText().trim().replaceAll("\\s+", " ");
        driver.switchTo().defaultContent();
        return text;
    }

    public String getPhoneNumber() {

        wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(paymentIframe));
        WebElement phoneElement = wait.until(ExpectedConditions.visibilityOfElementLocated(phoneLocator));
        String text = phoneElement.getText().trim();
        String phone = text.split("Номер:")[1].trim();
        driver.switchTo().defaultContent();
        return phone;
    }


    public String getCardNumberPlaceholder() {
        wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(paymentIframe));
        WebElement label = wait.until(ExpectedConditions.visibilityOfElementLocated(cardNumberLabelLocator));
        String text = label.getText().trim();
        driver.switchTo().defaultContent();
        return text;

    }

    public String getExpirationDatePlaceholder() {
        wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(paymentIframe));
        WebElement label = wait.until(ExpectedConditions.visibilityOfElementLocated(expirationDateLabelLocator));
        String text = label.getText().trim();
        driver.switchTo().defaultContent();
        return text;
    }

    public String getCvcPlaceholder() {
        wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(paymentIframe));
        WebElement label = wait.until(ExpectedConditions.visibilityOfElementLocated(cvcLabelLocator));
        String text = label.getText().trim();
        driver.switchTo().defaultContent();
        return text;
    }

    public String getCardHolderPlaceholder() {
        wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(paymentIframe));
        WebElement label = wait.until(ExpectedConditions.visibilityOfElementLocated(cardHolderLabelLocator));
        String text = label.getText().trim();
        driver.switchTo().defaultContent();
        return text;
    }

    public boolean isVisaLogoDisplayed() {
        try {
            wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(paymentIframe));

            WebElement logo = wait.until(ExpectedConditions.visibilityOfElementLocated(visaLogoLocator));
            boolean displayed = logo.isDisplayed();

            driver.switchTo().defaultContent();

            return displayed;
        } catch (Exception e) {
            driver.switchTo().defaultContent();
            return false;
        }
    }


    public boolean isMastercardLogoDisplayed() {
         try {
        wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(paymentIframe));
        WebElement logo = wait.until(ExpectedConditions.visibilityOfElementLocated(mastercardLogoLocator));
        boolean displayed = logo.isDisplayed();
        driver.switchTo().defaultContent();
        return displayed;
    } catch (Exception e) {
        driver.switchTo().defaultContent();
        return false;
    }
}

    public boolean isBelkartLogoDisplayed() {
        try {
            wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(paymentIframe));
            WebElement logo = wait.until(ExpectedConditions.visibilityOfElementLocated(belkartLogoLocator));
            boolean displayed = logo.isDisplayed();
            driver.switchTo().defaultContent();
            return displayed;
        } catch (Exception e) {
            driver.switchTo().defaultContent();
            return false;
        }
    }

    public boolean isMirLogoDisplayed() {
        try {

            wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(paymentIframe));

            int timeoutSeconds = 10;
            int waited = 0;
            int interval = 500;

            while (waited < timeoutSeconds * 1000) {
                WebElement logo = driver.findElement(mirLogoLocator);

                String opacity = logo.getCssValue("opacity");
                String transform = logo.getCssValue("transform");

                if (logo.isDisplayed() && "1".equals(opacity) && !transform.contains("scale(0")) {
                    // элемент видим и анимация закончена
                    driver.switchTo().defaultContent();
                    return true;
                }

                Thread.sleep(interval);
                waited += interval;
            }

            // Таймаут — элемент так и не появился
            driver.switchTo().defaultContent();
            return false;

        } catch (Exception e) {
            driver.switchTo().defaultContent();
            return false;
        }
    }

}






