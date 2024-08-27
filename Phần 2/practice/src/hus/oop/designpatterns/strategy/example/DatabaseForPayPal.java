package hus.oop.designpatterns.strategy.example;

import java.util.HashMap;
import java.util.Map;

public class DatabaseForPayPal {
    private static DatabaseForPayPal databaseForPayPal;
    private Map<String, String> database = new HashMap<>();
    private DatabaseForPayPal() {
        // khởi tạo dữ liệu ban đầu;
        database.put("trongthanh1305", "nguyentrongthanh672@gmail.com");
        database.put("trongthanh2005", "nguyentrongthanh685@gmail.com");
    }

    public void put(String name, String email) {
        database.put(name, email);
    }

    public void deleteUser(String name) {
        database.remove(name);
    }

    public Map<String, String> getDataBase() {
        return database;
    }

    public static DatabaseForPayPal getInstance() {
        if (databaseForPayPal == null) {
            databaseForPayPal = new DatabaseForPayPal();
        }

        return databaseForPayPal;
    }
}
