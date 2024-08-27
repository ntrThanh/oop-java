package hus.oop.lab4.shape;

public class TestCircle {
    public static void main(String[] args) {
        Circle circle1 = new Circle();
        System.out.println("The Circle has radius of " + circle1.getRadius() +
                            " and Area of " + circle1.getArea());

        Circle circle2 = new Circle(2.0);
        System.out.println("The Circle has radius of " + circle2.getRadius() +
                            " and Area of " + circle2.getArea());

        Circle circle4 = new Circle();
        circle4.setRadius(5.5);
        System.out.println("radius is: " + circle4.getRadius());
        circle4.setColor("Green");
        System.out.println("color is: " + circle4.getColor());

        Circle circle5 = new Circle(5.5);
        System.out.println(circle5.toString());
    }
}
