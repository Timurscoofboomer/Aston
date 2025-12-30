
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import static org.junit.jupiter.api.Assertions.*;

public class MoreAboutServiceTest extends  BaseSetUpTest {
    @Test
    @DisplayName("Проверка работы ссылки 'Подробнее о сервисе'")
    void moreAboutServiceTest(){

        WebElement moreAboutServiceLink = wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Подробнее о сервисе")));
        assertTrue(moreAboutServiceLink.isDisplayed(), "Ссылка 'Подробнее о сервисе' не отображается");

        moreAboutServiceLink.click();

        wait.until(ExpectedConditions.urlContains("/help/poryadok-oplaty-i-bezopasnost-internet-platezhey/"));

        assertTrue(driver.getCurrentUrl().contains("/help/poryadok-oplaty-i-bezopasnost-internet-platezhey/"), "Не открыта страница по ссылке 'Подробнее о сервисе'");

    }
}
