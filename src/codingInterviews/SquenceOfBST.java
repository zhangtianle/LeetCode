package codingInterviews;

import org.junit.Test;

import java.util.Arrays;

public class SquenceOfBST {
    public boolean verifySquenceOfBST(int[] sequence) {
        if (sequence == null || sequence.length == 0) {
            return false;
        }

        int len = sequence.length;
        int root = sequence[len - 1];

        int i = 0;
        for (; i < len - 1; i++) {
            if (sequence[i] > root) {
                break;
            }
        }

        int j = i;
        for (; j < len - 1; j++) {
            if (sequence[j] < root) {
                return false;
            }
        }

        boolean left = true;
        if (i > 0) {
            left = verifySquenceOfBST(Arrays.copyOfRange(sequence, 0, i));
        }

        boolean right = true;
        if (i < len - 1) {
            right = verifySquenceOfBST(Arrays.copyOfRange(sequence, i, len - 1));
        }
        return left & right;

    }

    @Test
    public void test() {
        System.out.println(verifySquenceOfBST(new int[]{5, 7, 6, 9, 11, 10, 8}));
    }
}
