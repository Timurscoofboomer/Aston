import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class MoreAboutServiceTest extends  BaseSetUpTest{
    @Test
    @DisplayName("Проверка работы ссылки 'Подробнее о сервисе'")
    void moreAboutServiceTest(){

        MainPage mainPage = new MainPage(driver, wait);
        assertTrue(mainPage.isMoreAboutServiceLinkDisplayed(),"Ссылка 'Подробнее о сервисе' не отображается");
        mainPage.clickMoreAboutServiceLink();
        assertTrue(mainPage.isMoreAboutServicePageOpened(), "Не открыта страница по ссылке 'Подробнее о сервисе'");

    }

}
