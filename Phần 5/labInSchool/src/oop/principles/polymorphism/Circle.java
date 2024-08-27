package oop.principles.polymorphism;

public class Circle extends Shape {
    private double radius;

    public Circle(String color, double radius) {
        super(color); // gọi đến hàm dựng khởi tạo của lớp cha
        this.radius = radius;
    }

    public Circle(String color) {
        super(color);
        this.radius = 1;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    // ghi đè và thực thi phương thức getArea() của lớp cha
    @Override
    public double getArea() {
        return Math.PI * this.radius * this.radius;
    }

    // ghi đè phương thức của lớp cha (Shape),
    @Override
    public String toString() {
        return "Circle{" + super.toString() +
                "radius=" + radius +
                '}';
    }
}
