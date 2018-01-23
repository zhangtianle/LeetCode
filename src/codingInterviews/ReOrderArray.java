package codingInterviews;

import org.junit.Test;

public class ReOrderArray {
    public void reOrderArray(int[] array) {
        int len = array.length;
        int first = 0;
        int last = len - 1;

        while (first < last) {
            while (first < last && !even(array[first])) {
                first++;
            }
            while (first < last && even(array[last])) {
                last--;
            }
            int temp = array[first];
            array[first] = array[last];
            array[last] = temp;
        }
    }

    public void reOrderArray2(int[] array) {
        int len = array.length;
        int[] odd = new int[len];
        int[] even = new int[len];

        int oddIndex = 0;
        int evenIndex = 0;
        for (int i = 0; i < len; i++) {
            if (even(array[i])) {
                even[evenIndex++] = array[i];
            } else {
                odd[oddIndex++] = array[i];
            }
        }

        for (int i = 0; i < oddIndex; i++) {
            array[i] = odd[i];
        }
        for (int i = oddIndex; i < len; i++) {
            array[i] = even[i-oddIndex];
        }
    }

    private boolean even(int n) {
        return (n & 1) == 0;
    }

    @Test
    public void test() {
        reOrderArray2(new int[]{1, 2, 3, 4, 5});

    }
}
