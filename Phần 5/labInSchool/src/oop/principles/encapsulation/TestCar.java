package oop.principles.encapsulation;

public class TestCar {
    public static void main(String[] args) {

        // khởi tạo đối tượng với tham số đầu vào
        Car car = new Car("Honda", 100000, 10);
        System.out.println(car);
        System.out.println();

        // sử dụng phương thức getName() thay vì phải gọi trực tiếp
        System.out.println("the name of the car is: " + car.getName());
        // System.out.println("the name of the car is: " + car.name);
        // do thuộc tính name được khai báo private nên không dùng trực tiếp được
        System.out.println("the price of a car is: " + car.getPrice());

        car.setPrice(2000000); // sử dụng phương thức setPrice() để chỉnh sửa
        // giá cho đối trượng thay vì can thệp trực tiếp

        System.out.println(car);

        // che giấu những thứ phức tạp, chỉ cần biết thông qua cơ chế giao diện
        // ta có thể làm gì, không cần biết nó làm như thế nào, trong ví dụ này
        // là in ra số tiền thực tế phải trả khi cộng thêm thuế
        System.out.println("the actual payment ís: " + car.getActualPayment());
    }
}
