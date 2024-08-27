package hus.oop.colletions;

public class MyLinkedList extends AbstractMyList {
    private MyLinkedListNode head;
    private int size;

    public MyLinkedList() {
        this.size = 0;
    }

    private MyLinkedListNode getNodeByIndex(int index) {
        MyLinkedListNode currentNode = head;

        for (int i = 0; i < index; i++) {
            currentNode = currentNode.getNext();
        }

        return currentNode;
    }

    @Override
    public Iterator iterator() {
        return new MyLinkedListIterator();
    }

    @Override
    public int size() {
        return this.size;
    }

    @Override
    public Object get(int index) {
        checkBoundaries(this.size, index);
        return getNodeByIndex(index).getPayLoad();
    }

    @Override
    public void add(int index, Object object) {
        checkBoundaries(this.size, index);

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
        add(this.size, object);
    }

    @Override
    public void remove(int index) {
        checkBoundaries(this.size, index);

        MyLinkedListNode currentNode = getNodeByIndex(index - 1);
        currentNode.setNext(getNodeByIndex(index + 1));

        this.size--;
    }

    @Override
    public void addAll(MyList myList) {
        for (int i = 0; i < myList.size(); i++) {
            this.append(myList.get(i));
        }
    }

    @Override
    public void set(int index, Object object) {
        checkBoundaries(this.size, index);
        this.getNodeByIndex(index).setPayLoad(object);
    }

    public class MyLinkedListIterator implements Iterator {
        private int currentPosition;
        private MyLinkedListNode currentNode;

        public MyLinkedListIterator() {
            this.currentPosition = 0;
            this.currentNode = head;
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
                    return head.getPayLoad();
                }

                currentNode = currentNode.getNext();
                return currentNode;
            }
            return null;
        }
    }
}
