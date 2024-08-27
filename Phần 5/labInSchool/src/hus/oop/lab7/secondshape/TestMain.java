package hus.oop.lab7.secondshape;

public class TestMain {
    public static void main(String[] args) {
        GeometricObject geometricObject1 = new Circle(10);
        System.out.println(geometricObject1);
        System.out.println("the area is: " + geometricObject1.getArea());
        System.out.println("the perimeter is: " + geometricObject1.getArea());
        if (geometricObject1 instanceof Circle) {
            System.out.println("the radius is: " + ((Circle) geometricObject1).getRadius());
        }

        GeometricObject geometricObject2 = new Rectangle(10, 20);
        System.out.println(geometricObject2);
        System.out.println("the area is: " + geometricObject2.getArea());
        System.out.println("the perimeter is: " + geometricObject2.getPerimeter());
    }
}
