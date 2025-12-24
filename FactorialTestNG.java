package example.com;

import org.testng.Assert;
import org.testng.annotations.Test;


public class FactorialTestNG {

       Factorial factorial = new Factorial();

        @Test(description = "Факториал нуля должен быть единицей")
        public void testFactorialOfZero(){
        long result = factorial.getFactorial(0);
        Assert.assertEquals(result, 1);
        }

    @Test(description = "Факториал единицы должен быть единицей ")
    public void testFactorialOfOne(){
        long result = factorial.getFactorial(1);
        Assert.assertEquals(result, 1);
    }

    @Test(description = "Факториал десяти должен быть 3628800")
    public void testFactorialOfTen(){
        long result = factorial.getFactorial(10);
        Assert.assertEquals(result,3628800 );
    }
    @Test(
            description = "Факториала у отрицательного числа нет",
            expectedExceptions = IllegalArgumentException.class
    )
    public void testNegativeNumber() {
        factorial.getFactorial(-1);
    }

    @Test(
            description = "Число больше 20 бросает исключение",
            expectedExceptions = IllegalArgumentException.class
    )
    public void testNumberMoreThanTwenty() {
        factorial.getFactorial(21);
    }
}