package example.com;

import org.testng.Assert;
import org.testng.annotations.Test;

public class ComparisonOfTwoNumbertTestNG {

    @Test(description = "Первое число равно второму")
    public void sravnenieMethodTest() {
        String result = ComparisonOfTwoNumbers.comparison(5, 5);
        Assert.assertEquals(result, "Первое число равно второму");
    }

    @Test (description = "Первое число меньше второго")
    public void sravnenieMethodTest2() {
        String result2 = ComparisonOfTwoNumbers.comparison(1, 3);
        Assert.assertEquals(result2, "Первое число меньше второго");
    }

    @Test (description = "Первое число больше второго")
    public void sravnenieMethodTest3() {
        String result3 = ComparisonOfTwoNumbers.comparison(1000, 2);
        Assert.assertEquals(result3, "Первое число больше второго");
    }

}
