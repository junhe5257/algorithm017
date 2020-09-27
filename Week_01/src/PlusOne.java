import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PlusOne {
    class Solution {
        List<Integer> list = new ArrayList<>();
        boolean FLAG = true;
        public int[] plusOne(int[] digits) {
            for (int i = digits.length-1; i >= 0; i--) flag(digits[i]);
            if (FLAG) list.add(1);
            Collections.reverse(list);
            int[] result = new int[list.size()];
            for (int i = 0; i < list.size(); i++) result[i] = list.get(i);
            return result;
        }
        public void flag(int i) {
            if (FLAG) i++;
            if (i == 10) { i = 0; FLAG = true; }
            else FLAG = false;
            list.add(i);
        }
    }
}
