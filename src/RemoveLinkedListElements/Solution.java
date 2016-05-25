package RemoveLinkedListElements;

import org.junit.Test;
import util.ListNode;
import util.ListNodeUtil;

/**
 * Remove all elements from a linked list of integers that have value val.
 * Example
 * Given: 1 --> 2 --> 6 --> 3 --> 4 --> 5 --> 6, val = 6
 * Return: 1 --> 2 --> 3 --> 4 --> 5
 * <p>
 * Created by Tianle Zhang on 2016/5/25.
 */
public class Solution {
    public ListNode removeElements(ListNode head, int val) {
        ListNode pre = new ListNode(0);
        pre.next = head;
        ListNode current = pre;

        while (current.next != null) {
            if (current.next.val == val) {
                current.next = current.next.next;
            } else {
                current = current.next;
            }

        }

        return pre.next;
    }

    @Test
    public void test() {
        System.out.println(removeElements(ListNodeUtil.initList(), 5));
    }
}
