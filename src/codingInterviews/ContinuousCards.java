package codingInterviews;

import org.junit.Test;

import java.util.Arrays;

public class ContinuousCards {
    public boolean isContinuous(int [] numbers) {
        if (numbers == null || numbers.length != 5) {
            return false;
        }

        Arrays.sort(numbers);
        int countZero = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == 0) {
                countZero++;
            }
        }

        int firstNonZero = 0;
        for (int i =0; numbers[i]==0; i++) {
            firstNonZero++;
        }
        int small = firstNonZero;
        int big = small + 1;
        int gap = 0;
        while (big < numbers.length) {
            if (numbers[small] == numbers[big]) {
                return false;
            }
            gap += numbers[big] - numbers[small] - 1;
            small = big;
            big++;
        }
        return gap <= countZero ? true : false;
    }

    @Test
    public void test() {
        System.out.println(isContinuous(new int[]{0,2,0,4,5}));
    }
}
