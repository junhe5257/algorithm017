import java.util.ArrayList;
import java.util.List;

/**
 * 二叉树的前序遍历
 */

public class PreorderTraversal {
    class Solution {
        List<Integer> res = new ArrayList<>();
        public List<Integer> preorderTraversal(MaxDepth.TreeNode root) {
            if (null == root) return res;
            res.add(root.val);
            preorderTraversal(root.left);
            preorderTraversal(root.right);
            return res;
        }
    }
}
