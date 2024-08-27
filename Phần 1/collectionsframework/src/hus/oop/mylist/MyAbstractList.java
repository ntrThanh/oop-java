package hus.oop.mylist;

public abstract class MyAbstractList implements MyList {
    public String toString() {
        StringBuilder convertToString = new StringBuilder();
        for(int i = 0; i < size(); i++) {
            convertToString.append("[").append(get(i)).append("]").append("  ");
        }

        return convertToString.toString();
    }

    public void checkBoundaries(int limit, int index) {
        if (index < 0 || index > limit) {
            throw new ArrayIndexOutOfBoundsException("error!!!");
        }
    }
}
