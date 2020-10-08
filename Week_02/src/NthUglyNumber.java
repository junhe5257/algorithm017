import java.util.PriorityQueue;

/**
 * 丑数
 */
public class NthUglyNumber {
    class Solution {
        long[] uglyArray = {2L, 3L, 5L};
        int count = 0;
        public int nthUglyNumber(int n) {
            PriorityQueue<Long> pq = new PriorityQueue<>();
            pq.offer(1L);
            while (!pq.isEmpty()) {
                Long top = pq.poll();
                if (++count >= n) {
                    return top.intValue();
                }
                for (long num : uglyArray) {
                    if (!pq.contains(num * top)) {
                        pq.offer(num * top);
                    }
                }
            }
            return -1;
        }
    }
}
