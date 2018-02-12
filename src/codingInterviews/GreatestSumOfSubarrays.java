package codingInterviews;

import org.junit.Test;

public class GreatestSumOfSubarrays {
    public int FindGreatestSumOfSubArray(int[] array) {
        if (array == null) {
            return 0;
        }

        int max = Integer.MIN_VALUE;
        int curSum = 0;

        for (int i = 0; i < array.length; i++) {
            if (curSum < 0) {
                curSum = array[i];
            } else {
                curSum += array[i];
            }
            if (curSum > max) {
                max = curSum;
            }
        }
        return max;
    }

    @Test
    public void test() {
        System.out.println(FindGreatestSumOfSubArray(new int[]{6,-3,-2,7,-15,1,2,2}));
    }
}
