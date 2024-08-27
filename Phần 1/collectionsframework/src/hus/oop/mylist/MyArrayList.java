package hus.oop.mylist;

public class MyArrayList extends MyAbstractList {
    private Object[] data;
    private int size;
    private final int DEFAULT_CAPACITY = 6;

    public MyArrayList() {
        data = new Object[DEFAULT_CAPACITY];
        this.size = 0;
    }

    public MyArrayList(Object[] input) {
        this.data = input;
        this.size = input.length;
    }

    @Override
    public void insert(int index, Object object) {
        checkBoundaries(size, index);

        if (size >= data.length) {
            enlarge();
        }

        for (int i = size; i > index; i--) {
            this.data[i] = this.data[i - 1];
        }

        this.data[index] = object;
        size++;
    }

    @Override
    public void append(Object object) {
        if (size >= data.length) {
            enlarge();
        }

        this.data[size++] = object;
    }

    @Override
    public int size() {
        return this.size;
    }

    @Override
    public Object get(int index) {
        checkBoundaries(size, index);
        return this.data[index];
    }

    @Override
    public void set(int index, Object object) {
        checkBoundaries(size, index);
        this.data[index] = object;
    }

    @Override
    public void remove(int index) {
        checkBoundaries(size, index);

        for (int i = index; i < size; i++) {
            this.data[i] = this.data[i + 1];
        }

        size--;
    }

    private void enlarge() {
        Object[] currentData = new Object[data.length * 2];
        System.arraycopy(data, 0, currentData, 0, data.length);
        this.data = currentData;
    }

    @Override
    public MyIterator iterator() {
        return new MyArrayListIterator();
    }

    private class MyArrayListIterator implements MyIterator {
        private int currentPosition;

        public MyArrayListIterator() {
            currentPosition = 0;
        }

        @Override
        public boolean hasNext() {
            if (currentPosition < size) {
                return true;
            }
            return false;
        }

        @Override
        public Object next() {
            if (hasNext()) {
                return data[currentPosition++];
            }
            return null;
        }

        public void remove() {
            MyArrayList.this.remove(currentPosition);
        }
    }
}
