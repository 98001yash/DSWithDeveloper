package array1.easy;



class CLL {
    Node head;
    Node tail;
    int size;

    // Insert at end
    void insertAtEnd(int val) {
        Node temp = new Node(val);
        if (head == null) {
            head = temp;
            tail = temp;
            temp.next = head;
        } else {
            tail.next = temp;
            tail = temp;
            tail.next = head; // maintain circular
        }
        size++;
    }

    // Insert at head
    void insertAtHead(int val) {
        Node temp = new Node(val);
        if (head == null) {
            head = temp;
            tail = temp;
            temp.next = head;
        } else {
            temp.next = head;
            head = temp;
            tail.next = head; // update circular link
        }
        size++;
    }

    // Insert at given index
    void insert(int idx, int val) {
        if (idx < 0 || idx > size) {
            System.out.println("Invalid index");
            return;
        }
        if (idx == 0) {
            insertAtHead(val);
            return;
        }
        if (idx == size) {
            insertAtEnd(val);
            return;
        }

        Node temp = new Node(val);
        Node curr = head;
        for (int i = 1; i <= idx - 1; i++) {
            curr = curr.next;
        }
        temp.next = curr.next;
        curr.next = temp;
        size++;
    }

    // Delete at head
    void deleteAtHead() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        if (head == tail) { // only one node
            head = tail = null;
        } else {
            head = head.next;
            tail.next = head;
        }
        size--;
    }

    // Delete at given index
    void delete(int idx) {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        if (idx < 0 || idx >= size) {
            System.out.println("Invalid index");
            return;
        }
        if (idx == 0) {
            deleteAtHead();
            return;
        }
        Node curr = head;
        for (int i = 1; i <= idx - 1; i++) {
            curr = curr.next;
        }
        curr.next = curr.next.next;
        if (idx == size - 1) { // deleting tail
            tail = curr;
        }
        size--;
    }

    // Get element at index
    int get(int idx) {
        if (head == null) {
            System.out.println("List is empty");
            return -1;
        }
        if (idx < 0 || idx >= size) {
            System.out.println("Invalid index!!");
            return -1;
        }
        Node temp = head;
        for (int i = 0; i < idx; i++) {
            temp = temp.next;
        }
        return temp.data;
    }

    // Size of list
    int size() {
        return size;
    }

    // Print circular list (stops when back to head)
    void print() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        Node temp = head;
        do {
            System.out.print(temp.data + " ");
            temp = temp.next;
        } while (temp != head);
        System.out.println();
    }
}

public class CircularLinkedList {
    public static void main(String[] args) {
        CLL list = new CLL();

        list.insertAtEnd(10);
        list.insertAtEnd(20);
        list.insertAtEnd(30);
        list.insertAtEnd(40);

        list.print(); // 10 20 30 40

        list.insertAtHead(5);
        list.print(); // 5 10 20 30 40

        list.insert(2, 15);
        list.print(); // 5 10 15 20 30 40

        System.out.println("Element at index 3: " + list.get(3)); // 20
        System.out.println("Size: " + list.size()); // 6

        list.deleteAtHead();
        list.print(); // 10 15 20 30 40

        list.delete(4); // delete last (tail)
        list.print(); // 10 15 20 30
    }
}
