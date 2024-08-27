package oop.hus.day1;

public interface MyList extends MyIterable {
    void append(Object object);
    Object get(int index);
    void insert(Object object, int index);
    void remove(int index);
    void set(Object object, int index);
    int size();
}
