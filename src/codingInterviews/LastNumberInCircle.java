package codingInterviews;

import org.junit.Test;

public class LastNumberInCircle {
    public int LastRemaining_Solution(int n, int m) {
        if (n < 0 || m < 1) {
            return -1;
        }
        int[] array = new int[n];
        int index = -1;
        int step = 0;
        int count = n;
        while (count > 0) {
            index++;
            // 从头开始计数
            if (index == n)
                index = 0;
            // 如果死了跳过
            if (array[index] == -1)
                continue;
            step++;
            if (step == m) {
                // -1表示杀死
                array[index] = -1;
                count--;
                step = 0;
            }
        }
        return index;
    }

    @Test
    public void test() {
        System.out.println(LastRemaining_Solution(5, 2));
    }
}
