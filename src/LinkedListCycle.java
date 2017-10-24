import util.ListNode;

/**
 * Created by Kyle on 2017/10/24.
 */
public class LinkedListCycle {

    /**
     * Definition for singly-linked list.
     * class ListNode {
     *     int val;
     *     ListNode next;
     *     ListNode(int x) {
     *         val = x;
     *         next = null;
     *     }
     * }
     */

    public boolean hasCycle(ListNode head) {
        boolean cyceled = true;
        ListNode fast = head;
        ListNode slow = head;
        if (head != null) {
            if (head.next != null) {
                fast = fast.next.next;
                slow = slow.next;
            }
        } else {
            return false;
        }

        while (true) {
            if (fast == null ||  fast.next == null) {
                return false;
            } else if (fast == slow || fast.next == slow) {
                return true;
            } else {
                fast = fast.next.next;
                slow = slow.next;
            }
        }
    }
}
