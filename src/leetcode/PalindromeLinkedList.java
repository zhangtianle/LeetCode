package leetcode;

import org.junit.Test;
import util.ListNode;
import util.ListNodeUtil;

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

    public boolean isPalindrome2(ListNode head) {
        if (head == null) {
            return true;
        }

        ListNode slow = head;
        ListNode fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        if (fast != null) { // odd nodes: let right half smaller
            slow = slow.next;
        }

        ListNode reversedHead = null;
        ListNode curNode = slow;
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

        while (reversedHead != null) {
            if (reversedHead.val != head.val) {
                return false;
            }
            reversedHead = reversedHead.next;
            head = head.next;
        }
        return true;
    }



    public boolean isPalindrome3(ListNode head) {
        ListNode fast = head, slow = head;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }
        if (fast != null) { // odd nodes: let right half smaller
            slow = slow.next;
        }
        slow = reverse(slow);
        fast = head;

        while (slow != null) {
            if (fast.val != slow.val) {
                return false;
            }
            fast = fast.next;
            slow = slow.next;
        }
        return true;
    }

    public ListNode reverse(ListNode head) {
        ListNode prev = null;
        while (head != null) {
            ListNode next = head.next;
            head.next = prev;
            prev = head;
            head = next;
        }
        return prev;
    }

    @Test
    public void test() {
        System.out.println(isPalindrome2(ListNodeUtil.initList(1,2)));
    }
}
