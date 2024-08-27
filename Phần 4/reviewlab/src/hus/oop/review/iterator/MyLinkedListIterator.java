package hus.oop.review.iterator;

import hus.oop.review.collection.MyLinkedListNode;

public class MyLinkedListIterator implements MyIterator {
    MyLinkedListNode currentNode;

    public MyLinkedListIterator(MyLinkedListNode currentNode) {
        this.currentNode = currentNode;
    }

    @Override
    public boolean hasNext() {
        if (currentNode.getNext() != null) {
            return true;
        }
        return false;
    }

    @Override
    public Object next() {
        return currentNode.getNext();
    }
}
