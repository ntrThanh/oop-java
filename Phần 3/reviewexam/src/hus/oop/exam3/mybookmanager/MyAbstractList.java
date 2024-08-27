package hus.oop.exam3.mybookmanager;

public abstract class MyAbstractList implements MyList {
    /**
     * Mô tả dữ liệu của list.
     * @return mô tả list theo định dạng [a1] [a2] [a3] ... [an]
     */
    @Override
    public String toString() {
        /* TODO */
        StringBuilder resultString = new StringBuilder();

        for(int i = 0; i < size(); i++) {
            resultString.append("[").append(get(i)).append("]").append("  ");
        }

        return resultString.toString();
    }

    public void checkBoundaries(int limit, int index) {
        if (index < 0 || index > limit) {
            throw new ArrayIndexOutOfBoundsException();
        }
    }
}
