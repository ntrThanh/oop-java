package hus.oop.colletions;

public abstract class AbstractMyList implements MyList {
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();

        for (int i = 0; i < size(); i++) {
            stringBuilder.append("[").append(get(i)).append("]").append(" ");
        }

        return stringBuilder.toString();
    }

    public void checkBoundaries(int limit, int index) {
        if (index < 0 || limit < index) {
            throw new ArrayIndexOutOfBoundsException();
        }
    }
}
