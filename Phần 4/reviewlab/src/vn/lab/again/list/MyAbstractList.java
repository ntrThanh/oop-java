package vn.lab.again.list;

public abstract class MyAbstractList implements MyList {
    public MyAbstractList() {
    }

    public void checkBoundaries(int index, int size) {
        if (index < 0 || index > size) {
            throw new ArrayIndexOutOfBoundsException();
        }
    }

    public String toString() {
        StringBuilder outputString = new StringBuilder();
        outputString.append("[");

        for (int i = 0; i < size(); i++) {
            outputString.append(get(i))
                    .append((i != size() - 1 ? "," : ""));
        }
        outputString.append("]");
        return outputString.toString();
    }
}
