import org.junit.Test;
import util.ListNode;
import util.ListNodeUtil;

/**
 * Given a sorted linked list, delete all duplicates such that each element appear only once.
 * <p>
 * For example,
 * Given 1->1->2, return 1->2.
 * Given 1->1->2->3->3, return 1->2->3.
 * <p>
 * Created by Tianle Zhang on 2016/10/8.
 */
public class RemoveDuplicatesFromSortedList {
    public ListNode deleteDuplicates(ListNode head) {
        if (head == null) {
            return null;
        }
        ListNode cur = head;
        while (cur.next != null) {
            if (cur.val == cur.next.val) {
                cur.next = cur.next.next;
            } else {
                cur = cur.next;
            }
        }
        return head;
    }

    @Test
    public void test() {
        ListNode listNode = deleteDuplicates(ListNodeUtil.initList(1, 1, 2, 2,2));
        System.out.println(listNode);
    }
}
