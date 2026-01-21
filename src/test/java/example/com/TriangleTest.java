package example.com;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TriangleTest {
    @Test
    @DisplayName("Некорректный треугольник не существует")
    void invalidTriangleShouldReturnFalse(){
        Triangle triang = new Triangle(1, 1, 10);
        boolean r = triang.isValidTriangle();
        assertFalse(r);
    }

    @Test
    @DisplayName("Корректный треугольник существует")
    void validTriangleShouldReturnTrue(){
        Triangle triang = new Triangle(3, 4, 5);
        boolean r = triang.isValidTriangle();
        assertTrue(r);
    }

        @Test
        @DisplayName("Площадь треугольника со сторонами 3, 4, 5 вычисляется правильно и равна 6 ")
        void triangleAreaIsTrue(){
            Triangle tr = new Triangle(3, 4 , 5);
            double s = tr.getArea();
            assertEquals(6, s);
        }

        @Test
    @DisplayName("Треугольник с нулевой стороной невалиден")
    void triangleWithZeroSide(){
        Triangle tr1 = new Triangle(0, 4, 5);
        Triangle tr2 = new Triangle(3, 0, 5);
        Triangle tr3 = new Triangle(3, 4, 0);
        Triangle tr4 = new Triangle(0, 0, 0);

            assertFalse(tr1.isValidTriangle());
            assertFalse(tr2.isValidTriangle());
            assertFalse(tr3.isValidTriangle());
            assertFalse(tr4.isValidTriangle());
    }

    @Test
    @DisplayName("Треугольник с отрицательной стороной невалиден")
    void triangleWithNegativeSide(){
        Triangle tr = new Triangle(-1, 1, 1);
        assertFalse(tr.isValidTriangle());
    }

}