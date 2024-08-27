package hus.oop.lab9.mylist;

public class MyLinkedListNode {
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

    public void setPayLoad(Object dataValue) {
        this.payLoad = dataValue;
    }

    public MyLinkedListNode getNext() {
        return next;
    }

    public void setNext(MyLinkedListNode nextValue) {
        this.next = nextValue;
    }
}
