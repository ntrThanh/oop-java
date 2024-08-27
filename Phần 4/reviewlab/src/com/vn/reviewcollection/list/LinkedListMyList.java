package com.vn.reviewcollection.list;

public class LinkedListMyList extends AbstractMyList {
    private Node head;
    private int size;

    public LinkedListMyList() {
        head = null;
        size = 0;
    }

    @Override
    public void append(int index) {
         insert(index, size);
    }

    @Override
    public int get(int index) {
        return getNodeByIndex(index).data;
    }

    @Override
    public void insert(int number, int index) {
        checkBoundaries(index, size);

        if (index == 0) {
            head = new Node(number, head);
        } else {
            Node currentNode = getNodeByIndex(index - 1);
            currentNode.next = new Node(number, currentNode.next);
        }

        size++;
    }

    @Override
    public void remove(int index) {
    checkBoundaries(index, size);
        Node currentNode = getNodeByIndex(index - 1);
        currentNode.next = getNodeByIndex(index + 1);
        size--;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public int[] toArray() {
        int[] listDataToArray = new int[size];
        for (int i = 0; i < size; i++) {
            listDataToArray[i] = get(i);
        }
        return listDataToArray;
    }

    private Node getNodeByIndex(int index) {
        Node current = head;
        for (int i = 0; i < index; i++) {
            current = current.next;
        }
        return current;
    }
}

class Node {
    int data;
    Node next;

    public Node(int data, Node next) {
        this.data = data;
        this.next = next;
    }
}
