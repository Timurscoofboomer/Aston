import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class PaymentFormTest extends BaseSetUpTest{

    @Test
    @DisplayName("Смоук-тест формы оплаты")
    void testingOfPaymentForm(){

        WebElement serviceType = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".select__now")));
        Assertions.assertEquals("Услуги связи", serviceType.getText(), "Не выбран вариант 'Услуги связи'");

        WebElement phoneInput = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("connection-phone")));
        phoneInput.sendKeys("297777777");

        WebElement sumInput = driver.findElement(By.id("connection-sum"));
        sumInput.sendKeys("50");

        WebElement emailInput = driver.findElement(By.id("connection-email"));
        emailInput.sendKeys("test@example.com");

        WebElement continueButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[contains(text(),'Продолжить')]")));
        Assertions.assertTrue(continueButton.isEnabled(), "Кнопка 'Продолжить' не активна");
        continueButton.click();

    }
}
