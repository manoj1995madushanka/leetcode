package crackinterview;

public class SlightlyLinkedList {
}

// only file name class can add public access modifier
class Node {
    private Node next = null;
    private int data;

    Node(int data) {
        this.data = data;
    }

    public void appendToTail(int tailData) {
        Node tail = this;

        while (tail != null) {
            tail = tail.next;
        }

        tail.next = new Node(tailData);
    }
}
