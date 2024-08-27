package oop.principles.inheritance;

public class TestShape {
    public static void main(String[] args) {
        /*
            thông qua mối quan hệ IS-A, nên ta có thể hiểu được
            biến circle có kiểu dữ liệu là Shape nhưng thực chất là Circle,
            điều này khiến cho trương trình linh hoạt hơn (tính tương thích dữ liệu),
            dễ dàng mở rộng và cải tiến
        */
        Shape circle = new Circle("red", 10); // upcast

        System.out.println(circle); // ghi đè phương thức toString của lớp Cha
        System.out.println("The area is: " + circle.getArea()); // ghi đè phương thức

        /*
            từ khóa protected cho phép đối tượng thuộc lớp con
            có thể truy cập trực tiếp vào biến thành viên của lớp cha
        */
        System.out.println("the corlor is: " + circle.color);

        System.out.println("the corlor is: " + circle.getColor());
        // mối quan hệ HAS-A có thể hiểu là Circle kế thừa từ Shape
        // nên đối tượng thuộc loại Car có thể dùng được tất cả các phuong thức của Shape
        circle.setColor("green");
        System.out.println(circle);

        /*
            khi tham chiếu thuộc kiểu dữ liệu bậc cao hơn thì khi muốn sử dụng
            phương thức của lớp con thì cần phải ép kiểu xuống (downcast), nếu không muốn
            như vậy thì trong lớp cha ta phải thêm lớp giống với lớp con đề lớp con ghi đè phương thức
        */
        System.out.println("the radius is: " + ((Circle)circle).getRadius()); // downcast

        /*
            việc ép kiểu xuống đòi hỏi sự tương thích về dữ liệu
            nếu không chương trình sẽ sảy ra ngoại lệ
        */

    }
}
