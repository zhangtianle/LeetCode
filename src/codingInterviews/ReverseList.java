package codingInterviews;

import org.junit.Test;
import util.ListNode;
import util.ListNodeUtil;

public class ReverseList {
    public ListNode reverseList(ListNode head) {
        if (head == null) {
            return null;
        }

        ListNode pReversedNode = null;
        ListNode pNode = head;
        ListNode pPre = null;

        while (pNode != null) {
            ListNode pNext = pNode.next;

            if (pNext == null) {
                pReversedNode = pNode;
            }

            pNode.next = pPre;
            pPre = pNode;
            pNode = pNext;

        }

        return pReversedNode;
    }

    @Test
    public void test() {
        reverseList(ListNodeUtil.initList(1,2,3,4));
    }
}
