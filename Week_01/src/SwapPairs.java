public class SwapPairs {
    class Solution {
        public ListNode swapPairs(ListNode head) {
            if (null == head || null == head.next) return head;
            ListNode first = head;
            ListNode sec = head.next;

            first.next = swapPairs(sec.next);
            sec.next = first;

            return sec;
        }
    }

    public class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }
}
