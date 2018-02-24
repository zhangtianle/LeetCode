package codingInterviews;

import org.junit.Test;

public class ArrayConstruction {
    public int[] multiply(int[] A) {
        if (A == null || A.length == 0) {
            return null;
        }
        int[] ret = new int[A.length];
        ret[0] = 1;
        for (int i = 1; i < A.length; i++) {
            ret[i] = ret[i - 1] * A[i - 1];
        }
        int temp = 1;
        for (int i = A.length - 2; i >= 0; i--) {
            temp *= A[i + 1];
            ret[i] *= temp;
        }
        return ret;
    }

    @Test
    public void test() {
        multiply(new int[]{1,2,3,4,5});
    }
}
