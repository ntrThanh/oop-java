package hus.oop.lab9.mymap;

public interface MyMap {
    int size();
    void put(Object key, Object value);
    void remove(Object key);
    boolean contains(Object key);
}
