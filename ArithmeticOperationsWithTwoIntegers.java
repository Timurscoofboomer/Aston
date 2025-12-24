package example.com;

import java.util.Scanner;

public class ArithmeticOperationsWithTwoIntegers {
    private int firstInt;
    private int secondInt;
    ArithmeticOperationsWithTwoIntegers(int firstInt, int secondInt){
        this.firstInt = firstInt;
        this.secondInt = secondInt;
    }

    int getAddition(){
        return firstInt + secondInt;
    }

    int getSubtraction(){
        return firstInt - secondInt;
    }

    double getDivision() {
        if (secondInt == 0) {
            throw new ArithmeticException("Деление на ноль невозможно");}
            return (double) firstInt / secondInt;
        }

        int getMultiplication(){
        return firstInt * secondInt;
    }

    public static void main(String[] args) {
        System.out.println("Введите два целых числа");

        Scanner sc = new Scanner(System.in);
        int firstInt = sc.nextInt();
        int secondInt = sc.nextInt();

        ArithmeticOperationsWithTwoIntegers aowti = new ArithmeticOperationsWithTwoIntegers(firstInt, secondInt);

        System.out.println("Сумма чисел равна " + aowti.getAddition());
        System.out.println("Разница чисел равна " + aowti.getSubtraction());

        try {
            System.out.println("Результат деления чисел равен " + aowti.getDivision());
        } catch (ArithmeticException e) {
            System.out.println("Деление на ноль невозможно");
                    }
        System.out.println("Умножение чисел равно " + aowti.getMultiplication());
sc.close();
    }
}
