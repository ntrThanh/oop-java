package oop.principles.abstraction;

public class Circle extends Shape implements Movable {
    // từ khóa extends và implements dùng để kế thừa lại lớp trừu tượng Shape và thực thi interface Movable
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

    // ghi đè và thực thi phương thức trừu tượng getArea(), getPerimeter() của lớp cha
    @Override
    public double getArea() {
        return Math.PI * this.radius * this.radius;
    }

    @Override
    public double getPerimeter() {
        return 2 * Math.PI * this.radius;
    }

    // ghi đè phương thức của lớp cha (Shape),
    @Override
    public String toString() {
        return "Circle{" + super.toString() +
                "radius=" + radius +
                '}';
    }

    // ghi đè lại để triển khai các phương thức trong interface
    @Override
    public void moveUp() {
        System.out.println("the circle is move up!!");
    }

    /*
        có thể không cân triển khai nhưng phải có,
        nếu không có thì Lớp Circle là lớp trừu tượng
    */
    @Override
    public void moveDown() {

    }
}
