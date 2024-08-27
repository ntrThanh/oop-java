package hus.oop.review.collection;

import hus.oop.review.iterator.MyArrayListIterator;
import hus.oop.review.iterator.MyIterator;

public class MyLinkedList extends MyAbstractList {
    private MyLinkedListNode head;
    private int size;

    public MyLinkedList() {
        head = null;
        size = 0;
    }

    @Override
    public MyIterator iterator() {
        Object[] data = new Object[size];

        for (int i = 0; i < data.length; i++) {
            data[i] = get(i);
        }
        return new MyArrayListIterator(data);
    }

    @Override
    public void append(Object object) {
        insert(object, size);
    }

    @Override
    public Object get(int index) {
        return getNodeByIndex(index).getPayLoad();
    }

    @Override
    public void insert(Object object, int index) {
        checkBoundaries(index, size);
        if (index == 0) {
            head = new MyLinkedListNode(object, head);
        } else {
            MyLinkedListNode current = getNodeByIndex(index - 1);
            current.setNext(new MyLinkedListNode(object, current.getNext()));
        }
        size++;
    }

    private MyLinkedListNode getNodeByIndex(int index) {
        MyLinkedListNode current = head;
        for (int i = 0; i < index; i++) {
            current = current.getNext();
        }
        return current;
    }

    @Override
    public void remove(int index) {
        checkBoundaries(index, size);

        MyLinkedListNode currentNode = getNodeByIndex(index - 1);
        currentNode.setNext(getNodeByIndex(index + 1));
        size--;
    }

    @Override
    public void set(Object object, int index) {
        MyLinkedListNode currentNode = getNodeByIndex(index);
        currentNode.setPayLoad(object);
    }

    @Override
    public int size() {
        return size;
    }
}
