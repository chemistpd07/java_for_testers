package ru.stqa.geometry.figures;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TriangleTests {

    @Test
    void canCalculatePerimetr() {
        Triangle triangle = new Triangle(1.0, 3.0, 3.2);
        var result = triangle.trianglePerimetr();
        Assertions.assertEquals(7.2, result);
    }

    @Test
    void canCalculateS() {
        Triangle triangle = new Triangle(1.0, 3.0, 3.2);
        Assertions.assertEquals(1.4987995196156156, triangle.area());
    }

    @Test
    void cannotCreateTriangleWithNegativeSide() {
        try {
            new Triangle(1.0, -3.0, 3.2);
            Assertions.fail();
        } catch (IllegalArgumentException exception) {
            // OK
        }
    }

    @Test
    void cannotCreateTriangleWith2SideLessThanThird() {
        try {
            new Triangle(1.0, 2, 4);
            Assertions.fail();
        } catch (IllegalArgumentException exception) {
            // OK
        }
    }

    @Test
    void testEqauality() {
        var t1 = new Triangle(4.0, 5.0, 3);
        var t2 = new Triangle(5.0, 4.0, 3);
        Assertions.assertEquals(t1, t2);
    }

    @Test
    void testEqauality2() {
        var t1 = new Triangle(4.0, 5.0, 3);
        var t2 = new Triangle(3.0, 5.0, 4);
        Assertions.assertEquals(t1, t2);
    }

    @Test
    void testEqauality3() {
        var t1 = new Triangle(4.0, 5.0, 3);
        var t2 = new Triangle(3.0, 4.0, 5);
        Assertions.assertEquals(t1, t2);
    }

    @Test
    void testEquality4() {
        var t1 = new Triangle(4, 5, 3);
        var t2 = new Triangle(4, 3, 5);
        Assertions.assertEquals(t1, t2);
    }

    @Test
    void testEquality5() {
        var t1 = new Triangle(4, 5, 3);
        var t2 = new Triangle(5, 4, 3);
        Assertions.assertEquals(t1, t2);
    }
}
