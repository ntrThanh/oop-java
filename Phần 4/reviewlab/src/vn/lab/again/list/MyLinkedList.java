package vn.lab.again.list;

public class MyLinkedList extends MyAbstractList {
    private int size;
    private MyLinkedListNode head;

    public MyLinkedList() {
        head = null;
        size = 0;
    }

    private MyLinkedListNode getNodeByIndex(int index) {
        MyLinkedListNode currentNode = head;

        for (int i = 0; i < index; i++) {
            currentNode = currentNode.getNext();
        }

        return currentNode;
    }

    @Override
    public void add(Object object, int index) {
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
    public int size() {
        return size;
    }

    @Override
    public Object get(int index) {
        return getNodeByIndex(index).getPayLoad();
    }

    @Override
    public void add(Object object) {
        add(object, size);
    }
}

class MyLinkedListNode {
    private Object payLoad;
    private MyLinkedListNode next;

    public MyLinkedListNode(Object payLoad, MyLinkedListNode next) {
        this.payLoad = payLoad;
        this.next = next;
    }

    public MyLinkedListNode(Object payLoad) {
        this.payLoad = payLoad;
    }

    public Object getPayLoad() {
        return payLoad;
    }

    public void setPayLoad(Object payLoad) {
        this.payLoad = payLoad;
    }

    public MyLinkedListNode getNext() {
        return next;
    }

    public void setNext(MyLinkedListNode next) {
        this.next = next;
    }
}
