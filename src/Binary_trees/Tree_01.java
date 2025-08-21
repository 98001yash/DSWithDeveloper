package Binary_trees;


class Node{
    int val;
    Node left;
    Node right;

    Node(int val){
        this.val  =val;
    }
}
public class Tree_01 {

    public static void display(Node root){
        //base case
        if(root ==null) return;
        System.out.print(root.val+" ");
        display(root.left);
        display(root.right);
    }

    public static int nodeSum(Node root){
        if(root ==null) return 0;
       int x =  nodeSum(root.left);
        int y = nodeSum(root.right);

       return root.val + x+ y;
    }

    public static int product(Node root) {
        if (root == null) return 1;
      int x =   product(root.left);
      int y =   product(root.right);

        return root.val * x * y;

    }

    public static int productNoZero(Node root){
        if(root ==null) return 1;

      int left =   product(root.left);
     int right =    product(root.right);

     if(root.val == 0){
         return left * right;
     }
     return root.val* left * right;


    }


    public static void main(String[] args){
        Node a   = new Node(1); //a is the root
        Node b   = new Node(4);
        Node c   = new Node(3);
        Node d   = new Node(2);
        Node e   = new Node(6);
        Node f   = new Node(5);

        a.left = b; a.right = c;
        b.left = d; b.right = e;
        c.right = f;

       //  display(a);
        System.out.println();
        System.out.println(nodeSum(a));

        System.out.println(product(a));
        System.out.println(productNoZero(a));
    }
}
