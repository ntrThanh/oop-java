package hus.oop.lab4.circle;

public class TestMyCircle {
    public static void main(String[] args) {
        MyPoint center = new MyPoint(3, 4);
        System.out.println(center);
        MyCircle circle1 = new MyCircle(center, 4);
        System.out.println(circle1);

        System.out.println("area is: "  + circle1.getArea());
        System.out.println("radius is: " + circle1.getRadius());
        System.out.println("circumference is: " + circle1.getCircumference());

        circle1.setRadius(3);
        System.out.println("area is: "  + circle1.getArea());
        System.out.println("radius is: " + circle1.getRadius());
        System.out.println("circumference is: " + circle1.getCircumference());

        circle1.getCenter().setX(3);
        System.out.println(circle1);
        circle1.getCenter().setY(5);
        System.out.println(circle1);
    }
}
