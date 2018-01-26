package codingInterviews;

import org.junit.Test;
import util.ListNode;
import util.ListNodeUtil;

public class MergeSortedLists {
    public ListNode merge(ListNode list1, ListNode list2) {
        if (list1 == null) {
            return list2;
        } else if (list2 == null) {
            return list1;
        }
        ListNode mergedListNode;
        if (list1.val < list2.val) {
            mergedListNode = list1;
            mergedListNode.next = merge(list1.next, list2);
        } else {
            mergedListNode = list2;
            mergedListNode.next = merge(list1, list2.next);
        }
        return mergedListNode;
    }

    @Test
    public void test() {
        System.out.println(merge(ListNodeUtil.initList(1), ListNodeUtil.initList(2,4,6)));
    }
}
