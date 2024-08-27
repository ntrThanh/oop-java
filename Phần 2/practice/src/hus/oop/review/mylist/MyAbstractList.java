package hus.oop.review.mylist;

public abstract class MyAbstractList implements MyList {
    /**
     * Mô tả dữ liệu của list.
     * @return mô tả list theo định dạng [a1] [a2] [a3] ... [an]
     */
    @Override
    public String toString() {
        /* TODO */
        StringBuilder stringBuilder = new StringBuilder();
        for(int i = 0; i < size(); i++) {
            stringBuilder.append("[").append(get(i)).append("]").append(" ");
        }
        return stringBuilder.toString();
    }

    public boolean checkBoundaries(int limit, int index) {
        if (index < 0 || index > limit) {
            return false;
        }

        return true;
    }
}
