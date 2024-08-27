package com.vn.reviewcollection.list;

public class ArrayMyList extends AbstractMyList {
    private final int DEFAULT_CAPACITY = 16;
    private int[] data;
    private int size;

    public ArrayMyList() {
        data = new int[DEFAULT_CAPACITY];
        size = 0;
    }

    @Override
    public void append(int number) {
        checkBoundaries(number, size);
        if (size >= data.length) {
            allocateMore();
        }

        data[size] = number;
        size++;
    }

    @Override
    public int get(int index) {
        checkBoundaries(index, size);
        return data[index];
    }

    @Override
    public void insert(int number, int index) {
        checkBoundaries(index, size);

        for (int i = size; i > index; i--) {
            data[i] = data[i - 1];
        }

        data[index] = number;
        size++;
    }

    @Override
    public void remove(int index) {
        checkBoundaries(index, size);
        for (int i = index; i < size; i++) {
            data[i] = data[i + 1];
        }
        size--;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public int[] toArray() {
        int[] dataArray = new int[size];
        for (int i = 0; i < size; i++) {
            dataArray[i] =get(i);
        }
        return dataArray;
    }

    private void allocateMore() {
        int[] currentArray = new int[data.length * 2];
        System.arraycopy(data, 0, currentArray, 0, data.length);
        data = currentArray;
    } 

    public static void main(String[] args) {
        MyList list = new ArrayMyList();
        list.append(1);
        list.append(2);
        list.append(3);
        list.append(11);
        list.append(16);
        list.insert(3, 4);
        list.remove(3);

        System.out.println(list.toString() + " | the size: " + list.size());
    }
}
