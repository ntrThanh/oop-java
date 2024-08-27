package hus.oop.design_patterns.lab10.strategy.pay;

import java.util.HashMap;

public class DataProduct {
    private static DataProduct data;
    public final HashMap<Integer, Integer> products = new HashMap<>();

    private DataProduct() {
        products.put(1, 2200);
        products.put(2, 1850);
        products.put(3, 1100);
        products.put(4, 890);
    }

    public static DataProduct getInstance() {
        if (data == null) {
            data = new DataProduct();
        }

        return data;
    }

    public void putData(int number, int data) {
        products.put(number, data);
    }

    public void removeData(int number) {
        products.remove(number);
    }

    public HashMap<Integer, Integer> getProducts() {
        return products;
    }
}
