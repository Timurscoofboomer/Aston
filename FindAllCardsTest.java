import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class FindAllCardsTest extends BaseSetUpTest{
    @Test
    @DisplayName("Проверка наличия логотипов платёжных систем")
    void findAllCardsTest(){
        MainPage mainPage = new MainPage(driver, wait);
        assertTrue(mainPage.isVisaLogoOnThePage(), "Логотип Visa не отображается на странице");
        assertTrue(mainPage.isVerifiedByVisaLogoOnThePage(), "Verified By Visa не отображается на странице");
        assertTrue(mainPage.isMasterCardLogoOnThePage(), "Логотип MasterCard  не отображается на странице");
        assertTrue(mainPage.isMasterCardSecureCodeLogoOnThePage(), "MasterCard Secure Code не отображается на странице");
        assertTrue(mainPage.isBelcardLogoOnThePage(), "Belcard Logo не отображается на странице");
    }
}
