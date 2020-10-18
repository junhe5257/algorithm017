import java.util.ArrayList;
import java.util.List;

public class Combine {
    class Solution {
        public List<List<Integer>> combine(int n, int k) {
            List<List<Integer>> res = new ArrayList<>();
            if (n < k || k == 0) return res;
            res = combine(n - 1, k - 1);
            if (res.isEmpty()) res.add(new ArrayList<>());
            res.forEach(list -> list.add(n));
            res.addAll(combine(n - 1, k));
            return res;
        }
    }
}
