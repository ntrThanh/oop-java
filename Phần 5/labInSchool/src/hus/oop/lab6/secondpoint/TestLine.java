package hus.oop.lab6.secondpoint;

public class TestLine {
    public static void main(String[] args) {
        Line l1 = new Line(0, 0, 3, 4);
        System.out.println(l1);
        System.out.println("length l1 is: " + l1.getLength());
        System.out.println();

        Point p1 = new Point(3, 4);
        Point p2 = new Point(4, 8);
        Line l2 = new Line(p1, p2);
        System.out.println(l2);
        System.out.println("length l2 is: " + l2.getLength());
    }
}
