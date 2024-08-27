package oop.principles.abstraction;

abstract class Shape {
    // khai báo lớp trừu tượng bằng từ khóa abstract
    protected String color;

    /*
        Không thể tạo đối tượng của lớp trừu tượng
        do lớp trừu tượng không hoàn chỉnh (có phương thức trừu tượng),
        chỉ thông qua lớp con để triển khai các phương thức đó
    */
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

    /*
        chưa xác định cụ thể hình dáng nên chưa thể lấy được diện tích, chu vi,
        nên ta để lại triển khai cho lớp con thông qua cơ chế ghi đè
        phương thức trừu tượng
    */
    abstract double getArea();
    abstract double getPerimeter();

    // ghi đè phương thức của lớp cha (Object),
    @Override
    public String toString() {
        return "Shape{" +
                "color='" + color + '\'' +
                '}';
    }
}
