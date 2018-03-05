package codingInterviews;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;

public class MaxInSlidingWindow {

    public ArrayList<Integer> maxInWindows(int[] num, int size) {
        ArrayList<Integer> list = new ArrayList<>();
        if (num == null || num.length == 0 || num.length < size || size < 1) {
            return list;
        }

        Deque<Integer> deque = new LinkedList();
        for (int i = 0; i < size; i++) {
            while (!deque.isEmpty() && num[i] >= num[deque.peekLast()])
                deque.pollLast();
            deque.offer(i);
        }
        list.add(num[deque.peekFirst()]);
        for (int i = size; i < num.length; i++) {
            while (!deque.isEmpty() && num[i] >= num[deque.peekLast()])
                deque.pollLast();
            if (!deque.isEmpty() && (i - deque.peekFirst()) >= size)
                deque.pollFirst();
            deque.offer(i);
            list.add(num[deque.peekFirst()]);
        }

        return list;
    }

    @Test
    public void test() {
        System.out.println(maxInWindows(new int[]{2,3,4,2,6,2,5,1}, 4));
    }
}
