package oop.hus.day1;

public class MyLinkedList extends MyAbstractList {
    private MyLinkedListNode head;
    private int size;

    public MyLinkedList() {
        head = null;
        size = 0;
    }

    private MyLinkedListNode getNodeByIndex(int index) {
        checkBoundaries(index, size);

        MyLinkedListNode currentNode = head;
        for (int i = 0; i < index; i++) {
            currentNode = currentNode.getNext();
        }

        return currentNode;
    }

    @Override
    public void append(Object object) {
        insert(object, size);
    }

    @Override
    public Object get(int index) {
        checkBoundaries(index, size);

        return getNodeByIndex(index).getPayLoad();
    }

    @Override
    public void insert(Object object, int index) {
        checkBoundaries(index, size);

        if (index == 0) {
            head = new MyLinkedListNode(object, head);
        } else {
            MyLinkedListNode currentNode = getNodeByIndex(index - 1);
            currentNode.setNext(new MyLinkedListNode(object, currentNode.getNext()));
        }

        size++;
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
        checkBoundaries(index, size);

        MyLinkedListNode currentNode = getNodeByIndex(index);
        currentNode.setPayLoad(object);
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public MyIterator iterator() {
        return new MyLinkedListIterator(head);
    }
}
