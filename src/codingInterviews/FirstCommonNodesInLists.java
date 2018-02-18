package codingInterviews;

import util.ListNode;

public class FirstCommonNodesInLists {
    public ListNode FindFirstCommonNode(ListNode pHead1, ListNode pHead2) {
        int len1 = listLength(pHead1);
        int len2 = listLength(pHead2);
        int diff = 0;
        if (len1 > len2) {
            diff = len1 - len2;
            while (diff > 0) {
                pHead1 = pHead1.next;
                diff--;
            }
        } else {
            diff = len2 - len1;
            while (diff > 0) {
                pHead2 = pHead2.next;
                diff--;
            }
        }

        while (pHead1 != null && pHead2 != null && pHead1 != pHead2) {
            pHead1 = pHead1.next;
            pHead2 = pHead2.next;
        }

        return pHead1;
    }

    private int listLength(ListNode listNode) {
        int length = 0;
        ListNode head = listNode;
        while (head != null) {
            head = head.next;
            length++;
        }
        return length;
    }
}
