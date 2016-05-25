package MergeTwoSortedLists;


import org.junit.Test;
import util.ListNode;
import util.ListNodeUtil;

/**
 * Merge two sorted linked lists and return it as a new list. The new list should be made by splicing together the nodes of the first two lists.
 * <p>
 * Created by Tianle Zhang on 2016/5/25.
 */
public class Solution {

    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        // TODO
        ListNode head = new ListNode(0);
        ListNode current = head;
        while ( l1 != null &&l1.next != null ) {
            ListNode tl = l1.next;
            while ( l2 != null && l2.next != null) {
                if (l1.val < l2.val) {
                    current.next = new ListNode(l1.val);
                    current = current.next;
                    current.next = new ListNode(l2.val);
                    current = current.next;
                    l1 = l1.next;
                } else {
                    current.next = new ListNode(l2.val);
                    current = current.next;
                    current.next = new ListNode(l1.val);
                    current = current.next;
                    l2 = l2.next;
                }
            }
        }
        return head.next;
    }

    @Test
    public void test() {
        ListNode l1 = ListNodeUtil.initList(2,3,4);
        ListNode l2 = ListNodeUtil.initList(1,2,5);
        ListNode r = mergeTwoLists(l1,l2);
    }


}
