package leetcode;

import util.ListNode;

import java.util.Stack;

public class PalindromeLinkedList {
    public boolean isPalindrome(ListNode head) {
        if (head == null) {
            return true;
        }
        Stack<Integer> s = new Stack<Integer>();
        ListNode node = head;
        while(node != null) {
            int val = node.val;
            s.push(val);
            node = node.next;
        }
        while(!s.isEmpty()) {
            if (s.pop() != head.val) {
                return false;
            }
            head = head.next;
        }
        return true;
    }
}
