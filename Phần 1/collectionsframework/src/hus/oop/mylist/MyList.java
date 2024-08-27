package hus.oop.mylist;

public interface MyList extends MyIterable {
    void insert(int index, Object object);
    void append(Object object);
    int size();
    Object get(int index);
    void set(int index, Object object);
    void remove(int index);
}
