package codingInterviews;

import org.junit.Test;

public class UglyNumber {
    public int GetUglyNumber_Solution(int index) {
        if (index <= 0) {
            return 0;
        }

        int[] uglyLists = new int[index];
        uglyLists[0] = 1;
        int uglyIndex = 0;

        int max2 = 0;
        int max3 = 0;
        int max5 = 0;

        while (uglyIndex < index - 1) {
            uglyIndex++;
            int min = Math.min(uglyLists[max2] * 2, uglyLists[max3] * 3);
            min = Math.min(min, uglyLists[max5] * 5);
            uglyLists[uglyIndex] = min;

            while (uglyLists[max2] * 2 <= min) {
                max2++;
            }
            while (uglyLists[max3] * 3 <= min) {
                max3++;
            }
            while (uglyLists[max5] * 5 <= min) {
                max5++;
            }
        }


        return uglyLists[index - 1];
    }

    @Test
    public void test() {
        System.out.println(GetUglyNumber_Solution(3));
    }
}
