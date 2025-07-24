//package stack;
//import java.util.*;
//
//// Analyze if the stack is empty or full, and if elements are present,
//// return the top element in the stack using templates.
//// Also, perform push and pop operations on the stack
//
//public class Assessment_01 {
//    public static void main(String[] args){
//
//        Stack<Integer> st = new Stack<>();
//        st.push(1);
//        st.push(2);
//        st.push(3);
//        st.push(4);
//        st.push(5);
//
//        System.out.println(st);
//
//        if(st.isEmpty()){
//            System.out.println("stack is empty...");
//        }
//
//        System.out.println(st.peek());
//
//        st.pop();
//        System.out.println(st.peek());
//
//        System.out.println(st.size());
//
//
//    }
//}


package stack;
import java.util.*;
class StackImpl<T> {
    private Stack<Integer> stack;
    private int maxSize;

    public StackImpl(int size) {
        this.maxSize = size;
        this.stack = new Stack<>();
    }


    public void push(int ele) {
        if (stack.size() >= maxSize) {
            System.out.println("Stack is full . cannot push " + ele);
        } else {
            stack.push(ele);
        }
    }

    public int   pop() {
        if (stack.isEmpty()) {
            System.out.println("Stack is empty cannot pop.");
            return -1;
        }
        return stack.pop();
    }

    public int  peek() {
        if (stack.isEmpty()) {
            return -1;
        }
        return stack.peek();
    }

    public boolean isFull() {
        return stack.size() >= maxSize;
    }

    public boolean isEmpty() {
        return stack.isEmpty();
    }

    public int size() {
        return stack.size();
    }

    public void printStack() {
        if (stack.isEmpty()) {
            System.out.println("Stack is empty.");
        } else {
            System.out.println("Stack elements:");
            for (int i = stack.size() - 1; i >= 0; i--) {
                System.out.print(stack.get(i)+" ");
            }
            System.out.println();
        }
    }

}

public class Assessment_01 {
    public static void main(String[] args) {
        StackImpl<Integer> st = new StackImpl<>(3);
        st.push(11);
        st.push(15);
        st.push(45);
        st.push(40);

        System.out.println(st.peek());
        st.printStack();

        st.pop();
        st.printStack();

    }
}

//package stack;
//public class stacks_01 {
//    public static class Stack {
//        int[] arr = new int[5];
//        private int idx = 0;
//        void push(int x){
//            arr[idx] =x;
//            idx++;
//        }
//        int peek(){
//            if(idx==0){
//                System.out.println("stack is empty");
//                return -1;
//            }
//            return arr[idx-1];
//        }
//        int pop(){
//            if(idx==0){
//                System.out.println("stack is empty");
//                return -1;
//            }
//            int top = arr[idx-1];
//            arr[idx-1] = 0;
//            idx--;
//            return top;
//        }
//        void display(){
//            for(int i =0;i<=idx-1;i++){
//                System.out.print(arr[i]+" ");
//            }
//            System.out.println();
//        }
//        int size(){
//            return idx;
//        }
//        boolean isEmpty(){
//            if(size()==0) return true;
//            else return false;
//        }
//        boolean isFull(){
//            if(idx==arr.length) return true;
//            else return false;
//        }
//    }
//    public static void main(String[] args) {
//        Stack st = new Stack();
//        st.push(1);
//        st.push(2);
//        st.push(3);
//        System.out.println(st.peek());
//        st.display();
//
//        System.out.println(st.size());
//        st.pop();
//        st.display();
//
//    }
//}


