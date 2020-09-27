import java.util.Arrays;

/**
 * 合并两个有序数组
 */
public class Merge {
    class Solution {
        public void merge(int[] nums1, int m, int[] nums2, int n) {
            System.arraycopy(nums2, 0, nums1, m, n);
            Arrays.sort(nums1);
        }
    }
}
