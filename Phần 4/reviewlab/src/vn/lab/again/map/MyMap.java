package vn.lab.again.map;

public interface MyMap {
    int size();
    void put(Object key, Object value);
    void remove(Object key);
    boolean contains(Object key);
    Object get(Object key);
}
