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

    public void deleteNode(int value) {
        Node head = this;

        if (head.data == value) {
            head = head.next;
        }

        while (head.next != null) {
            if (head.next.data == value) {
                head.next = head.next.next;
            }
        }
    }
}
