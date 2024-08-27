package hus.oop.lab6.secondpoint;

public class TestPoint {
    public static void main(String[] args) {
        Point p1 = new Point(10, 20);
        System.out.println(p1);
        System.out.println();

        p1.setXY(10, 100);
        System.out.println(p1);
    }
}
