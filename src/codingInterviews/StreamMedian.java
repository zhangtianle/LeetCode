package codingInterviews;

import org.junit.Test;

import java.util.PriorityQueue;

public class StreamMedian {
    int order = 0;
    PriorityQueue<Integer> min = new PriorityQueue();
    PriorityQueue<Integer> max = new PriorityQueue<>(((o1, o2) -> o2 - o1));

    public void Insert(Integer num) {
        order++;
        if (order % 2 == 1) {
            // 插入最小堆
            if (!max.isEmpty()) {
                max.offer(num);
                num = max.poll();
            }
            min.offer(num);

        } else {
            // 插入最大堆， 先加入最小堆，然后从最小堆里面拿到最小的
            if (!min.isEmpty()) {
                min.offer(num);
                num = min.poll();
            }
            max.offer(num);
        }

    }

    public Double GetMedian() {
        if (order % 2 == 0) return (min.peek() + max.peek()) / 2.0;
        else return (double) min.peek();
    }

    @Test
    public void test() {
        PriorityQueue<Integer> min2 = new PriorityQueue();
        min2.add(1);
        min2.add(4);
        min2.add(2);
        min2.add(8);
        System.out.println(min2.peek());
    }
}
