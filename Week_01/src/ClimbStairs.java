/**
 * 爬楼梯-动态规划
 */
public class ClimbStairs {
    class Solution {
        public int climbStairs(int n) {
            if (0 == n || 1 == n) return 1;
            int[] array = new int[n+1];
            array[0] = 1;
            array[1] = 1;
            for (int i = 2; i <= n; i++) {
                array[i] = array[i-1] + array[i-2];
            }
            return array[n];
        }
    }
}
