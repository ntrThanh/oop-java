package datastructure;

public class Node {
    public int data;
    public Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }

    public Node(int value, Node next) {
        this.next = next;
        this.data = value;
    }
}
