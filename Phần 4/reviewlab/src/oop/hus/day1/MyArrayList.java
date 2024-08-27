package oop.hus.day1;

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

        return this.data[index];
    }

    @Override
    public void insert(Object object, int index) {
        checkBoundaries(index, size);

        if (size >= data.length) {
            enlarge();
        }

        for (int i = size; i > index; i--) {
            this.data[i] = this.data[i - 1];
        }

        this.data[index] = object;
        this.size++;
    }

    @Override
    public void remove(int index) {
        checkBoundaries(index, size);

        for (int i = index; i < size; i++) {
            data[i] = data[i + 1];
        }

        this.size--;
    }

    @Override
    public void set(Object object, int index) {
        checkBoundaries(index, size);

        this.data[index] = object;
    }

    @Override
    public int size() {
        return this.size;
    }

    private void enlarge() {
        Object[] currentArray = new Object[this.data.length * 2];
        System.arraycopy(data, 0, currentArray, 0, this.data.length);
        this.data = currentArray;
    }

    public static void main(String[] args) {
        MyList myList = new MyArrayList();

        myList.append("a");
        myList.append("b");
        myList.append("c");
        myList.append("d");
        myList.append("d");
        myList.append("d");

        MyIterator iterator = myList.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
