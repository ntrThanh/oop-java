package hus.oop.lab7.shape;

public class Circle extends Shape {
    protected double radius;

    public Circle(double radius) {
        super();
        this.radius = radius;
    }

    public Circle(double radius, String color, boolean filled) {
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * this.radius * this.radius;
    }

    @Override
    public double getPerimeter() {
        return Math.PI * 2 * this.radius;
    }

    @Override
    public String toString() {
        return "Circle[" + super.toString() +
                "radius=" + radius +
                ']';
    }
}
