package khalil.java;

public class Doublelinkedlist {

    // Node class
    static class Node {
        int data;
        Node next;
        Node previous;

        Node(int data) {
            this.data = data;
            this.next = null;
            this.previous = null;
        }
    }

    public static void main(String[] args) {

        // Creating nodes
        Node first = new Node(10);
        Node second = new Node(20);
        Node third = new Node(30);

        // Linking nodes
        first.next = second;
        second.previous = first;

        second.next = third;
        third.previous = second;

        // Displaying Linked List
        System.out.println("Doubly Linked List:");

        Node current = first;

        while (current != null) {
            System.out.print(current.data + " <-> ");
            current = current.next;
        }

        System.out.println("null");
    }
}
