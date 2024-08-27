package hus.oop.lab6.secondcircle;

public class TestCylinder {
    public static void main(String[] args) {
        Cylinder cylinder = new Cylinder(new Circle(10, "Red"), 100);
        System.out.println(cylinder);
    }
}
