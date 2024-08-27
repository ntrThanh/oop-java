package oop.principles.abstraction;


public class TestShape {
    public static void main(String[] args) {
        /*
            Quy tắc lập trình về phía giao diện,tức là khai báo
            tham chiếu tại lớp cha nhưng lại trỏ về đôí tượng của lớp con,
            điều này cũng giống như trong kế thừa, khiến trương trình linh hoạt, dễ quản lý hơn
        */
        Shape shape1 = new Circle("green", 10);
        Movable movable = new Circle("red", 15);

        // triển khai phương thức của lớp trừu tượng
        System.out.println("the area shape1 is: " + shape1.getArea());
        // triển khai phương thức của lớp trừu trượng trong interface
        movable.moveUp();
    }
}
