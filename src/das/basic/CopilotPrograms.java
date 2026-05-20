/*
// Node class to represent each element in the list
class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

// SinglyLinkedList class with core operations
class SinglyLinkedList {
    private Node head;

    // Insert a node at the end
    public void insert(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            return;
        }

        Node current = head;
        while (current.next != null) {
            current = current.next;
        }

        current.next = newNode;
    }

    // Delete a node by value
    public void delete(int value) {
        if (head == null) return;

        if (head.data == value) {
            head = head.next;
            return;
        }

        Node current = head;
        while (current.next != null && current.next.data != value) {
            current = current.next;
        }

        if (current.next != null) {
            current.next = current.next.next;
        }
    }

    // Search for a value
    public boolean search(int value) {
        Node current = head;
        while (current != null) {
            if (current.data == value) return true;
            current = current.next;
        }
        return false;
    }

    // Display the list
    public void display() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }
}

// Main class to test the linked list
public class Main {
    public static void main(String[] args) {
        SinglyLinkedList list = new SinglyLinkedList();

        list.insert(5);
        list.insert(10);
        list.insert(15);
        list.display(); // Output: 5 -> 10 -> 15 -> null

        list.delete(10);
        list.display(); // Output: 5 -> 15 -> null

        System.out.println("Search 15: " + list.search(15)); // Output: true
        System.out.println("Search 10: " + list.search(10)); // Output: false
    }
}
*/
