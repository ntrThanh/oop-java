package hus.oop.lab10.mylist;

public class TestMyArrayList {
    public static void main(String[] args) {
        MyList listCircle = new MyArrayList();
        listCircle.add(new Car("Honda", 10000));
        listCircle.add(new Car("Mazda", 200000));
        listCircle.add(new Car("Lexus", 200100));

        for (int i = 0; i < listCircle.size(); i++) {
            System.out.println(listCircle.get(i));
        }
        System.out.println(listCircle.size());

        System.out.println("\n" + listCircle.get(1) + "\n");
        listCircle.remove(1);

        for (int i = 0; i < listCircle.size(); i++) {
            System.out.println(listCircle.get(i));
        }
        System.out.println(listCircle.size());

        listCircle.remove(0);
        System.out.println();
        for (int i = 0; i < listCircle.size(); i++) {
            System.out.println(listCircle.get(i));
        }
        System.out.println(listCircle.size());

        listCircle.add(new Car("Honda CRV", 100000), 1);
        System.out.println();
        for (int i = 0; i < listCircle.size(); i++) {
            System.out.println(listCircle.get(i));
        }
        System.out.println(listCircle.size());
    }
}

class Car {
    private String name;
    private double price;

    public Car(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

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
        return "Car" + '[' +
                "name='" + name + '\'' +
                ", price=" + price +
                ']';
    }
}
