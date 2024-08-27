package hus.oop.mylist;

public class MyLinkedList extends MyAbstractList {
    private MyLinkedListNode head;
    private int size;

    public MyLinkedList() {
        this.size = 0;
    }

    @Override
    public MyIterator iterator() {
        return new MyLinkedListIterator();
    }

    @Override
    public void insert(int index, Object object) {
        checkBoundaries(size, index);

        if (index == 0) {
            head = new MyLinkedListNode(object, head);
        } else {
            MyLinkedListNode currentNode = getNodeByIndex(index - 1);
            currentNode.setNext(new MyLinkedListNode(object, currentNode.getNext()));
        }

        this.size++;
    }

    @Override
    public void append(Object object) {
        this.insert(size, object);
    }

    @Override
    public int size() {
        return this.size;
    }

    @Override
    public Object get(int index) {
        checkBoundaries(size, index);
        return this.getNodeByIndex(index).getPayLoad();
    }

    @Override
    public void set(int index, Object object) {
        checkBoundaries(size, index);
        this.getNodeByIndex(index).setPayLoad(object);
    }

    @Override
    public void remove(int index) {
        checkBoundaries(size, index);
        if (index == 0) {
            head = getNodeByIndex(index + 1);
        } else {
            MyLinkedListNode currentNode = getNodeByIndex(index - 1);
            currentNode.setNext(getNodeByIndex(index + 1));
        }
        this.size--;
    }

    private MyLinkedListNode getNodeByIndex(int index) {
        MyLinkedListNode currentNode = head;

        for (int i = 0; i < index; i++) {
            currentNode = currentNode.getNext();
        }

        return currentNode;
    }

    private class MyLinkedListIterator implements MyIterator {
        private int currentPosition;
        private MyLinkedListNode currentNode;

        public MyLinkedListIterator() {
            currentPosition = 0;
            currentNode = head;
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
            if (hasNext()) {
                if (currentPosition++ == 0) {
                    return currentNode.getPayLoad();
                }

                currentNode = currentNode.getNext();
                return currentNode.getPayLoad();
            }
            return null;
        }
    }
}
