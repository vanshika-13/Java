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

public class TopViewBinaryTree {
    public static List<Integer> topView(TreeNode root) {
        List<Integer> topViewList = new ArrayList<>();
        if (root == null) {
            return topViewList;
        }

        Map<Integer, Integer> topViewMap = new TreeMap<>();
        Queue<QueueNode> queue = new LinkedList<>();
        queue.add(new QueueNode(root, 0));

        while (!queue.isEmpty()) {
            QueueNode curr = queue.poll();
            TreeNode node = curr.node;
            int hd = curr.hd;

            if (!topViewMap.containsKey(hd)) {
                topViewMap.put(hd, node.val);
            }

            if (node.left != null) {
                queue.add(new QueueNode(node.left, hd - 1));
            }

            if (node.right != null) {
                queue.add(new QueueNode(node.right, hd + 1));
            }
        }

        topViewList.addAll(topViewMap.values());
        return topViewList;
    }

    public static void main(String[] args) {
        
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.right = new TreeNode(4);
        root.right.right = new TreeNode(5);

        List<Integer> topViewResult = topView(root);
        System.out.println(topViewResult); // Output: [2, 1, 3, 5]
    }
}
