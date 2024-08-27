package hus.oop.lab6.shape;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class TestShape {
    public static void main(String[] args) {
        Shape shape = new Shape("Green", true);
        System.out.println(shape);
        System.out.println();

        Shape shape1 = new Circle(12);
        System.out.println(shape1);
        System.out.println("The area is: " + (shape1).getArea());
        System.out.println("The perimeter is: " + (shape1).getPerimeter());
        System.out.println();

        Shape shape2 = new Rectangle(10, 20);
        System.out.println(shape2);
        System.out.println("The area is: " + (shape2).getArea());
        System.out.println("The perimeter is: " + (shape2).getPerimeter());
        System.out.println();

        Shape shape3 = new Square(15);
        System.out.println(shape3);
        System.out.println("The area is: " + (shape3).getArea());
        System.out.println("The perimeter is: " + (shape3).getPerimeter());
        System.out.println();
    }
}
