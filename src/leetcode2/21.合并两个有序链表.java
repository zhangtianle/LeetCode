/*
 * @lc app=leetcode.cn id=21 lang=java
 *
 * [21] 合并两个有序链表
 */

// @lc code=start
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if(list1 == null) {
            return list2;
        }
        if (list2 == null) {
            return list1;
        }
        ListNode head = list1;
        ListNode cur = list1;
        ListNode cur2 = list2;
        while (cur != null && cur.next != null) {
            while (cur2 != null && cur.val >= cur2.val) {
                ListNode tmp = cur.next;
                ListNode add = new ListNode(cur2.val, tmp);
                cur.next = add;
                cur2 = cur2.next;
            }
            cur = cur.next;
        }
        return head;
    }
}
// @lc code=end

