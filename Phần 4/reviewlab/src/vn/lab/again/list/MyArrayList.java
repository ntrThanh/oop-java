package vn.lab.again.list;

public class MyArrayList extends MyAbstractList {
    private int size;
    private final int DEFAULT_CAPACITY = 16;
    private Object[] element;

    public MyArrayList() {
        element = new Object[DEFAULT_CAPACITY];
        size = 0;
    }

    @Override
    public void add(Object object, int index) {
        checkBoundaries(index, size);

        if (size >= element.length) {
            enlarge();
        }

        for (int i = size; i > index; i--) {
            element[i] = element[i - 1];
        }

        element[index] = object;
        size++;
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
    public int size() {
        return size;
    }

    @Override
    public Object get(int index) {
        return element[index];
    }

    @Override
    public void add(Object object) {
        if (size >= element.length) {
            enlarge();
        }

        element[size++] = object;
    }

    private void enlarge() {
        Object[] currentArray = new Object[element.length * 2];
        System.arraycopy(element, 0, currentArray, 0, element.length);
        element = currentArray;
    }
}
