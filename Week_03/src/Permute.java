import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Permute {
    class Solution {
        List<List<Integer>> res = new ArrayList<>();
        public List<List<Integer>> permute(int[] nums) {
            process(nums,0);
            return res;
        }

        private void process(int[] nums, int start) {
            if (start == nums.length) {
                List<Integer>list = Arrays.stream(nums).boxed().collect(Collectors.toList());
                res.add(list);
            }
            IntStream.range(start, nums.length).forEach(i -> {
                swap(nums, i, start);
                process(nums, start + 1);
                swap(nums, i, start);
            });
        }

        private void swap(int[] nums, int index1, int index2){
            int tmp = nums[index1];
            nums[index1] = nums[index2];
            nums[index2] = tmp;
        }
    }
}
