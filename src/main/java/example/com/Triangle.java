package example.com;
import java.util.Scanner;

public class Triangle {
    int sideA;
    int sideB;
    int sideC;

    Triangle(int sideA, int sideB, int sideC){
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }

    double getArea(){
        double p = (sideA + sideB + sideC) / 2.0;
        double s = Math.sqrt(p * (p - sideA) * (p - sideB) * (p - sideC));
        return s;
        }

    boolean isValidTriangle() {
        return (sideA + sideB > sideC) &&
                (sideA + sideC > sideB) &&
                (sideB + sideC > sideA);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Введите первую сторону треуголника");
        int sideA = sc.nextInt();
        System.out.println("Введите вторую сторону треуголника");
        int sideB  = sc.nextInt();
        System.out.println("Введите третью сторону треуголника");
        int sideC = sc.nextInt();

        Triangle tr = new Triangle(sideA, sideB, sideC);

        if (tr.isValidTriangle()){
            System.out.println("Площадь треугольника равна " + tr.getArea());
        } else {
            System.out.println("Треугольник с такими сторонами не существует!");
            System.out.println("Сумма любых двух сторон должна быть больше третьей стороны.");

        }

        sc.close();

    }
}
