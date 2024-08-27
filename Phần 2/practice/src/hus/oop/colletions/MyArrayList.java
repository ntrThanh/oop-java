package hus.oop.colletions;

public class MyArrayList extends AbstractMyList {
    private final int DEFAULT_CAPACITY = 4;
    private Object[] data;
    private int size;

    public MyArrayList() {
        this.data = new Object[DEFAULT_CAPACITY];
        this.size = 0;
    }

    @Override
    public Iterator iterator() {
        return new MyArrayListIterator();
    }

    @Override
    public int size() {
        return this.size;
    }

    @Override
    public Object get(int index) {
        checkBoundaries(this.size, index);
        return this.data[index];
    }

    @Override
    public void add(int index, Object object) {
        if (this.size >= this.data.length) {
            enlarge();
        }

        checkBoundaries(this.size, index);

        for (int i = size; i > index; i--) {
            this.data[i] = this.data[i - 1];
        }

        this.data[index] = object;
        this.size++;
    }

    @Override
    public void append(Object object) {
        if (this.size >= this.data.length) {
            enlarge();
        }

        this.data[size++] = object;
    }

    @Override
    public void remove(int index) {
        checkBoundaries(this.size, index);

        for (int i = index; i < this.size; i++) {
            this.data[i] = this.data[i + 1];
        }
        this.size--;
    }

    @Override
    public void addAll(MyList myList) {
        for (int i = 0; i < myList.size(); i++) {
            if (this.size >= this.data.length) {
                enlarge();
            }
            this.data[size++] = myList.get(i);
        }
    }

    @Override
    public void set(int index, Object object) {
        checkBoundaries(size, index);

        this.data[index] = object;
    }

    private void enlarge() {
        Object[] currentDataArray = new Object[this.data.length * 2];
        System.arraycopy(this.data, 0, currentDataArray, 0, this.data.length);
        this.data = currentDataArray;
    }

    public class MyArrayListIterator implements Iterator {
        private int currentPosition;

        public MyArrayListIterator() {
            this.currentPosition = 0;
        }

        @Override
        public boolean hasNext() {
            if (this.currentPosition < size) {
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
    }
}
