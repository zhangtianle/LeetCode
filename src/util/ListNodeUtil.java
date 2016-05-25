package util;

import org.junit.Test;

/**
 * Created by Tianle Zhang on 2016/5/25.
 */
public class ListNodeUtil {
    public static ListNode initList (int...vals){
        ListNode head = new ListNode(0);
        ListNode current = head;
        for(int val : vals){
            current.next = new ListNode(val);
            current = current.next;
        }
        return head.next;
    }

    @Test
    public void test() {
        ListNode l = initList(1,2,3);
        System.out.println(l);
    }
}
