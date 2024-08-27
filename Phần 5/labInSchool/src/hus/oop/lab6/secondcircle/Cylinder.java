package hus.oop.lab6.secondcircle;

public class Cylinder {
    private Circle base;
    private double height;

    public Cylinder(Circle base, double height) {
        this.base = base;
        this.height = height;
    }

    public Cylinder(double height, String color, double radius) {
        this.base = new Circle(radius, color);
        this.height = height;
    }

    public Cylinder() {
        this.base = new Circle();
        height = 1;
    }

    @Override
    public String toString() {
        return "Cylinder[" +
                "base=" + base +
                ", height=" + height +
                ']';
    }
}
