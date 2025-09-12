//package array1.easy;
////
//public class Main {
//    public static int max(int[] arr){
//        int n = arr.length;
//        int mx = Integer.MIN_VALUE;
//        for(int i=0;i<n;i++){
//             mx = Math.max(arr[i], mx);
//        }
//        return mx;
//    }


    // finding second  max element in the array
//    public static int secondMax(int[] arr){
//        int n  = arr.length;
//        int mx = Integer.MIN_VALUE;
//        for(int i=0;i<n;i++){
//            mx = Math.max(arr[i], mx);
//        }
//
//        int smx = Integer.MIN_VALUE;
//        for(int i=0;i<n; i++){
//            if(arr[i]!=mx){
//                smx = Math.max(smx, arr[i]);
//            }
//        }
//        return smx;
//    }
//    public static void main(String[] args){
//        int[] arr = {3,4,5,1,2,8,6,0,9,45,67};
//
//        System.out.println(secondMax(arr));
//
//    }
//}


//    check if the array is sorted or not
//package array1.easy;
//
//import java.util.ArrayList;
//
//public class Main {
//
//    public  static boolean isSorted(ArrayList<Integer> nums) {
//        int n = nums.size();
//        for(int i=0;i<n-1;i++){
//            if(nums.get(i)<nums.get(i+1)) return true;
//        }
//        return false;
//    }
//    public static void main(String[] args){
//
//        ArrayList<Integer> arr = new ArrayList<>();
//         arr.add(1);
//         arr.add(4);
//         arr.add(6);
//         arr.add(90);
//        System.out.println(isSorted(arr));
//    }
//}

// remove duplaicates from sorted array using hashSet brute force approach
//package array1.easy;
//import java.util.*;
//public class Main {
//    public static void main(String[] args){
//        int[] arr = {1,2,3,3,4,5,7,7,8,9,9,9,10,11,11};
//
//        HashSet<Integer> sets = new HashSet<>();
//        for(int ele:arr){
//            sets.add(ele);
//        }
//
//        System.out.println(sets.size());
//
//        for(int element:sets){
//            System.out.print(element+" ");
//        }
//    }
//}



// best approach
//package array1.easy;
//public class Main {
//
//    public static int removeDuplicates(int[] arr){
//        int n = arr.length;
//        int i = 0;
//        for(int j=1;j<n;j++){
//            if(arr[i]!=arr[j]) i++;
//            arr[i] = arr[j];
//        }
//        return i+1;
//    }
//    public static void main(String[] args){
//        int[] arr = {1,2,3,3,4,5,7,7,8,9,9,9,10,11,11};
//        System.out.println(removeDuplicates(arr));
//
//    }
//}

//   left rotate the array by one

//package array1.easy;
//public class Main {
//    public static void rotateArrayByOne(int[] nums) {
//        int n = nums.length;
//        int first = nums[0];
//
//        for (int i = 0; i < n - 1; i++) {
//            nums[i] = nums[i + 1];
//        }
//
//        nums[n - 1] = first;
//
//        for (int num : nums) {
//            System.out.print(num + " ");
//        }
//        System.out.println();
//    }
//
//    public static void main(String[] args) {
//        int[] arr = {1, 2, 3, 4, 5};
//        rotateArrayByOne(arr);  // Output: 2 3 4 5 1
//    }
//}


//package array1.easy;
//import java.util.HashMap;
//import java.util.Scanner;
//
//public class Main {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//
//        System.out.println("Yash chauhan....UID is 23bcs80339");
//
//        System.out.print("Enter the size of the array: ");
//        int n = sc.nextInt();
//
//        int[] arr = new int[n];
//
//        System.out.println("Enter the elements of the array:");
//        for (int i = 0; i < n; i++) {
//            arr[i] = sc.nextInt();
//        }
//
//        HashMap<Integer, Integer> frequencyMap = new HashMap<>();
//
//
//        for (int num : arr) {
//            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
//        }
//
//
//        System.out.println("\nElement frequencies:");
//        for (Integer key : frequencyMap.keySet()) {
//            System.out.println(key + " -> " + frequencyMap.get(key));
//        }
//
//        sc.close();
//    }
//}


package array1.easy;
class Node  {
    int data;
    Node next;
    Node prev;
    Node(int data){
        this.data = data;
    }
}
class SLL {
    Node head;
    Node tail;
    int size;

    void insertAtEnd(int val) {
        Node temp = new Node(val);
        if (head == null) {
            head = temp;
            tail = temp;
        } else {
            tail.next = temp;
            tail = temp;
        }
    }

    void print() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }

    int size() {
        Node temp = head;
        int count = 0;
        while (temp != null) {
            count++;
            temp = temp.next;
        }
        return count;
    }

    void insertAtHead(int data) {
        Node temp = new Node(data);
        if (head == null) {
            head = temp;
            tail = temp;
        } else {
            temp.next = head;
            head = temp;
        }
    }

    void insert(int idx, int val) {
        Node temp = new Node(val);
        if (idx == 0) {
            insertAtHead(val);
        }
        if (idx == size()) {
            insertAtEnd(val);
        }
        if (idx > size()) {
            System.out.println("invalid index");
            return;
        }
        Node x = head;
        for (int i = 1; i <= idx - 1; i++) {
            x = x.next;
        }
        temp.next = x.next;
        x.next = temp;
    }

    int get(int idx) {
        if (idx == size() - 1) return tail.data;
        if (idx >= size() || idx < 0) {
            System.out.println("invalid index!!");
            return -1;
        }
        Node temp = head;
        for (int i = 1; i <= idx; i++) {
            temp = temp.next;
        }
        return temp.data;
    }
    void deleteAtHead() {
        if(head==null){
            System.out.println("list is empty");
        }
        head = head.next;
        size--;
    }
    void delete(int idx){
        if(head==null){
            System.out.println("list is empty");
        }
        if(idx<0||idx>=size){
            System.out.println("invalid index");
        }
        Node temp = head;
        for(int i=1;i<=idx-1;i++){
            temp = temp.next;
        }
        temp.next = temp.next.next;
        size--;
    }
}
public class Main {
    public static void main(String[] args) {

        System.out.println("Priyanshu raj.....23bcs10102");
SLL list = new SLL();
list.insertAtEnd(1);
        list.insertAtEnd(2);
        list.insertAtEnd(3);
        list.insertAtEnd(4);
    list.print();
    list.insertAtHead(11);
        list.insertAtHead(98);
        list.insertAtHead(90);
        System.out.println();
        list.print();
        System.out.println();
        list.insert(2,100);
        list.insert(4,120);
        System.out.println();
        System.out.println(list.get(2));
        list.print();
        System.out.println();
    System.out.println(list.size());
        System.out.println();
        list.deleteAtHead();
        System.out.println();
        list.delete(4);

        list.print();
    }
}

