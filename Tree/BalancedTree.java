import java.util.*;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int val) {
        this.val = val;
    }
}

class Main {
    public static int isBalanced(TreeNode root){
        if(root == null) return 0;
        
        int leftheight = isBalanced(root.left);
        if(leftheight == -1) return -1;
        int rightheight = isBalanced(root.right);
        if(rightheight == -1) return -1;
        if(Math.abs(leftheight - rightheight) > 1) return -1;
         else return Math.max(leftheight,rightheight) +1;
    }

    public static void main(String[] args) {
        
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.right.right = new TreeNode(6);

        if(isBalanced(root) > 0)
        System.out.println("balanced");
        else
        System.out.println("not balanced");
    }
}
