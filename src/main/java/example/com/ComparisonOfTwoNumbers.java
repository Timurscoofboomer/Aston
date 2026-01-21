package example.com;

import java.util.Scanner;

public class ComparisonOfTwoNumbers {

   static String comparison(int firstNum, int secondNum){
        if (firstNum == secondNum) {
           return "Первое число равно второму";
        } else if (firstNum < secondNum) {
            return "Первое число меньше второго";
        } else {
            return "Первое число больше второго";
        }

         }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите два числа");
        int firstNum = sc.nextInt();
        int secondNum = sc.nextInt();

        System.out.println(comparison(firstNum, secondNum));
        sc.close();
    }
}
