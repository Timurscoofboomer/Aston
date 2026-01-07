import io.qameta.allure.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import java.math.BigDecimal;
import java.math.RoundingMode;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

@Epic("Онлайн-платежи")
@Feature("Форма оплаты")

public class PaymentFormTest extends BaseSetUpTest{
    @Test
    @Story("Услуги связи")
    @Severity(SeverityLevel.CRITICAL)
    @DisplayName("Форма оплаты: Услуги связи")
    void testingOfPaymentForm(){
MainPage mainPage = new MainPage(driver, wait);
    String selectedService = mainPage.getSelectedServiceType();
    assertEquals("Услуги связи", selectedService, "Не выбран вариант 'Услуги связи'");

        driver.manage().window().maximize();

        String enteredSum = "60.33";
        String enteredPhone = "297777777";

        BigDecimal sum = new BigDecimal(enteredSum).setScale(2, RoundingMode.HALF_UP);
        String expectedAmount = sum + " BYN";

        mainPage.enterPhone(enteredPhone);
        mainPage.enterSum(enteredSum);
        mainPage.enterEmail("timurrodriges@mail.ru");

        assertTrue(mainPage.isContinueButtonEnabled(), "Кнопка 'Продолжить' не активна");
        mainPage.clickContinueButton();

        PaymentPage paymentPage = new PaymentPage(driver);

        assertEquals(expectedAmount, paymentPage.getAmountText(), "Неверная сумма к оплате в модальном окне");

        String expectedPayButtonText = "Оплатить " + expectedAmount;
        assertEquals(expectedPayButtonText, paymentPage.getPayButtonText(), "Неверный текст на кнопке оплаты в модальном окне");

        String expectedPhone = "375" + enteredPhone;
        assertEquals(expectedPhone, paymentPage.getPhoneNumber(), "Номер телефона отображается некорректно");

        assertEquals("Номер карты", paymentPage.getCardNumberPlaceholder(), "Плейсхолдер номера карты отображается некорректно");
        assertEquals("Срок действия", paymentPage.getExpirationDatePlaceholder(), "Плейсхолдер срока действия отображается некорректно");
        assertEquals("CVC", paymentPage.getCvcPlaceholder(), "Плейсхолдер CVC отображается некорректно");
        assertEquals("Имя и фамилия на карте", paymentPage.getCardHolderPlaceholder(), "Плейсхолдер поля 'Имя и фамилия на карте' отображается некорректно");

        assertTrue(paymentPage.isVisaLogoDisplayed(), "Логотип Visa не отображается на странице оплаты");
        assertTrue(paymentPage.isMastercardLogoDisplayed(), "Логотип Mastercard не отображается на странице оплаты");
        assertTrue(paymentPage.isBelkartLogoDisplayed(), "Логотип Belkart не отображается на странице оплаты");
        assertTrue(paymentPage.isMirLogoDisplayed(), "Логотип Mir не отображается или ещё анимируется");

    }
}

