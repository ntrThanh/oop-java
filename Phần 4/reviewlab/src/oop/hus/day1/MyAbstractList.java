package oop.hus.day1;

public abstract class MyAbstractList implements MyList {
    public MyAbstractList() {
    }

    public void checkBoundaries(int index, int limit) {
        if (index < 0 || index > limit) {
            throw new ArrayIndexOutOfBoundsException();
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[");

        for (int i = 0; i < size(); i++) {
            sb.append(get(i)).append((i >= size() - 1)  ? "" : ",");
        }

        return sb.append("]").toString().trim();
    }
}
