package hus.oop.lab9.mylist;

public class TestMyLinkedList {
    public static void main(String[] args) {
        MyList list = new MyLinkedList();
        list.add(new Motorbike("Wave", 200000));
        list.add(new Motorbike("WinnerX", 400000));
        list.add(new Motorbike("Exciter", 450000));

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        System.out.println(list.size());
        System.out.println();

        list.remove(1);
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        System.out.println(list.size());
        System.out.println();

        list.add(new Motorbike("Air Blade", 400000), 0);
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        System.out.println(list.size());
        System.out.println();
    }
}

class Motorbike {
    private String name;
    private double price;

    public Motorbike(String name, double price) {
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
        return "Motorbike" + '[' +
                "name='" + name + '\'' +
                ", price=" + price +
                ']';
    }
}