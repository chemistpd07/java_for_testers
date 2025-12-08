package ru.stqa.geometry;

import ru.stqa.geometry.figures.Rectangle;
import ru.stqa.geometry.figures.Square;
import ru.stqa.geometry.figures.Triangle;

public class Geometry {
    public static void main(String[] args) {
        Square.printSquareAre(new Square(7));
        Square.printSquareAre(new Square (5));
        Square.printSquareAre(new Square (3));

        Rectangle.prinRectangleArea(3.0, 5.0);
        Rectangle.prinRectangleArea(7, 9.0);

        Triangle triangle = new Triangle(1.0, 3.0, 3.2);
        Triangle.printTrianglePerimetr(triangle);
        





    }

}
