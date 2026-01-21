package example.com;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

public class ArithmeticOperationsWithTwoIntegersTest {
@Test
    @DisplayName("Деление на ноль бросает исключение ArithmeticException")

    void divisionToZeroTest(){
ArithmeticOperationsWithTwoIntegers obj = new ArithmeticOperationsWithTwoIntegers(2, 0);

try {
    obj.getDivision();
    fail ("Должно было бросить исключение ArithmeticException при делении на ноль");
} catch (ArithmeticException e){};
}

@Test
    @DisplayName("Сложение двух чисел")
    void additionTest(){
    ArithmeticOperationsWithTwoIntegers obj = new ArithmeticOperationsWithTwoIntegers(3, 4);
    int sum = obj.getAddition();
    assertEquals(7, sum, "сложением 3 и 4 должна быть 7");
    }

    @Test
@DisplayName("Вычитание чисел")
void subtractionTest(){
    ArithmeticOperationsWithTwoIntegers obj = new ArithmeticOperationsWithTwoIntegers(3, 5);
    assertEquals(-2, obj.getSubtraction(), "вычитанием из числа 3 числа 5 должно быть -2");
}

    @Test
    @DisplayName("Умножение двух чисел")
    void multiplicationTest() {
        ArithmeticOperationsWithTwoIntegers obj = new ArithmeticOperationsWithTwoIntegers(6, 7);
        assertEquals(42, obj.getMultiplication(), "6 * 7 должно быть 42");
    }

    @Test
    @DisplayName("Деление двух чисел")
    void divisionTest() {
        ArithmeticOperationsWithTwoIntegers obj = new ArithmeticOperationsWithTwoIntegers(10, -2);
        assertEquals(-5, obj.getDivision(), "10 / -2 должно быть -5");
    }

}