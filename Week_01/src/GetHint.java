public class GetHint {
    class Solution {
        int A, B = 0;
        public String getHint(String secret, String guess) {
            int[] arrayS = new int[10];
            int[] arrayG = new int[10];
            for (int i = 0; i < secret.length(); i++) {
                arrayS[(int) secret.charAt(i)] += 1;
                arrayG[(int) guess.charAt(i)] += 1;
                if (guess.charAt(i) == secret.charAt(i)) {
                    A++;
                }
            }
            for (int i = 0; i < 10; i++) {
                B += Math.min(arrayS[i], arrayG[i]);
            }
            return A + "A" + B + "B";
        }
    }
}
