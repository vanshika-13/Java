import java.util.*;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int val) {
        this.val = val;
    }
}

class QueueNode {
    TreeNode node;
    int hd;

    QueueNode(TreeNode node, int hd) {
        this.node = node;
        this.hd = hd;
    }
}

public class BottomViewBinaryTree {
    public static List<Integer> bottomView(TreeNode root) {
        List<Integer> bottomViewList = new ArrayList<>();
        if (root == null) {
            return bottomViewList;
        }

        Map<Integer, Integer> bottomViewMap = new TreeMap<>();
        Queue<QueueNode> queue = new LinkedList<>();
        queue.add(new QueueNode(root, 0));

        while (!queue.isEmpty()) {
            QueueNode curr = queue.poll();
            TreeNode node = curr.node;
            int hd = curr.hd;

            // Update the bottom view map with the current node value for the given horizontal distance
            bottomViewMap.put(hd, node.val);

            if (node.left != null) {
                queue.add(new QueueNode(node.left, hd - 1));
            }

            if (node.right != null) {
                queue.add(new QueueNode(node.right, hd + 1));
            }
        }

        bottomViewList.addAll(bottomViewMap.values());
        return bottomViewList;
    }

    public static void main(String[] args) {
        
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.right.right = new TreeNode(6);
        root.left.right.left = new TreeNode(7);
        root.right.right.left = new TreeNode(8);

        List<Integer> bottomViewResult = bottomView(root);
        System.out.println(bottomViewResult); // Output: [4, 7, 5, 8, 6]
    }
}
