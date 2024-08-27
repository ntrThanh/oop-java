package hus.oop.design_patterns.lab10.singleton.database;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Database {
    private static final Lock lock = new ReentrantLock();
    private static Database databaseInstance;
    private final boolean connectToSever;
    private final List<String> listStringSql;

    private Database() {
        connectToSever = true;
        listStringSql = new ArrayList<>();
    }

    public static Database getInstance() {
        if (databaseInstance == null) {
            acquireThreadLock();
            if (databaseInstance == null) {
                Database.databaseInstance = new Database();
            }
        }

        return databaseInstance;
    }

    public static void acquireThreadLock() {
        lock.lock();
    }

    public String query(String sql) {
        // add sql to instance
        listStringSql.add(sql);
        return "execute query" + sql;
    }

    public List<String> getListStringSql() {
        return listStringSql;
    }
}
