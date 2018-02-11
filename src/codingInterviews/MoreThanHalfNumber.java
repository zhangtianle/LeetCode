package codingInterviews;

import org.junit.Test;

public class MoreThanHalfNumber {
    public int MoreThanHalfNum_Solution(int[] array) {
        if (array == null || array.length == 0) {
            return 0;
        }

        int result = array[0];
        int time = 1;

        for (int i = 1; i < array.length; i++) {
            if (time == 0) {
                result = array[i];
                time = 1;
            } else if (array[i] == result) {
                time++;
            } else {
                time--;
            }
        }

        int checkTime = 0;
        for (int i = 0; i < array.length; i++) {
            if (result == array[i]) {
                checkTime++;
            }
        }
        if (checkTime <= array.length >> 1) {
            result = 0;
        }
        return result;
    }

    @Test
    public void test() {
        MoreThanHalfNum_Solution(new int[]{1,2,2,2,1,2});
    }
}
