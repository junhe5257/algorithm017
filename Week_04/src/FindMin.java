/**
 * 寻找旋转排序数组中的最小值
 */
public class FindMin {
    class Solution {
        public int findMin(int[] nums) {
            for (int i = 0; i < nums.length; i++) {
                if (i >= 1 && nums[i] < nums[i-1]) return nums[i];
            }
            return nums[0];
        }
        //并没有用到二分查找，是因为考虑到查找最小值不适合二分查找
        //采用遍历的方法找到旋转点，因为原数组旋转前是有序的，那么旋转点就是最小值
        //时间复杂度最小为O(1)，最差为O(n)
    }
}
