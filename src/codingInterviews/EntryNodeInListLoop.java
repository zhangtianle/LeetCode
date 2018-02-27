package codingInterviews;

import util.ListNode;

public class EntryNodeInListLoop {
    public ListNode EntryNodeOfLoop(ListNode pHead) {
        if (pHead == null || pHead.next == null) {
            return null;
        }

        ListNode slow = pHead;
        ListNode fast = pHead.next;

        while (slow != null && fast != null) {
            if (slow == fast) {
                break;
            }
            slow = slow.next;
            if (fast.next != null) {
                fast = fast.next.next;
            }
        }

        int loopLength = 1;
        ListNode nodeInList = slow;
        nodeInList = nodeInList.next;
        while (nodeInList != slow) {
            nodeInList = nodeInList.next;
            loopLength++;
        }

        ListNode node = pHead;
        while (loopLength != 0) {
            node = node.next;
            loopLength--;
        }

        while (node != pHead) {
            node = node.next;
            pHead = pHead.next;
        }

        return pHead;
    }
}
