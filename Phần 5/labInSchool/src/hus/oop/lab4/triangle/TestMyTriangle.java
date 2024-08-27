package hus.oop.lab4.triangle;

public class TestMyTriangle {
    public static void main(String[] args) {
        MyPoint v1 = new MyPoint(1, 4);
        System.out.println(v1);
        MyPoint v2 = new MyPoint(2, 5);
        System.out.println(v2);
        MyPoint v3 = new MyPoint(6, 7);
        System.out.println(v3);

        MyTriangle triangle1 = new MyTriangle(v1, v2, v3);
        System.out.println(triangle1);
        System.out.println("perimeter is: " + triangle1.getPerimeter());
        System.out.println("type is: " + triangle1.getType());
    }
}
