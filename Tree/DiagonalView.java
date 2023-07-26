import java.util.*;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int val) {
        this.val = val;
    }
}

public class DiagonalViewBinaryTree {
    public static List<List<Integer>> diagonalView(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        if (root == null) {
            return result;
        }

        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        while (!queue.isEmpty()) {
            int levelSize = queue.size();
            List<Integer> currentDiagonal = new ArrayList<>();

            for (int i = 0; i < levelSize; i++) {
                TreeNode node = queue.poll();

                while (node != null) {
                    currentDiagonal.add(node.val);

                    if (node.left != null) {
                        queue.offer(node.left);
                    }

                    node = node.right;
                }
            }

            result.add(currentDiagonal);
        }

        return result;
    }

    public static void main(String[] args) {
        
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.right.right = new TreeNode(6);

        List<List<Integer>> diagonalResult = diagonalView(root);
        for (List<Integer> diagonal : diagonalResult) {
            System.out.println(diagonal);
        }
    }
}
