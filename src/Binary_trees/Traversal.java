package Binary_trees;


class Node {
    int val;
    Node left;
    Node right;

    Node(int val){
        this.val = val;
    }
}
public class Traversal {

    public static void preorder(Node root){
        if(root == null) return;
        System.out.print(root.val+" ");
        preorder(root.left);
        preorder(root.right);
    }

    public static void inorder(Node root){
        if(root == null) return;
        inorder(root.left);
        System.out.print(root.val+" ");
        inorder(root.right);
    }

    public static void postorder(Node root){
        if(root == null) return;
        postorder(root.left);
        postorder(root.right);
        System.out.print(root.val+" ");
    }


    // to create the mirror image of the tree
    public static void revert(Node root){
        if(root == null) return;
        Node temp =root.left;
        root.left = root.right;
        root.right = temp;
        revert(root.left);
        revert(root.right);
    }


    //leetcode 100
    public static boolean isSameTree(Node p, Node q){

        if(p==null && q==null) return true;
        if(p==null && q!=null) return false;
        if(p!=null && q==null) return false;

        if(p.val!= q.val)  return false;
        if(!isSameTree(p.left, q.left)) return false;
        if(!isSameTree(p.right, q.right)) return false;
        return false;
    }


    // symmetric tree
    public static boolean isSymmetric(Node root){
        if(root == null) return true;
        revert(root.right);
        return isSameTree(root.left, root.right);
    }
    public static void main(String[] args){

        Node a = new Node(1);
        Node b = new Node(2);
        Node c = new Node(3);
        Node d = new Node(4);
        Node e = new Node(5);
        Node f = new Node(6);
        Node g = new Node(7);

        a.left = b; a.right = c;
        b.left = d; b.right = e;
        c.left = f; c.right = g;
        preorder(a);
        System.out.println();
        inorder(a);
        System.out.println();
        postorder(a);

    }
}
