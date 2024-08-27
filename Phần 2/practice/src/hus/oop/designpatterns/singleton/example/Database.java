package hus.oop.designpatterns.singleton.example;

public class Database {
    private static Database database;
    private String data;

    private Database() {
        data = "";
    }

    public void changeData(String newData) {
        data = newData;
    }

    public String getData() {
        return data;
    }

    public static Database getInstance() {
        if (database == null) {
            database = new Database();
        }

        return database;
    }
}
