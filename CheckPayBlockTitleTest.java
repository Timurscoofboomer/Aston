    import org.junit.jupiter.api.Assertions;
    import org.junit.jupiter.api.DisplayName;
    import org.junit.jupiter.api.Test;
    import org.openqa.selenium.By;
    import org.openqa.selenium.WebElement;
    import org.openqa.selenium.support.ui.ExpectedConditions;

    public class CheckPayBlockTitleTest extends BaseSetUpTest {
    @Test
    @DisplayName("Проверка названия блока 'Онлайн пополнение без комиссии'")

        void checkPayBlockTitle(){

        WebElement title = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h2[contains(., 'Онлайн пополнение')]")));
        String actualText = title.getText();
        Assertions.assertTrue(actualText.contains("Онлайн пополнение"));
        Assertions.assertTrue(actualText.contains("без комиссии"));
    }
    }
