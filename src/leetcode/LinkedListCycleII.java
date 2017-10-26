package leetcode;

import util.ListNode;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by Kyle on 2017/10/24.
 */
public class LinkedListCycleII {
    public ListNode detectCycle(ListNode head) {
        Set<ListNode> set = new HashSet<>();
        if (head == null) {
            return null;
        }

        set.add(head);

        while (head.next != null) {
            head = head.next;
            if (!set.contains(head)) {
                set.add(head);
            } else {
                return head;
            }
        }
        return null;
    }

    public ListNode detectCycle2(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;

        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;

            if (fast == slow) {
                ListNode slow2 = head;
                while (slow != slow2) {
                    slow = slow.next;
                    slow2 = slow2.next;
                }
                return slow;
            }
        }
        return null;
    }
}















