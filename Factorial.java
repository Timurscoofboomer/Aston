package example.com;
import java.util.Scanner;
    public class Factorial {
        public long getFactorial(long value) {
            if (value < 0) {
                throw new IllegalArgumentException("Число должно быть неотрицательным");
            }
            if (value > 20) {
                throw new IllegalArgumentException("Число не должно быть больше 20");
            }
                long umn = 1;
                for (int i = 1; i <= value; i++) {
                    umn = umn * i;
                                }
                    return umn;
        }


    public static void main(String[] args) {
        Factorial factor = new Factorial();
        System.out.println("Введите неотрицательное число для вычисления факториала (не больше 20)");
        Scanner sc = new Scanner    (System.in);
        long value = sc.nextLong();

       try {
           System.out.println("Факториал числа "  + value + " равен " + factor.getFactorial(value));}
       catch (IllegalArgumentException e) {
           if (value < 0) {
           System.out.println("Число должно быть неотрицательным");}
           else if (value > 20) {
               System.out.println("Число не должно быть больше 20");
           }
       }
            sc.close();
        }
    }
