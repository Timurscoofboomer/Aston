package example.com;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ComparisonOfTwoNumbertTest {
    @Test
    @DisplayName("Первое число равно второму")
    void sravnenieMethodTest() {
        String result = ComparisonOfTwoNumbers.comparison(5, 5);
        assertEquals("Первое число равно второму", result);
    }

    @Test
    @DisplayName("Первое число меньше второго")
    void sravnenieMethodTest2() {
        String result2 = ComparisonOfTwoNumbers.comparison(1, 3);
        assertEquals("Первое число меньше второго", result2);
    }

    @Test
    @DisplayName("Первое число больше второго")
    void sravnenieMethodTest3() {
        String result3 = ComparisonOfTwoNumbers.comparison(1000, 2);
        assertEquals("Первое число больше второго", result3);
    }
}