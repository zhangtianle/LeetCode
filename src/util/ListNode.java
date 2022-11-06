package util;

/**
 * Created by Tianle Zhang on 2016/5/25.
 */
public class ListNode {
    public int val;
    public ListNode next;
    public ListNode() {}
    public ListNode(int x) {
        val = x;
    }
    public ListNode(int val, ListNode next) { this.val = val; this.next = next; }

    @Override
    public String toString() {
        String s = "";
        ListNode current = this;
        while ( current != null ) {
            s = s + " " + current.val;
            current = current.next;
        }
        return s;
    }
}
