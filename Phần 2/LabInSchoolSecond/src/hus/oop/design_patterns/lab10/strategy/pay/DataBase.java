package hus.oop.design_patterns.lab10.strategy.pay;

import java.util.HashMap;
import java.util.Map;

public class DataBase {
    public static DataBase dataBase;
    public final Map<String, String> DATA_BASE = new HashMap<>();

    private DataBase() {
        DATA_BASE.put("amanda1985", "amanda@ya.com");
        DATA_BASE.put("qwerty", "john@amazon.com");
    }

    public void putData(String key, String email) {
        DATA_BASE.put(key, email);
    }

    public void removeData(String key) {
        DATA_BASE.remove(key);
    }

    public static DataBase getInstance() {
        if (dataBase == null) {
            dataBase = new DataBase();
        }

        return dataBase;
    }

    public Map<String, String> getDATA_BASE() {
        return DATA_BASE;
    }
}
