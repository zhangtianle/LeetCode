package leetcode2;

import org.junit.Test;
import util.ListNode;
import util.ListNodeUtil;

public class MyTest {

    @Test
    public void test() {
        ListNode l1 = ListNodeUtil.initList(9);
        ListNode l2 = ListNodeUtil.initList(1,9,9,9,9,9,9,9,9,9);

        addTwoNumbers(l1, l2);
    }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int carry = 0;
        ListNode pre = new ListNode(0);
        ListNode cur = pre;
        while (l1 != null || l2 != null) {
            int x = l1 == null ? 0 : l1.val;
            int y = l2 == null ? 0 : l2.val;

            int sum = x + y + carry;
            carry = sum / 10;
            sum = sum % 10;

            cur.next = new ListNode(sum);

            cur = cur.next;
            if (l1 != null) {
                l1 = l1.next;
            }
            if (l2 != null) {
                l2 = l2.next;
            }
        }
        if (carry == 1) {
            cur.next = new ListNode(1);
        }
        return pre.next;
    }
}
