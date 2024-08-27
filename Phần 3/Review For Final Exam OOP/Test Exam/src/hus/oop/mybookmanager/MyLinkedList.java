package hus.oop.mybookmanager;

public class MyLinkedList extends AbstractMyList {
    private Node head;
    private int size;

    private class MyLinkedListIterator implements MyIterator {
        private int currentPosition;
        private Node currentNode;

        public MyLinkedListIterator(int start) {
            /* TODO */
            this.currentPosition = start;
        }

        public MyLinkedListIterator(int currentPosition, Node currentNode) {
            this.currentPosition = currentPosition;
            this.currentNode = currentNode;
        }

        @Override
        public boolean hasNext() {
            /* TODO */
            if (currentPosition < size) {
                return true;
            }

            return false;
        }

        @Override
        public Object next() {
            /* TODO */
            if (hasNext()) {
                if (currentPosition++ == 0) {
                    return head.data;
                }

                currentNode = currentNode.next;
                return currentNode.data;
            }

            return null;
        }
    }

    /**
     * Hàm dựng khởi tạo list để chứa dữ liệu.
     */
    public MyLinkedList() {
        /* TODO */
        this.size = 0;
    }

    @Override
    public int size() {
        /* TODO */
        return this.size;
    }

    @Override
    public Object get(int index) {
        if (!checkBoundaries(index, size)) {
            return null;
        }

        return getNodeByIndex(index).data;
    }

    /**
     * Sửa dữ liệu ở vị trí index thành data.
     * @param data
     * @param index
     */
    @Override
    public void set(Object data, int index) {
        /* TODO */
        if (!checkBoundaries(index, size)) {
            throw new ArrayIndexOutOfBoundsException("index is not valid");
        }

        this.getNodeByIndex(index).data = data;
    }

    /**
     * Thêm phần tử dữ liệu vào đầu tập dữ liệu.
     * @param value giá trị của phần tử dữ liệu được thêm vào.
     */
    @Override
    public void insertAtStart(Object value) {
        /* TODO */
        insertAtPosition(value, 0);
    }

    /**
     * Thêm phần tử dữ liệu vào cuối tập dữ liệu.
     * @param value giá trị của phần tử dữ liệu được thêm vào.
     */
    @Override
    public void insertAtEnd(Object value) {
        /* TODO */
        insertAtPosition(value, size);
    }

    /**
     * Thêm phần tử dữ liệu vào vị trí index của tập dữ liệu.
     * Chỉ thêm được nếu index nằm trong đoạn [0 - size()].
     * @param value
     * @param index
     */
    @Override
    public void insertAtPosition(Object value, int index) {
        /* TODO */
        if (!checkBoundaries(index, size)) {
            throw new ArrayIndexOutOfBoundsException("index is not valid");
        }

        if (index == 0) {
            head = new Node(value, head);
        } else {
            Node currentNode = getNodeByIndex(index - 1);
            currentNode.next = new Node(value, currentNode.next);
        }

        this.size++;
    }

    /**
     * Xóa phần tử dữ liệu tại vị trí index.
     * Chỉ xóa được nếu index nằm trong đoạn [0 - (size() - 1)]
     * @param index
     */
    @Override
    public void remove(int index) {
        /* TODO */
        if (!checkBoundaries(index, size)) {
            throw new ArrayIndexOutOfBoundsException("index is not valid");
        }

        if (index == 0) {
            head = head.next;
        }

        Node currentNode = getNodeByIndex(index - 1);
        currentNode.next = getNodeByIndex(index + 1);
        this.size--;
    }

    @Override
    public void addAll(MyList myList) {
        for (int i = 0; i < myList.size(); i++) {
            this.insertAtEnd(myList.get(i));
        }
    }

    /**
     * Phương thức lấy Node ở vị trí index.
     * @param index
     * @return
     */
    private Node getNodeByIndex(int index) {
        /* TODO */
        Node currentNode = head;

        for (int i = 0; i < index; i++) {
            currentNode = currentNode.next;
        }

        return currentNode;
    }

    @Override
    public MyIterator iterator() {
        /* TODO */
        return new MyLinkedListIterator(0, getNodeByIndex(0));
    }
}
