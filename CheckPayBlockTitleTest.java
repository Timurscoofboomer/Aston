import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class CheckPayBlockTitleTest extends BaseSetUpTest {
    @Test
    @DisplayName("Проверка названия блока 'Онлайн пополнение без комиссии'")
    void checkPayBlockTitle(){
        MainPage mainPage = new MainPage(driver, wait);
        String actualText = mainPage.getPayBlockTitleText();
        assertTrue(actualText.contains("Онлайн пополнение"));
        assertTrue(actualText.contains("без комиссии"));

    }
}
