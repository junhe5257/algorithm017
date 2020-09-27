public class MaxArea {
    class Solution {
        public int maxArea(int[] height) {
            if (height.length == 0) return 0;
            int i = 0, j = height.length-1, area = 0;
            while (i != j) {
                int vArea = Math.min(height[i], height[j]) * (j- i);
                if (vArea > area) {
                    area = vArea;
                }
                if (height[i] < height[j]) {
                    i++;
                } else {
                    j--;
                }
            }
            return area;
        }
    }
}
