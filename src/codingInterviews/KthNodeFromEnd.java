package codingInterviews;

import org.junit.Test;
import util.ListNode;
import util.ListNodeUtil;

public class KthNodeFromEnd {

    public ListNode FindKthToTail(ListNode head, int k) {
        if (head == null || k <= 0) {
            return null;
        }

        ListNode fastNode = head;
        ListNode slowNode = head;

        for (int i = 0; i < k-1; i++) {
            if (fastNode.next != null) {
                fastNode = fastNode.next;
            } else {
                return null;
            }
        }

        while (fastNode.next != null) {
            fastNode = fastNode.next;
            slowNode = slowNode.next;
        }

        return slowNode;
    }

    @Test
    public void test() {
        ListNode listNode = ListNodeUtil.initList(1,2,3,4,5);
        System.out.println(FindKthToTail(listNode, 6));
    }
}
