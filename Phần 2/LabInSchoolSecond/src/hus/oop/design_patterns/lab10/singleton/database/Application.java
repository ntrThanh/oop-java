package hus.oop.design_patterns.lab10.singleton.database;

public class Application {
    public static void main(String[] args) {
        Database foo = Database.getInstance();
        foo.query("SELECT column1, column2 FROM table_name;");
        foo.query("INSERT INTO table_name (column1, column2) VALUES (value1, value2);");
        //...

        Database bar = Database.getInstance();
        bar.query("UPDATE customers SET email = 'newemail@example.com' WHERE id = 1;");
        bar.query("SELECT DISTINCT column FROM table_name;");
        //...

        // list String sql of instance Database
        for (String sqlString : bar.getListStringSql()) {
            System.out.println(sqlString);
        }
    }
}
