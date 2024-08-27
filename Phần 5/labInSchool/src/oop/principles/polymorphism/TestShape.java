package oop.principles.polymorphism;

public class TestShape {
    public static void main(String[] args) {
        // Đa hình được biểu thị qua 2 cơ chế đó là Overriding và Overloading

        /*
            cơ chế Overloading (nạp chồng) giúp ta có thể viết được nhiều
            phương thức có tên giống nhau nhưng cách làm việc khác nhau
            Overloading sử dụng liên kết tĩnh (thông tin để gọi hàm biết trước lúc biên dịch)
        */

        // ở trong ví dụ này ta tạo ra 2 đối tượng hình tròn
        // cùng với hàm dựng nhưng khác tham số đầu vào => làm cho trương trình của ta đỡ rắc rối
        Shape shape1 = new Circle("red", 100);
        Shape shape2 = new Circle("green");

        /*  cơ chế Overriding (ghi đè) giúp hàm có ở lớp con có cùng tên
            cùng tham số với lớp cha có thể ghi đè lớp cha
            Overriding sử dụng liên kết động (quyết định phương thức nào được ghi đè trong trương trình)
        */
        System.out.println(shape1);

        // trong ví dụ trên là shape1 sẽ in ra thông tin của lớp con
    }
}
