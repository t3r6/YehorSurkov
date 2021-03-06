package lesson9;

import java.util.Objects;

public class Circle {
    final private static double PI = Math.PI;
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double circleArea() {
        return PI * Math.pow(radius, 2);
    }

    public double circleLength() {
        return 2 * PI * radius;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Circle circle = (Circle) o;
        return Double.compare(PI, PI) == 0 &&
                Double.compare(radius, radius) == 0;
    }

    @Override
    public int hashCode() {

        return Objects.hash(PI, radius);
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                '}';
    }
}
