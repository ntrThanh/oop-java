package oop.hus.day1;

public class MyLinkedListIterator implements MyIterator {
    private MyLinkedListNode currentNode;
    private int count;

    public MyLinkedListIterator(MyLinkedListNode currentNode) {
        this.currentNode = currentNode;
        count = 0;
    }

    @Override
    public boolean hasNext() {
        if (count == 0) {
            count++;
            return currentNode != null;
        }
        currentNode = currentNode.getNext();
        return currentNode != null;
    }

    @Override
    public Object next() {
        return currentNode.getPayLoad();
    }
}
