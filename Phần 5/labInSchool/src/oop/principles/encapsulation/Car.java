package oop.principles.encapsulation;

public class Car {
    private String name;
    /*
         từ khóa private để khai báo, điều này có nghĩa
         biến name chỉ được sử dụng trực tiếp trong lớp Car
         còn các từ khóa khác như protected: chỉ cho phép lớp
         con kế thừa truy cập, khi không sử dụng từ khóa thì mặc định
         là chỉ được truy cập trong package
    */
    private double price;   // biến price cũng tương tự

    private int vat; //...

    // hàm dựng để khởi tạo đối tượng, khởi tạo các biến (các trường dữ liệu của lớp);
    public Car(String name, double price, int vat) {
        this.name = name;
        this.price = price;
        this.vat = vat;
    }

    /*
        một lợi ích khác của việc đống gói là che giấu đi sự phức tạp của chương trình,
        ta không cần biết, quan tâm bên trong làm gì, làm như thế nào
    */
    public double getActualPayment() {
        return price * (100 + vat) / 100;
    }


    /*
         do tính đóng gói khiên các dữ liệu thành viên được bảo vệ,
         không được trực tiếp sử dụng, chỉnh sửa từ bên ngoài
         nên ta chỉ được phép sử dụng gián tiếp qua phương thức getter,
         setter do phương thức sử dụng từ khóa public

         phương thức getter cho phép ta lấy dữ liệu của các trường
         trong đối trượng, ở trong ví dụ này là ta lấy tên của đối trượng Car
    */
    public String getName() {
        return name;
    }

    /*
        phương thức setter cho phép ta chỉnh sửa,
        cập nhận được giá trị được các trường, thuộc tính của đối trượng
    */
    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Car[" +
                "name=" + name +
                ", price=" + price +
                ']';
    }
}
