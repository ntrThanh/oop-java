package oop.hus.day1;

public class MyArrayListIterator implements MyIterator {
    private Object[] data;
    private int currentPosition;

    public MyArrayListIterator(Object[] data) {
        this.data = data;
        currentPosition = 0;
    }

    @Override
    public boolean hasNext() {
        return data[currentPosition++] != null;
    }

    @Override
    public Object next() {
        return data[currentPosition - 1];
    }
}
