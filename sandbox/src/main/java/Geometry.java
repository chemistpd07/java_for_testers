public class Geometry {
    public static void main(String[] args) {
        printSquareAre(7);
        printSquareAre(5);
        printSquareAre(3);

        prinRectangleArea(3.0, 5.0);
        prinRectangleArea(7, 9.0);
    }

    private static void prinRectangleArea(double a, double b) {
        System.out.println("Площадь прямоугольника со сторонами " + a + " и " + b + " = "  + rectangleArea(a, b));
    }

    private static double rectangleArea(double a, double b) {
        return a * b;
    }

    static void printSquareAre(double side) {
        System.out.println("Площадь квадрата со стороной " + side + " = " + squareArea(side));
    }

    private static double squareArea(double a) {
        return a * a;
    }
}
