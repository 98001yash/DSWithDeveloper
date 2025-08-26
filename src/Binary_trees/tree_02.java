package Binary_trees;


//    tp find the diameter of the binary trees
//public class tree_02 {
//
//    public static int max(int a , int b, int c){
//        return Math.max(a, Math.max(b,c));
//    }
//
//    public static int levels(Node root){
//        if(root==null) return 0;
//        return 1 + Math.max(levels(root.left),levels(root.right));
//    }
//
//    public static int diameterOfBinaryTree(Node root){
//        if(root==null) return 0;
//        int myDia = levels(root.left)  + levels(root.right);
//        int leftDia = diameterOfBinaryTree(root.left);
//        int rightDia = diameterOfBinaryTree(root.right);
//
//        return max(myDia, leftDia, rightDia);
//    }
//    public static void main(String[] args){
//
//    }
//}'

//import java.util.ArrayList;
//import java.util.List;
//
////  Binary tree Paths
//public class tree_02 {
//
//    public static void path(Node root, String s, List<String> ans){
//        if(root.left == null && root.right == null){
//            s += root.val;
//            ans.add(s);
//            return;
//
//        }
//        path(root.left, s+root.val+"->", ans);
//        path(root.right, s+root.val+"->", ans);
//    }
//
//    public static List<String> binaryTreePaths(Node root){
//        List<String> ans = new ArrayList<>();
//        path(root,"",ans);
//        return ans;
//    }
//
//    // Path sum leet code 113
//    public static boolean hasPathSum(Node root, int targetSum){
//        if(root == null) return false;
//        if(root!=null && root.left==null && root.right!=null){
//            if(root.val == targetSum) return true;
//        }
//        return hasPathSum(root.left , targetSum - root.val) || hasPathSum(root.right, targetSum=root.val);
//    }
//    public static void main(String[] args){
//
//    }
//}


public class tree_02 {

    public static boolean exists(Node root, Node node){
        if(node==root) return true;
        if(root == null) return false;
        return exists(root.left, node) || exists(root.right, node);

    }

    public static Node LowestCommonAncestor(Node root, Node p,  Node q){
        if(p==root  ||  q==root) return root;
        boolean pLiesInLST = exists(root.left,p);
        boolean qLiesInLST = exists(root.left, q);

//        if(pLiesInLST== true && qLiesInLST==false) return root;
//        if(pLiesInLST== false && qLiesInLST==true) return root;
        if(pLiesInLST== true && qLiesInLST==true) return LowestCommonAncestor(root.left, p, q);
        if(pLiesInLST== false && qLiesInLST==false) return LowestCommonAncestor(root.right, p, q);


           else return root;
    }
    public static void main(String[] args){

    }
}