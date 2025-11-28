//https://www.geeksforgeeks.org/dsa/linked-list-data-structure/

public class SinglyLinkedList {

    // Node blueprint
    private static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // Head pointer
    private Node head;

    // Insert at beginning — O(1)
    public void insertAtHead(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    // Insert at end — O(n)
    public void insertAtTail(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
    }

    // Insert at specific position — O(n)
    public void insertAtPosition(int data, int position) {
        if (position < 1) {
            throw new IllegalArgumentException("Invalid position");
        }
        if (position == 1) {
            insertAtHead(data);
            return;
        }
        Node newNode = new Node(data);
        Node temp = head;
        int count = 1;

        while (temp != null && count < position - 1) {
            temp = temp.next;
            count++;
        }

        if (temp == null) {
            throw new IllegalArgumentException("Position exceeds list size");
        }

        newNode.next = temp.next;
        temp.next = newNode;
    }

    // Delete first occurrence of a value — O(n)
    public void deleteByValue(int value) {
        if (head == null)
            return;

        if (head.data == value) {
            head = head.next;
            return;
        }

        Node temp = head;
        while (temp.next != null && temp.next.data != value) {
            temp = temp.next;
        }

        if (temp.next != null) {
            temp.next = temp.next.next;
        }
    }

    // Delete node at position — O(n)
    public void deleteAtPosition(int position) {
        if (head == null || position < 1)
            return;

        if (position == 1) {
            head = head.next;
            return;
        }

        Node temp = head;
        int count = 1;

        while (temp != null && count < position - 1) {
            temp = temp.next;
            count++;
        }

        if (temp == null || temp.next == null)
            return;

        temp.next = temp.next.next;
    }

    // Search value — O(n)
    public boolean search(int key) {
        Node temp = head;
        while (temp != null) {
            if (temp.data == key)
                return true;
            temp = temp.next;
        }
        return false;
    }

    // Reverse linked list — O(n)
    public void reverse() {
        Node previous = null;
        Node current = head;
        Node next;

        while (current != null) {
            next = current.next;
            current.next = previous;
            previous = current;
            current = next;
        }
        head = previous;
    }

    // Get size — O(n)
    public int size() {
        int count = 0;
        Node temp = head;
        while (temp != null) {
            count++;
            temp = temp.next;
        }
        return count;
    }

    // Print list — O(n)
    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("NULL");
    }

    // Check if list is empty — O(1)
    public boolean isEmpty() {
        return head == null;
    }

    // Driver code
    public static void main(String[] args) {
        SinglyLinkedList list = new SinglyLinkedList();

        list.insertAtHead(10);
        list.insertAtHead(5);
        list.insertAtTail(20);
        list.insertAtPosition(15, 3);

        System.out.println("Linked List:");
        list.display();

        list.deleteByValue(10);
        System.out.println("After deleting 10:");
        list.display();

        list.reverse();
        System.out.println("After reversing:");
        list.display();

        System.out.println("List size: " + list.size());
        System.out.println("Search 15: " + list.search(15));
        System.out.println("Search 100: " + list.search(100));
    }
}
