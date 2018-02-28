package codingInterviews;

import org.junit.Test;
import util.ListNode;
import util.ListNodeUtil;

public class DeleteDuplicatedListNode {
    public ListNode deleteDuplication(ListNode pHead) {
        if (pHead == null) {
            return null;
        }
        ListNode pNode = new ListNode(-1);
        pNode.next = pHead;

        ListNode preNode = pHead;
        ListNode nextNode = pNode;

        while (preNode!=null && preNode.next != null) {
            if (preNode.val == preNode.next.val) {
                int val = preNode.val;
                while (preNode!=null && preNode.val == val) {
                    preNode = preNode.next;
                }
                nextNode.next = preNode;
            } else {
                nextNode = preNode;
                preNode = preNode.next;
            }
        }

        return pNode.next;
    }

    @Test
    public void test() {
        deleteDuplication(ListNodeUtil.initList(1,2,3,3,4));
    }
}
