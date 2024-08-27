package hus.oop.review.collection;

import hus.oop.review.iterator.MyArrayListIterator;
import hus.oop.review.iterator.MyIterator;

public class MyArrayList extends MyAbstractList {
    private final int DEFAULT_CAPACITY = 16;
    private Object[] data;
    private int size;

    public MyArrayList() {
        data = new Object[DEFAULT_CAPACITY];
        size = 0;
    }

    @Override
    public MyIterator iterator() {
        return new MyArrayListIterator(data);
    }

    @Override
    public void append(Object object) {
        if (size >= data.length) {
            enlarge();
        }
        data[size++] = object;
    }

    @Override
    public Object get(int index) {
        checkBoundaries(index, size);
        return data[index];
    }

    @Override
    public void insert(Object object, int index) {
        checkBoundaries(index, size);

        if (size >= data.length) {
            enlarge();
        }

        for (int i = size; i > index; i--) {
            data[i] = data[i - 1];
        }

        data[index] = object;
        size++;
    }

    @Override
    public void remove(int index) {
        checkBoundaries(index, size);

        for (int i = index; i < size; i++) {
            data[i] = data[i + 1];
        }

        size--;
    }

    @Override
    public void set(Object object, int index) {
        checkBoundaries(index, size);

        data[index] = object;
    }

    @Override
    public int size() {
        return size;
    }

    private void enlarge() {
        Object[] currentArray = new Object[DEFAULT_CAPACITY * 2];
        System.arraycopy(data, 0, currentArray, 0, data.length);
        data = currentArray;
    }
}
