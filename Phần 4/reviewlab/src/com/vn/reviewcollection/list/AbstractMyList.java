package com.vn.reviewcollection.list;

public abstract class AbstractMyList implements MyList {
    public AbstractMyList() {
    }

    public boolean checkBoundaries(int index, int limit) {
        if (index < 0 || index > limit) {
            return false;
        }

        return true;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int i = 0; i < size(); i++) {
            sb.append(get(i)).append((i != size() - 1) ? "," : "");
        }
        sb.append("]");
        return sb.toString();
    }
}
