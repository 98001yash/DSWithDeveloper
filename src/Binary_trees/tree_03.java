package Binary_trees;

import java.util.LinkedList;
import java.util.Queue;

// level order traversal using Queue
// BFS  => Breadth first search-
public class tree_03 {

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

    public static void main(String[] args) {
        Node a = new Node(1);
        Node b = new Node(4);
        Node c = new Node(3);
        Node d = new Node(2);
        Node e = new Node(6);
        Node f = new Node(5);
        Node g = new Node(6);
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
    }
}
