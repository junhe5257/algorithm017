import java.util.stream.IntStream;

/**
 * 有效的字母异位词
 */
public class IsAnagram {
    class Solution {
        public boolean isAnagram(String s, String t) {
            if (s.length() != t.length()) return false;
            int[] cArray = new int[26];
            IntStream.range(0, s.length()).forEach(i -> {
                cArray[s.charAt(i) - 'a'] += 1;
                cArray[t.charAt(i) - 'a'] -= 1;
            });
            for (int i : cArray) if (i != 0) return false;
            return true;
        }
    }
}
