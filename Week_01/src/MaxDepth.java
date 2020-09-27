public class MaxDepth {
    class Solution {
        public int maxDepth(TreeNode root) {
            if (null == root) return 0;
            int leftDep = maxDepth(root.left);
            int rightDep = maxDepth(root.right);
            return Math.max(leftDep, rightDep) + 1;
        }
    }

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
     TreeNode(int x) { val = x; }
    }
}
