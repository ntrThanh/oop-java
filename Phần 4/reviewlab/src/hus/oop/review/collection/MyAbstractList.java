package hus.oop.review.collection;

public abstract class MyAbstractList implements MyList {
    public MyAbstractList() {
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        sb.append("[");
        for (int i = 0; i < size(); i++) {
            sb.append(get(i)).append((i != size() - 1) ? "," : "");
        }
        sb.append("]");
        return sb.toString();
    }

    public void checkBoundaries(int index, int limit) {
        if (index < 0 || index > limit) {
            throw new ArrayIndexOutOfBoundsException();
        }
    }
}
