package datastructure;

public class LinkedListMyList extends AbstractMyList {
    private Node start;
    private Node end;
    private int size;

    /**
     * Hàm dựng khởi tạo list để chứa dữ liệu.
     */
    public LinkedListMyList() {
        this.start = null;
    }

    @Override
    public int size() {
        /* TODO */
        return size;
    }

    /**
     * Lấy giá trị của phần tử ở vị trí index.
     *
     * @param index
     * @return
     */
    @Override
    public int get(int index) {
        /* TODO */
        if (checkBoundaries(index, size)) {
            return getNodeByIndex(index).data;
        }
        return Integer.MIN_VALUE;
    }

    /**
     * Sửa dữ liệu ở vị trí index thành data.
     *
     * @param data
     * @param index
     */
    @Override
    public void set(int data, int index) {
        /* TODO */
        if (checkBoundaries(index, size)) {
            getNodeByIndex(index).data = data;
        }
    }

    /**
     * Thêm phần tử dữ liệu vào đầu tập dữ liệu.
     *
     * @param value giá trị của phần tử dữ liệu được thêm vào.
     */
    @Override
    public void insertAtStart(int value) {
        /* TODO */
        insertAtPos(value, 0);
    }

    /**
     * Thêm phần tử dữ liệu vào cuối tập dữ liệu.
     *
     * @param value giá trị của phần tử dữ liệu được thêm vào.
     */
    @Override
    public void insertAtEnd(int value) {
        /* TODO */
        insertAtPos(value, size);
    }

    /**
     * Thêm phần tử dữ liệu vào vị trí index của tập dữ liệu.
     * Chỉ thêm được nếu index nằm trong đoạn [0 - size()].
     *
     * @param value
     * @param index
     */
    @Override
    public void insertAtPos(int value, int index) {
        /* TODO */
        if (checkBoundaries(index, size)) {
            if (index == 0) {
                start = new Node(value, start);
            } else {
                Node currentNode = getNodeByIndex(index - 1);
                currentNode.next = new Node(value, currentNode.next);
            }
            size++;
        }
    }

    /**
     * Xóa phần tử dữ liệu tại vị trí index.
     * Chỉ xóa được nếu index nằm trong đoạn [0 - (size() - 1)]
     *
     * @param index
     */
    @Override
    public void remove(int index) {
        /* TODO */
        if (checkBoundaries(index, size)) {
            Node currentNode = getNodeByIndex(index - 1);
            currentNode.next = getNodeByIndex(index + 1);
            size--;
        }
    }

    /**
     * Phương thức lấy Node ở vị trí index.
     *
     * @param index
     * @return
     */
    private Node getNodeByIndex(int index) {
        /* TODO */
        Node current = start;
        for (int i = 0; i < size; i++) {
            current = current.next;
        }
        return current;
    }

    /**
     * Lấy ra dữ liệu được lưu theo cấu trúc dữ liệu kiểu mảng.
     *
     * @return
     */
    @Override
    public int[] toArray() {
        /* TODO */
        int[] listDataToArray = new int[size];
        for (int i = 0; i < size; i++) {
            listDataToArray[i] = get(i);
        }
        return listDataToArray;
    }
}
