package hus.oop.lab4.shape.circle;

import hus.oop.lab4.circle.MyPoint;

public class TestMain {
    public static void main(String[] args) {
        MyPoint center = new MyPoint(3, 4);
        Circle circle1 = new Circle(1.1);
        System.out.println(circle1.toString());

        Circle circle2 = new Circle(1.1);
        System.out.println(circle2);

        circle1.setRadius(2.2);
        System.out.println(circle1);

        System.out.println("radius is: " + circle1.getRadius());
        System.out.printf("area is: %.2f\n", circle1.getArea());
        System.out.printf("circumference is: %.2f\n", circle1.getCircumference());
    }
}
