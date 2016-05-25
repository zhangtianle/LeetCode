package SwapNodesinPairs;

import org.junit.Test;
import util.ListNode;
import util.ListNodeUtil;

/**
 * Given a linked list, swap every two adjacent nodes and return its head.
 * <p>
 * For example,
 * Given 1->2->3->4, you should return the list as 2->1->4->3.
 * <p>
 * Your algorithm should use only constant space. You may not modify the values in the list, only nodes itself can be changed.
 * <p>
 * Created by Tianle Zhang on 2016/5/25.
 */
public class Solution {
    public ListNode swapPairs(ListNode head) {
        ListNode ini = new ListNode(0);
        ini.next = head;
        ListNode current = ini;
        while (current.next != null && current.next.next != null) {
            ListNode second = current.next.next;
            ListNode first = current.next;
            first.next = second.next;
            current.next = second;
            current.next.next = first;
            current = current.next.next;
        }
        return ini.next;
    }

    @Test
    public void test() {
        System.out.println(swapPairs(ListNodeUtil.initList(1,2,3,4)));
    }
}
