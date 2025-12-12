interface Shape {
    String getName();
    double getArea();

    default double getPerimeter(){
        return 0.0;
    }
}

class  Circle implements Shape{
     private double radius;
     String fillColor;
     String borderColor;

         public Circle (double radius, String fillColor, String borderColor){
             this.radius = radius;
             this.fillColor = fillColor;
             this.borderColor = borderColor;
     }

     @Override
    public  String getName() {
         return "Круг";
     }

     @Override
    public double getArea(){
         return Math.PI * radius * radius;
     }

     @Override
    public double getPerimeter() {
         return 2 * Math.PI * radius;
     }

}

class Rectangle implements Shape{
    private double width;
    private double height;
    String fillColor;
    String borderColor;
    public Rectangle (double width, double height, String fillColor, String borderColor){
        this.width = width;
        this.height = height;
        this.fillColor = fillColor;
        this.borderColor = borderColor;
    }

    @Override
    public String getName(){
        return "Прямоугольник";
    }

    @Override
    public double getArea(){
        return width * height;
    }

    @Override
    public double getPerimeter(){
        return 2 * (width + height);
    }
}

class Triangle implements Shape{
    private double sideA;
    private double sideB;
    private double sideC;
    String fillColor;
    String borderColor;

    public Triangle(double sideA, double sideB, double sideC, String fillColor, String borderColor) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
        this.fillColor = fillColor;
        this.borderColor = borderColor;
    }

    @Override
    public String getName(){
        return "Треугольник";
    }

    @Override
    public double getPerimeter(){
        return sideA + sideB + sideC;
    }

    @Override
    public double getArea(){
        double p = getPerimeter() / 2;
        return Math.sqrt(p * (p - sideA) * (p - sideB) * (p - sideC));
    }
}

public class Figures {
    public static void main(String[] args) {

        Circle circle = new Circle(5, "Красный", "Зеленый");
        Rectangle rectangle = new Rectangle(3, 4, "Синий", "Оранжевый");
        Triangle triangle = new Triangle(3, 4, 5, "Розовый", "Желтый");


        System.out.println( "Фигура: " + circle.getName() + " Площадь: " + circle.getArea() + " Периметр: " +
                circle.getPerimeter() + " Цвет заливки: " + circle.fillColor + " Цвет границы: " + circle.borderColor );

        System.out.println( "Фигура: " + rectangle.getName() + " Площадь: " + rectangle.getArea() + " Периметр: " +
                rectangle.getPerimeter() + " Цвет заливки: " + rectangle.fillColor + " Цвет границы: " + rectangle.borderColor);

        System.out.println( "Фигура: " + triangle.getName() + " Площадь: " + triangle.getArea() + " Периметр: " +
                triangle.getPerimeter() + " Цвет заливки: " + triangle.fillColor + " Цвет границы: " + triangle.borderColor);

    }
}