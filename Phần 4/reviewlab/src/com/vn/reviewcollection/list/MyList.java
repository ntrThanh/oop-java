package com.vn.reviewcollection.list;

public interface MyList {
    void append(int number);
    int get(int index);
    void insert(int number, int index);
    void remove(int index);
    int size();
    int[] toArray();
}
