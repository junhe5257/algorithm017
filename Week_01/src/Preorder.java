import java.util.ArrayList;
import java.util.List;

public class Preorder {
    class Solution {
        List<Integer> result = new ArrayList<>();
        public List<Integer> preorder(Node root) {
            recursion(root);
            return result;
        }
        public void recursion(Node root) {
            if (null == root) return;
            result.add(root.val);
            for (int i = 0; i < root.children.size(); i++) {
                recursion(root.children.get(i));
            }
        }
    }

    class Node {
        public int val;
        public List<Node> children;

        public Node() {}

        public Node(int _val) {
            val = _val;
        }

        public Node(int _val, List<Node> _children) {
            val = _val;
            children = _children;
        }
    };
}
