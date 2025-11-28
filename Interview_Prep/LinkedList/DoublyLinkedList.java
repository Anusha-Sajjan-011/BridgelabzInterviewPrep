//https://www.geeksforgeeks.org/dsa/doubly-linked-list/
public class DoublyLinkedList {

    // Node representation
    private static class Node {
        int data;
        Node prev;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    // Head and Tail pointers
    private Node head;
    private Node tail;

    // Insert at beginning — O(1)
    public void insertAtHead(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = tail = newNode;
            return;
        }
        newNode.next = head;
        head.prev = newNode;
        head = newNode;
    }

    // Insert at end — O(1)
    public void insertAtTail(int data) {
        Node newNode = new Node(data);

        if (tail == null) {
            head = tail = newNode;
            return;
        }
        tail.next = newNode;
        newNode.prev = tail;
        tail = newNode;
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
        newNode.prev = temp;

        if (temp.next != null) {
            temp.next.prev = newNode;
        } else {
            tail = newNode;
        }

        temp.next = newNode;
    }

    // Delete first occurrence of a value — O(n)
    public void deleteByValue(int value) {
        if (head == null)
            return;

        if (head.data == value) {
            head = head.next;
            if (head != null)
                head.prev = null;
            else
                tail = null;
            return;
        }

        Node temp = head;
        while (temp != null && temp.data != value) {
            temp = temp.next;
        }

        if (temp == null)
            return;

        if (temp.next != null) {
            temp.next.prev = temp.prev;
        } else {
            tail = temp.prev;
        }

        temp.prev.next = temp.next;
    }

    // Delete node at position — O(n)
    public void deleteAtPosition(int position) {
        if (position < 1 || head == null)
            return;

        if (position == 1) {
            head = head.next;
            if (head != null)
                head.prev = null;
            else
                tail = null;
            return;
        }

        Node temp = head;
        int count = 1;

        while (temp != null && count < position) {
            temp = temp.next;
            count++;
        }

        if (temp == null)
            return;

        if (temp.next != null) {
            temp.next.prev = temp.prev;
        } else {
            tail = temp.prev;
        }

        temp.prev.next = temp.next;
    }

    // Search — O(n)
    public boolean search(int key) {
        Node temp = head;
        while (temp != null) {
            if (temp.data == key)
                return true;
            temp = temp.next;
        }
        return false;
    }

    // Forward traversal — O(n)
    public void displayForward() {
        Node temp = head;
        System.out.print("HEAD -> ");
        while (temp != null) {
            System.out.print(temp.data + " <-> ");
            temp = temp.next;
        }
        System.out.println("NULL");
    }

    // Reverse traversal — O(n)
    public void displayBackward() {
        Node temp = tail;
        System.out.print("NULL <- ");
        while (temp != null) {
            System.out.print(temp.data + " <-> ");
            temp = temp.prev;
        }
        System.out.println("HEAD");
    }

    // Count nodes — O(n)
    public int size() {
        int count = 0;
        Node temp = head;
        while (temp != null) {
            count++;
            temp = temp.next;
        }
        return count;
    }

    // Check if list is empty — O(1)
    public boolean isEmpty() {
        return head == null;
    }

    // Driver code
    public static void main(String[] args) {
        DoublyLinkedList dll = new DoublyLinkedList();

        dll.insertAtHead(10);
        dll.insertAtHead(5);
        dll.insertAtTail(20);
        dll.insertAtPosition(15, 3);

        System.out.println("Forward Traversal:");
        dll.displayForward();

        System.out.println("Backward Traversal:");
        dll.displayBackward();

        dll.deleteByValue(10);
        System.out.println("After deleting 10:");
        dll.displayForward();

        dll.deleteAtPosition(2);
        System.out.println("After deleting node at position 2:");
        dll.displayForward();

        System.out.println("Size: " + dll.size());
        System.out.println("Search 20: " + dll.search(20));
        System.out.println("Search 100: " + dll.search(100));
    }
}
