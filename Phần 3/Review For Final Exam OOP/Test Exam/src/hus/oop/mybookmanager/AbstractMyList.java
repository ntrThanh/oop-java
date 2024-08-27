package hus.oop.mybookmanager;

public abstract class AbstractMyList implements MyList {
    /**
     * Phương thức kiểm tra xem index có nằm trong đoạn [0 - limit] không.
     * @param index
     * @param limit
     * @return
     */
    public boolean checkBoundaries(int index, int limit) {
        /* TODO */
        if (index < 0 || index > limit) {
            return false;
        }

        return true;
    }

    @Override
    public String toString() {
        StringBuilder resultString = new StringBuilder();

        for (int i = 0; i < size(); i++) {
            resultString.append("[").append(get(i)).append("]").append(" ");
        }

        return resultString.toString();
    }
}
