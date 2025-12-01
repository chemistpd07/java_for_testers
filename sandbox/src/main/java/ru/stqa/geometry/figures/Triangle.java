package ru.stqa.geometry.figures;

public record Triangle(double a, double b, double c) {
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
