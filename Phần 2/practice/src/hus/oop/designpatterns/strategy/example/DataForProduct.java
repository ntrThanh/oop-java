package hus.oop.designpatterns.strategy.example;

import java.util.HashMap;
import java.util.Map;

public class DataForProduct {
    private static DataForProduct data;
    private Map<Integer, Integer> priceOnProducts;

    private DataForProduct() {
        this.priceOnProducts = new HashMap<>();

        // khởi tạo dữ liệu ban đầu
        priceOnProducts.put(1, 2200);
        priceOnProducts.put(2, 1850);
        priceOnProducts.put(3, 1100);
        priceOnProducts.put(4, 890);
    }

    public static DataForProduct getInstance() {
        if (data == null) {
            data = new DataForProduct();
        }

        return data;
    }

    public Map<Integer, Integer> getPriceOnProducts() {
        return priceOnProducts;
    }

    public void putProduct(int order, int price) {
        priceOnProducts.put(order, price);
    }

    public void removeProduct(int order) {
        priceOnProducts.remove(order);
    }
}
