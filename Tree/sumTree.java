class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int val) {
        this.val = val;
    }
}

public class Main {
    public static void convertToSumTree(TreeNode root) {
        if (root == null) {
            return;
        }
        
        convertToSumTree(root.left);
        convertToSumTree(root.right);

    

        if (root.left != null) {
            root.val += root.left.val; 
        }
        if (root.right != null) {
            root.val += root.right.val; 

       
    }
        }

    public static void main(String[] args) {
        /*
         * Example binary tree:
         *       10
         *      / \
         *     3   7
         *    / \   \
         *   4   6   9
         */
        TreeNode root = new TreeNode(10);
        root.left = new TreeNode(3);
        root.right = new TreeNode(7);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(6);
        root.right.right = new TreeNode(9);

        System.out.println("Original Tree:");
        printTree(root);

        convertToSumTree(root);

        System.out.println("\nSum Tree:");
        printTree(root);
    }

    public static void printTree(TreeNode root) {
        if (root == null) {
            return;
        }

        System.out.print(root.val + " ");
        printTree(root.left);
        printTree(root.right);
    }
}
