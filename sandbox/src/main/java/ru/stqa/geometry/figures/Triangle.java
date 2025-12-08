package ru.stqa.geometry.figures;

public record Triangle(double a, double b, double c) {
    public Triangle {
        if (a < 0 || b < 0 || c < 0) {
            throw new IllegalArgumentException("Triangle side cannot be negative");
        } else if (a + b <= c || a + c <= b || c + b <= a  ) {
            throw new IllegalArgumentException("Sum of 2sides cannot be less or equal");
        }
    }
    public static void printTrianglePerimetr(Triangle t ) {
        System.out.println(String.format(
                "Периметр треугольника со сторонами %f и %f и %f = %f ", t.a, t.b, t.c, t.trianglePerimetr()));
    }

    public double trianglePerimetr() {
        return this.a + this.b + this.c;
    }

    public double area() {
        double p = trianglePerimetr()/2;
        return Math.sqrt(p * ((p - this.a) * (p - this.b) * (p - this.c)));

    }
}
