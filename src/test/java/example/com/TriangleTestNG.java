package example.com;

import org.testng.Assert;
import org.testng.annotations.Test;


public class TriangleTestNG {

    @Test(description = "Некорректный треугольник не существует")
    public void invalidTriangleShouldReturnFalse(){
        Triangle triang = new Triangle(1, 1, 10);
        boolean r = triang.isValidTriangle();
        Assert.assertFalse(r, "Треугольник со сторонами 1, 1, 10 не должен существовать");
    }


 @Test (description = "Корректный треугольник существует")
    public void validTriangleShouldReturnTrue(){
        Triangle triang = new Triangle(3, 4, 5);
        boolean r = triang.isValidTriangle();
        Assert.assertTrue(r,"Треугольник со сторонами 3, 4, 5  должен существовать");
    }


    @Test (description = "Площадь треугольника со сторонами 3, 4, 5 вычисляется правильно и равна 6 ")
        public void triangleAreaIsTrue(){
            Triangle tr = new Triangle(3, 4 , 5);
            double s = tr.getArea();
            Assert.assertEquals(s, 6.0, 0.0001, "Площадь треугольника со сторонами 3, 4, 5 должна бытьравна 6 ");
        }


 @Test(description = "Треугольник с нулевой стороной невалиден")
    public void triangleWithZeroSide(){
        Triangle tr1 = new Triangle(0, 4, 5);
        Triangle tr2 = new Triangle(3, 0, 5);
        Triangle tr3 = new Triangle(3, 4, 0);
        Triangle tr4 = new Triangle(0, 0, 0);

            Assert.assertFalse(tr1.isValidTriangle(), "треугольник со стронами 0,4,5 не должен быть валидным");
            Assert.assertFalse(tr2.isValidTriangle(), "треугольник со стронами 3,0,5 не должен быть валидным");
            Assert.assertFalse(tr3.isValidTriangle(), "треугольник со стронами 3,4,0 не должен быть валидным");
            Assert.assertFalse(tr4.isValidTriangle(), "треугольник со стронами 0,0,0 не должен быть валидным");
    }

@Test (description = "Треугольник с отрицательной стороной невалиден")
    public void triangleWithNegativeSide(){
        Triangle tr = new Triangle(-1, 1, 1);
        Assert.assertFalse(tr.isValidTriangle(), "треугольник с отрицательной стороной должен быть не валиден");
    }



}