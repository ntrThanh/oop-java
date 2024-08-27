package hus.oop.colletions;

public interface MyList extends Iterable {
    int size();
    Object get(int index);
    void add(int index, Object object);
    void append(Object object);
    void remove(int index);
    void addAll(MyList myList);
    void set(int index, Object object);
}
