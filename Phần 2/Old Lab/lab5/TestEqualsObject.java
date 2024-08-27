package lab5;

public class TestEqualsObject {
    public static void main(String[] args) {
        Car car1 = new Car("BMW");
        Car car2 = new Car("BMW");

        System.out.println(car1 == car2);
        System.out.println(car1.equals(car2));
        System.out.println(car1);
        System.out.println(car2);
    }
}

class Car {
    private String nameCar;

    public Car(String nameCar) {
        this.nameCar = nameCar;
    }

    @Override
    public String toString() {
        return nameCar;
    }
}
