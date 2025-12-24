package example.com;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

public class FactorialTest {
Factorial factorial = new Factorial();

@Test
    @DisplayName("Факториал нуля должен быть единицей")

    void testFactorialOfZero(){
    long result = factorial.getFactorial(0);
    assertEquals(1, result, "ошибка");
}

@Test
    @DisplayName("Факториал единицы должен быть единицей ")
    void testFactorialOfOne(){
    long result = factorial.getFactorial(1);
    assertEquals(1, result, "ошибка");
    }

    @Test
@DisplayName("Факториал десяти должен быть 3628800")
void testOfFactorialOfTen(){
        long result = factorial.getFactorial(10);
        assertEquals(3628800, result, "ошибка");
}

@Test
    @DisplayName("Факториала у отрицательного числа нет")
    void testOfNegativeNumber(){
    try { factorial.getFactorial(-1);
        fail ("ожидалось исключение IllegalArgumentException");}
    catch (IllegalArgumentException e){}
}

@Test
@DisplayName("Число больше 20 бросает исключение IllegalArgumentException")
void factorialOfNumberMoreThenTwenty(){
try {
    long result = factorial.getFactorial(21);
    fail("Ожидалось исключение IllegalArgumentException");
} catch (IllegalArgumentException e){}
}
}