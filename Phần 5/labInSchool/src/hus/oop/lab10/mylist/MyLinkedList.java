package hus.oop.lab10.mylist;

public class MyLinkedList extends MyAbstractList {
    MyLinkedListNode head;
    int size;

    public MyLinkedList() {
        head = null;
        size = 0;
    }

    private MyLinkedListNode getNodeMyIndex(int index) {
        MyLinkedListNode current = head;
        for (int i = 0; i < index; i++) {
            current = current.getNext();
        }
        return current;
    }

    @Override
    public void add(Object o) {
        add(o, size);
    }

    @Override
    public void add(Object o, int index) {
        checkBoundaries(index, size);
        if (index == 0) {
            head = new MyLinkedListNode(o, head);
        } else {
            MyLinkedListNode current = getNodeMyIndex(index - 1);
            current.setNext(new MyLinkedListNode(o, current.getNext()));
        }
        size++;
    }

    @Override
    public void remove(int index) {
        checkBoundaries(index, size);
        MyLinkedListNode current = getNodeMyIndex(index - 1);
        current.setNext(getNodeMyIndex(index + 1));
        size--;
    }

    @Override
    public Object get(int index) {
        checkBoundaries(index, size);
        return getNodeMyIndex(index).getPayload();
    }

    @Override
    public int size() {
        return size;
    }
}
