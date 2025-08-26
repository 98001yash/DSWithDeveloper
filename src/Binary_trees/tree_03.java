package Binary_trees;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

// level order traversal using Queue
// BFS  => Breadth first search-
public class tree_03 {

    static int n;

    public static void levelOrder(Node root){
        Queue<Node> q = new LinkedList<>();

        if(root!=null)q.add(root);
        while(q.size()>0){
            Node front = q.remove();
            System.out.print(front.val+" ");
            if(front.left!=null) q.add(front.left);
            if(front.right!=null) q.add(front.right);
        }
    }

    // find the nth level of the  tree

    private static void nthLevel(Node root, int level){
        if(root == null) return;
        if(level == n) System.out.print(root.val+" ");
        nthLevel(root.left, level+1);
        nthLevel(root.right, level+1);

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Node a = new Node(1);
        Node b = new Node(2);
        Node c = new Node(3);
        Node d = new Node(4);
        Node e = new Node(5);
        Node f = new Node(6);
        Node g = new Node(7);
        Node h = new Node(8);
        Node i = new Node(9);

        a.left = b;
        a.right = c;
        b.left = d;
        b.right = e;
        c.left = f;
        c.right = g;
        e.left = h; e.right = i;

        System.out.print("Level order: ");
        levelOrder(a);
        System.out.println();

        System.out.println("Enter the number: ");
         n = sc.nextInt();

        nthLevel(a,0);

    }
}
