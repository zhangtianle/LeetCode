package leetcode;

import util.ListNode;

public class ReverseLinkedList {
    public ListNode reverseList(ListNode head) {
        ListNode curNode = head;
        ListNode reversedHead = null;
        ListNode preNode = null;

        while (curNode != null) {
            ListNode nextNode = curNode.next;
            if (nextNode == null) {
                reversedHead = curNode;
            }
            curNode.next = preNode;
            preNode = curNode;
            curNode = nextNode;
        }
        return reversedHead;

    }
}
