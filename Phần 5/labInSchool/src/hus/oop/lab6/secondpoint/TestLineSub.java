package hus.oop.lab6.secondpoint;

public class TestLineSub {
    public static void main(String[] args) {
        Point p1 = new Point(3, 4);
        Point p2 = new Point(4, 8);
        LineSub lineSub = new LineSub(p1, p2);
        System.out.println(lineSub);
        System.out.println("length is: " + lineSub.getLength());
    }
}
