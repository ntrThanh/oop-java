package oop.principles.inheritance;

public class Shape {
    // từ khóa protected cho phép lớp con có thể truy cập trực tiếp vào thuộc tính, ở ví dụ này là corlor;
    protected String color; // thuộc tính của lớp

    //hàm dựng khởi tạo đối tượng của lớp
    public Shape(String color) {
        this.color = color;
    }

    // phương thức getter/setter
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    // chưa xác định cụ thể hình dáng nên chưa thể lấy được diện tích,
    // nên ta để lại triển khai của lớp con thông qua cơ chế ghi đè
    public double getArea() {
        return -1;
    }

    // ghi đè phương thức của lớp cha (Object),
    @Override
    public String toString() {
        return "Shape{" +
                "color='" + color + '\'' +
                '}';
    }
}
