package leetcode;

import java.util.HashMap;
import java.util.Map;

public class CopyListwithRandomPointer {


    public RandomListNode copyRandomList2(RandomListNode head) {
        if (head == null) {
            return null;
        }

        RandomListNode cur = head;
        Map<RandomListNode, RandomListNode> map = new HashMap<>();

        while(cur != null) {
            map.put(cur, new RandomListNode(cur.label));
            cur = cur.next;
        }
        cur = head;
        while(cur != null) {
            map.get(cur).next = map.get(cur.next);
            map.get(cur).random = map.get(cur.random);
            cur = cur.next;
        }
        return map.get(head);
    }

    public RandomListNode copyRandomList(RandomListNode head) {
        if (head == null) {
            return null;
        }
        RandomListNode cur = head;
        Map<RandomListNode, RandomListNode> map = new HashMap<>();
        RandomListNode copyHead = new RandomListNode(cur.label);
        RandomListNode ccur = copyHead;
        map.put(cur, copyHead);
        cur = cur.next;
        while (cur != null) {
            RandomListNode copy = new RandomListNode(cur.label);
            map.put(cur, copy);

            ccur.next = copy;
            cur = cur.next;
            ccur = ccur.next;
        }
        cur = head;
        ccur = copyHead;
        while (cur != null) {
            ccur.random = map.get(cur.random);
            cur = cur.next;
            ccur = ccur.next;
        }
        return copyHead;
    }


    class RandomListNode {
        int label;
        RandomListNode next, random;
        RandomListNode(int x) {
            this.label = x;
        }
    }
}
