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


}
