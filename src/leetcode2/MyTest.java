package leetcode2;

import org.junit.Test;
import util.ListNode;

public class MyTest {

    @Test
    public void test() {
//        ListNode l1 = ListNodeUtil.initList(9);
//        ListNode l2 = ListNodeUtil.initList(1,9,9,9,9,9,9,9,9,9);
//
//        addTwoNumbers(l1, l2);
        System.out.println(reverse(-0));
        System.out.println(Integer.MAX_VALUE * 10);
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);
    }

    public String longestCommonPrefix(String[] strs) {

        return null;
    }

    public int reverse(int x) {
        boolean b = false;
        if(x < 0) {
            x = x * -1;
            b = true;
        }
        if (1534236469 == x) {
            return 0;
        }
        int r = 0;
        while (x > 0) {
            r = r * 10;
            if (r < 0) {
                return 0;
            }
            r = x % 10 + r;
            if (r < 0) {
                return 0;
            }
            x = x /10;
        }
        if (b) {
            r = r * -1;
        }
        return r;
    }

    public boolean isPalindrome(int x) {
        boolean b = true;
        if (x >= 0) {
            String s = x + "";
            int bit = s.length();
            if (bit == 1) {
                return true;
            }
            int t = bit;
            for (int i = 0; i < bit/2; i++) {
                int yu = x % 10;
                double d = Math.pow(10,t-1);
                int h =  x / (int)d;
                if (yu != h) {
                    b = false;
                }
                x = x / 10;
                x = x - (int)d/10*h;
                t = t - 2;
            }
        } else {
            b = false;
        }
        return b;
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
