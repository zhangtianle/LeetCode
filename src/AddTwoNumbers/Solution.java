package AddTwoNumbers;

import org.junit.Test;

/*
You are given two linked lists representing two non-negative numbers. The digits are stored in reverse order and each of their nodes contain a single digit. Add the two numbers and return it as a linked list.

Input: (2 -> 4 -> 3) + (5 -> 6 -> 4)
Output: 7 -> 0 -> 8

Subscribe to see which companies asked this question

Created by Tianle Zhang on 2016/4/22.
*/
public class Solution {



    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        ListNode head = new ListNode(0);
        ListNode current = head;
        int carry = 0;
        while (l1 != null && l2 != null) {
            int i = carry + l1.val + l2.val;
            current.next = new ListNode(i % 10);
            current = current.next;
            carry = i / 10;
            l1 = l1.next;
            l2 = l2.next;
        }

        while (l2 != null) {
            int i = carry + l2.val;
            current.next = new ListNode(i % 10);
            current = current.next;
            carry = i / 10;
            l2 = l2.next;
        }

        while (l1 != null) {
            int i = carry + l1.val;
            current.next = new ListNode(i % 10);
            current = current.next;
            carry = i / 10;
            l1 = l1.next;
        }

        if (carry != 0 ) {
            current.next = new ListNode(carry);
        }
        return head.next;
    }

    @Test
    public void test() {
        ListNode l1 = new ListNode(1);
        ListNode l12 = new ListNode(8);
        ListNode l13 = new ListNode(3);
        l1.next = l12;
        l12.next = l13;

        ListNode l2 = new ListNode(0);
        ListNode l22 = new ListNode(6);
        ListNode l23 = new ListNode(4);
        l2.next = l22;
        l22.next = l23;

        ListNode l = addTwoNumbers(l1,l2);
        System.out.println(l.val);
        System.out.println(l.next.val);
        System.out.println(l.next.next.val);

    }

    class ListNode {
        int val;
        ListNode next;
        ListNode(int x) {
            val = x;
        }
    }
}

