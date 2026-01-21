import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class PlaceHoldersCheckTest extends BaseSetUpTest{
    @Test
    @DisplayName("Проверка плейсхолдеров")

    void doSelectCommunicationServices() {
        MainPage mainPage = new MainPage(driver, wait);

        mainPage.selectService("Услуги связи");
        assertEquals("Номер телефона", mainPage.getPlaceholder(mainPage.phoneInput),
                "Неверный placeholder в поле 'Номер телефона' у варианта 'Услуги связи'");
        assertEquals("Сумма", mainPage.getPlaceholder(mainPage.sumInput),
                "Неверный placeholder в поле 'Сумма' у варианта 'Услуги связи'");
        assertEquals("E-mail для отправки чека", mainPage.getPlaceholder(mainPage.emailInput),
                "Неверный placeholder в полe 'E-mail для отправки чека' у варианта 'Услуги связи'");

        mainPage.selectService("Домашний интернет");
        assertEquals("Номер абонента", mainPage.getPlaceholder(mainPage.subscriberNumberInput),
                "Неверный placeholder в поле 'Номер абонента' у варианта 'Домашний интернет'");
        assertEquals("Сумма", mainPage.getPlaceholder(mainPage.sumInput2),
                "Неверный placeholder в поле 'Сумма' у варианта 'Домашний интернет");
        assertEquals("E-mail для отправки чека",  mainPage.getPlaceholder(mainPage.emailInput2),
                "Неверный placeholder в поле 'E-mail для отправки чека' у варианта 'Домашний интернет");

        mainPage.selectService("Рассрочка");
        assertEquals("Номер счета на 44", mainPage.getPlaceholder(mainPage.accountNumberInput),
                "Неверный placeholder в поле 'Номер счета на 44' у варианта 'Рассрочка'");
        assertEquals("Сумма", mainPage.getPlaceholder(mainPage.sumInput3),
                "Неверный placeholder в поле 'Сумма' у варианта 'Рассрочка'");
        assertEquals("E-mail для отправки чека", mainPage.getPlaceholder(mainPage.emailInput3),
                "Неверный placeholder в поле 'E-mail для отправки чека' у варианта 'Рассрочка'");

        mainPage.selectService("Задолженность");
        assertEquals("Номер счета на 2073", mainPage.getPlaceholder(mainPage.accountNumberForArrearInput),
                "Неверный placeholder в поле 'Номер счета на 2073' у варианта 'Задолженность'");
        assertEquals("Сумма", mainPage.getPlaceholder(mainPage.sumInput4),
                "Неверный placeholder в поле 'Сумма' у варианта 'Задолженность'");
        assertEquals("E-mail для отправки чека", mainPage.getPlaceholder(mainPage.emailInput4),
                "Неверный placeholder в поле 'E-mail для отправки чека' у варианта 'Задолженность'");
    }
}
