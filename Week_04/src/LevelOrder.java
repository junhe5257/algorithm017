import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.stream.IntStream;

/**
 * 二叉树的层序遍历
 */
public class LevelOrder {
    class Solution {
        public List<List<Integer>> levelOrder(TreeNode root) {
            List<List<Integer>> res = new ArrayList<>();
            if (null == root) return res;
            Queue<TreeNode> queue = new LinkedList<>();
            queue.offer(root);
            while (!queue.isEmpty()) {
                int size = queue.size();
                List<Integer> tmp = new ArrayList<>();
                IntStream.range(0, size).mapToObj(i -> queue.poll()).forEach(node -> {
                    tmp.add(node.val);
                    if (null != node.left) queue.offer(node.left);
                    if (null != node.right) queue.offer(node.right);
                });
                res.add(tmp);
            }
            return res;
        }
    }


     public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }
}
