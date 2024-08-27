package hus.oop.review.iterator;

public class MyArrayListIterator implements MyIterator {
    private Object[] data;
    private int currentPosition;

    public MyArrayListIterator(Object[] data) {
        this.data = data;
        currentPosition = 0;
    }

    @Override
    public boolean hasNext() {
        if (currentPosition >= data.length) {
            return false;
        }

        if(data[currentPosition] != null) {
            return true;
        }
        return false;
    }

    @Override
    public Object next() {
        int count = currentPosition;
        currentPosition++;
        return data[count];
    }
}
