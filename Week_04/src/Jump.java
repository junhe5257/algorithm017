/**
 * 跳跃游戏 II
 */
public class Jump {
    class Solution {
        public int jump(int[] nums) {
            int now = 0, next = 0, res = 0, len = nums.length - 1;
            for (int i = 0; i < len; i++) {
                next = Math.max(next, i + nums[i]);
                if (now >= len) break;
                if (now == i) {
                    now = next;
                    res ++;
                }
            }
            return res;
        }
        //典型的贪心算法，之前用while写了一版，每次在可跳跃区域中选择最大值进行跳跃
        //结果被测试用例[10,9,8,7,6,5,4,3,2,1,1,0]卡住了，充分证明了贪心的局部最优很难达成全局最优
    }
}
