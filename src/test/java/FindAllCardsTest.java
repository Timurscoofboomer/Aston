import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class FindAllCardsTest extends BaseSetUpTest {

    @Test
    @DisplayName("Проверка наличия логотипов платёжных систем")
    void findAllCardsTest() {

        WebElement visaLogo = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//img[@alt='Visa']")));
        Assertions.assertTrue(visaLogo.isDisplayed(), "Логотип Visa не отображается на странице");

        WebElement verifiedByVisaLogo = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//img[@alt='Verified By Visa']")));
        Assertions.assertTrue(verifiedByVisaLogo.isDisplayed(), "Verified By Visa не отображается на странице");

        WebElement masterCardLogo = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//img[@alt='MasterCard']")));
        Assertions.assertTrue(masterCardLogo.isDisplayed(), "Логотип MasterCard не отображается на странице");

        WebElement masterCardSecureCodeLogo = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//img[@alt='MasterCard Secure Code']")));
        Assertions.assertTrue(masterCardSecureCodeLogo.isDisplayed(), "Логотип MasterCard Secure Code не отображается на странице");

        WebElement belcardLogo = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//img[@alt='Белкарт']")));
        Assertions.assertTrue(belcardLogo.isDisplayed(), "Логотип Белкарт не отображается на странице");
    }
}
