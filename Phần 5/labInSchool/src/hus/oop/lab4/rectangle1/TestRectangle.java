package hus.oop.lab4.rectangle1;

public class TestRectangle {
    public static void main(String[] args) {
        MyPoint topLeft = new MyPoint(2, 3);
        MyPoint bottomRight = new MyPoint(5, 4);

        System.out.println(topLeft);
        System.out.println(bottomRight);

        MyRectangle rectangle = new MyRectangle(topLeft, bottomRight);
        System.out.println(rectangle);
        System.out.println("length is: " + rectangle.getLength());
        System.out.println("width is: " + rectangle.getWidth());

        System.out.println("area is: " + rectangle.getArea());
        System.out.println("perimeter is: " + rectangle.getPerimeter());

        rectangle.setTopLeft(new MyPoint(10, -3));
        System.out.println(rectangle);
        System.out.println("length is: " + rectangle.getLength());
        System.out.println("width is: " + rectangle.getWidth());

        System.out.println("area is: " + rectangle.getArea());
        System.out.println("perimeter is: " + rectangle.getPerimeter());
    }
}
