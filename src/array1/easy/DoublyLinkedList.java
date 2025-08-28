package array1.easy;

public class DoublyLinkedList {

    // Node class
    class Node {
        int data;
        Node next, prev;

        Node(int data) {
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }

    // Doubly Linked List class
    class DLL {
        Node head = null;
        Node tail = null;
        int size = 0;

        // Display the list
        void display() {
            Node temp = head;
            while (temp != null) {
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
            System.out.println();
        }

        // Insert at head
        void insertAtHead(int val) {
            Node temp = new Node(val);
            if (head == null) {
                head = tail = temp;
            } else {
                temp.next = head;
                head.prev = temp;
                head = temp;
            }
            size++;
        }

        // Insert at tail
        void insertAtTail(int val) {
            Node temp = new Node(val);
            if (tail == null) {
                head = tail = temp;
            } else {
                tail.next = temp;
                temp.prev = tail;
                tail = temp;
            }
            size++;
        }

        // Insert at a given index
        void insert(int idx, int val) {
            if (idx < 0 || idx > size) {
                throw new RuntimeException("Invalid index....");
            }
            if (idx == 0) {
                insertAtHead(val);
                return;
            }
            if (idx == size) {
                insertAtTail(val);
                return;
            }

            Node temp = new Node(val);
            Node current = head;

            // move to index-1
            for (int i = 0; i < idx - 1; i++) {
                current = current.next;
            }

            Node nextNode = current.next;
            current.next = temp;
            temp.prev = current;
            temp.next = nextNode;
            nextNode.prev = temp;

            size++;
        }

        // Delete at head
        void deleteAtHead() {
            if (head == null) return;

            if (head == tail) { // only one element
                head = tail = null;
            } else {
                head = head.next;
                head.prev = null;
            }
            size--;
        }

        // Delete at tail
        void deleteAtTail() {
            if (tail == null) return;

            if (head == tail) { // only one element
                head = tail = null;
            } else {
                tail = tail.prev;
                tail.next = null;
            }
            size--;
        }

        // Delete at index
        void delete(int idx) {
            if (idx < 0 || idx >= size) {
                throw new RuntimeException("Invalid index....");
            }
            if (idx == 0) {
                deleteAtHead();
                return;
            }
            if (idx == size - 1) {
                deleteAtTail();
                return;
            }

            Node current = head;
            for (int i = 0; i < idx; i++) {
                current = current.next;
            }

            Node prevNode = current.prev;
            Node nextNode = current.next;

            prevNode.next = nextNode;
            nextNode.prev = prevNode;

            size--;
        }
    }

    // Main method for testing
    public static void main(String[] args) {
        DoublyLinkedList outer = new DoublyLinkedList();
        DLL list = outer.new DLL();

        list.insertAtHead(10);
        list.insertAtTail(20);
        list.insertAtTail(30);
        list.insert(1, 15); // insert at index 1

        list.display(); // 10 15 20 30

        list.delete(2); // delete element at index 2 (20)
        list.display(); // 10 15 30

        list.deleteAtHead();
        list.display(); // 15 30

        list.deleteAtTail();
        list.display(); // 15
    }
}

