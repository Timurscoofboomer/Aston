import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MainPage {
    private final WebDriver driver;
    private final WebDriverWait wait;

    public MainPage(WebDriver driver, WebDriverWait wait) {
        this.driver = driver;
        this.wait = wait;
    }

    private final By payBlockTitle = By.xpath("//h2[contains(., 'Онлайн пополнение')]");
    private final By moreAboutServiceLink = By.linkText("Подробнее о сервисе");

    private final By visaLogo = By.xpath("//img[@alt='Visa']");
    private final By verifiedByVisaLogo = By.xpath("//img[@alt='Verified By Visa']");
    private final By masterCardLogo = By.xpath("//img[@alt='MasterCard']");
    private final By masterCardSecureCodeLogo = By.xpath("//img[@alt='MasterCard Secure Code']");
    private final By belcardLogo = By.xpath("//img[@alt='Белкарт']");

    private final By serviceType = By.cssSelector(".select__now");
    private final String serviceOptionXpath = "//ul[contains(@class,'select__list')]//p[normalize-space()='%s']";

    public final By phoneInput = By.id("connection-phone");
    public final By sumInput = By.id("connection-sum");
    public final By emailInput = By.id("connection-email");

    public final By subscriberNumberInput = By.id("internet-phone");
    public final By sumInput2 = By.id("internet-sum");
    public final By emailInput2 = By.id("internet-email");

    public final By accountNumberInput = By.id("score-instalment");
    public final By sumInput3 = By.id("instalment-sum");
    public final By emailInput3 = By.id("instalment-email");

    public final By accountNumberForArrearInput = By.id("score-arrears");
    public final By sumInput4 = By.id("arrears-sum");
    public final By emailInput4 = By.id("arrears-email");

    private final By continueButton = By.xpath("//button[contains(text(),'Продолжить')]");


    public String getPayBlockTitleText() {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(payBlockTitle)).getText();
    }

    public boolean isMoreAboutServiceLinkDisplayed() {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(moreAboutServiceLink)).isDisplayed();
    }

    public void clickMoreAboutServiceLink() {
        wait.until(ExpectedConditions.elementToBeClickable(moreAboutServiceLink)).click();
    }

    public boolean isMoreAboutServicePageOpened() {
        return wait.until(ExpectedConditions.urlContains("/help/poryadok-oplaty-i-bezopasnost-internet-platezhey/"));
    }

    public boolean isVisaLogoOnThePage() {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(visaLogo)).isDisplayed();
    }

    public boolean isVerifiedByVisaLogoOnThePage() {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(verifiedByVisaLogo)).isDisplayed();
    }

    public boolean isMasterCardLogoOnThePage() {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(masterCardLogo)).isDisplayed();
    }

    public boolean isMasterCardSecureCodeLogoOnThePage() {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(masterCardSecureCodeLogo)).isDisplayed();
    }

    public boolean isBelcardLogoOnThePage() {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(belcardLogo)).isDisplayed();
    }

    public String getSelectedServiceType() {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(serviceType)).getText();
    }

    public void enterPhone(String phone) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(phoneInput)).sendKeys(phone);
    }

    public void enterSum(String sum) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(sumInput)).sendKeys(sum);
    }

    public void enterEmail(String email) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(emailInput)).sendKeys(email);
    }

    public boolean isContinueButtonEnabled() {
        return wait.until(ExpectedConditions.elementToBeClickable(continueButton)).isEnabled();
    }

    public void clickContinueButton() {
        wait.until(ExpectedConditions.elementToBeClickable(continueButton)).click();
    }

    public void selectService(String serviceName) {
        wait.until(ExpectedConditions.elementToBeClickable(serviceType)).click();

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//ul[contains(@class,'select__list')]")));

        By option = By.xpath(String.format(serviceOptionXpath, serviceName));
        WebElement optionElement = wait.until(ExpectedConditions.elementToBeClickable(option));

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click();", optionElement);

        wait.until(ExpectedConditions.textToBePresentInElementLocated(serviceType, serviceName));
    }

    public String getPlaceholder(By locator) {
        WebElement element = wait.until(ExpectedConditions.presenceOfElementLocated(locator));
        wait.until(ExpectedConditions.visibilityOf(element));
        return element.getAttribute("placeholder");
    }

}