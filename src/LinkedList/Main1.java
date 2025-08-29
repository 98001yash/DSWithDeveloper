package LinkedList;


class Node{
    int data;
    Node next;
    Node(int data){
        this.data = data;
    }
}
public class Main1 {

    public static Node mergeTwoLists(Node list1, Node list2){
        Node dummy = new Node(-1);
        Node temp  = dummy;

        while(list1!=null && list2!=null){
            if(list1.data< list2.data){
                temp.next = list1;
            }else {
                temp.next = list2;
                list2 = list2.next;
            }
            temp = temp.next;
        }
        if(list1!=null)  temp.next = list1;
        if(list2!=null) temp.next = list2;
        return dummy.next;
    }
    public static void main(String[] args){

    }
}
