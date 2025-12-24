package example.com;

import org.testng.Assert;
import org.testng.annotations.Test;

public class ArithmeticOperationsWithTwoIntegersTestNG {

    @Test (description = "Деление на ноль бросает исключение ArithmeticException",
    expectedExceptions = ArithmeticException.class)
    public void divisionToZeroTest(){
        ArithmeticOperationsWithTwoIntegers obj = new ArithmeticOperationsWithTwoIntegers(2, 0);
        obj.getDivision();
    }

    @Test(description = "Сложение двух чисел")
    public void additionTest(){
    ArithmeticOperationsWithTwoIntegers obj = new ArithmeticOperationsWithTwoIntegers(3, 4);
    int sum = obj.getAddition();
    Assert.assertEquals(sum, 7, "сложением 3 и 4 должна быть 7");
    }

@Test(description = "Вычитание чисел")
public void subtractionTest(){
    ArithmeticOperationsWithTwoIntegers obj = new ArithmeticOperationsWithTwoIntegers(3, 5);
    Assert.assertEquals(obj.getSubtraction(), -2, "вычитанием из числа 3 числа 5 должно быть -2");
}

    @Test (description = "Умножение двух чисел")
    public void multiplicationTest() {
        ArithmeticOperationsWithTwoIntegers obj = new ArithmeticOperationsWithTwoIntegers(6, 7);
        Assert.assertEquals( obj.getMultiplication(), 42, "6 * 7 должно быть 42");
    }

    @Test (description = "Деление двух чисел")
    public void divisionTest() {
        ArithmeticOperationsWithTwoIntegers obj = new ArithmeticOperationsWithTwoIntegers(10, -2);
        Assert.assertEquals(obj.getDivision(), -5,  "10 / -2 должно быть -5");
    }
}