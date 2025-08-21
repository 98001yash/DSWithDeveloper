package Binary_trees;


public class Tree_01 {

    // to display the binary tree
    public static void display(Node root){
        //base case
        if(root ==null) return;
        System.out.print(root.val+" ");
        display(root.left);
        display(root.right);
    }

    // to find the sum of trees
    public static int nodeSum(Node root){
        if(root ==null) return 0;
       int x =  nodeSum(root.left);
        int y = nodeSum(root.right);

       return root.val + x+ y;
    }


    // to find the product of the tree
    public static int product(Node root) {
        if (root == null) return 1;
      int x =   product(root.left);
      int y =   product(root.right);

        return root.val * x * y;

    }


    // to find the product of the non-zero node
    public static int productNoZero(Node root){
        if(root ==null) return 1;

      int left =   product(root.left);
     int right =    product(root.right);

     if(root.val == 0){
         return left * right;
     }
     return root.val* left * right;
    }


    // to find the max value of the node of the tree
    public static int findMax(Node root){
        if(root ==null) return Integer.MIN_VALUE;
        int x = findMax(root.left);
        int y = findMax(root.right);
        int z = Math.max(x,y);
        return Math.max(root.val, z);
    }


    // to find the size of the tree
    public static int size(Node root){
        if(root ==null) return 0;
        return 1 + size(root.left) + size(root.right);
    }


    // to find the level of the tree
    public static int level(Node root){
        if(root == null) return 0;
        int x = level(root.left);
        int y = level(root.right);
        int z = Math.max(x,y);
        return 1 +z;
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
        System.out.println(findMax(a));

        System.out.println(level(a));
    }
}
