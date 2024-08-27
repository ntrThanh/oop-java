package hus.oop.lab10.mylist;

public class MyArrayList extends MyAbstractList {
    static final int INITIAL_SIZE = 16;
    Object[] element;
    int size;

    public MyArrayList() {
        element = new Object[INITIAL_SIZE];
        size = 0;
    }

    @Override
    public void add(Object o) {
        if (size >= element.length - 1) {
            enlarge();
        }

        element[size++] = o;
    }

    @Override
    public void add(Object o, int index) {
        checkBoundaries(index, size);

        for (int i = index; i < size; i++) {
            element[i + 1] = element[i];
        }
        element[index] = o;
    }

    @Override
    public void remove(int index) {
        checkBoundaries(index, size);
        for (int i = index; i < size; i++) {
            element[i] = element[i + 1];
        }
        size--;
    }

    @Override
    public Object get(int index) {
        checkBoundaries(index, size - 1);
        return element[index];
    }

    public void enlarge() {
        Object[] temp = new Object[element.length * 2];
        System.arraycopy(element, 0, temp, 0, element.length);
        element = temp;
    }

    @Override
    public int size() {
        return size;
    }
}
