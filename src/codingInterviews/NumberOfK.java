package codingInterviews;

import org.junit.Test;

public class NumberOfK {
    public int GetNumberOfK(int[] array, int k) {
        int firstIndex = getFirstIndex(array, k);
        int lastIndex = getLastIndex(array, k);

        if (firstIndex != -1 && lastIndex != -1) {
            return lastIndex - firstIndex + 1;
        } else {
            return 0;
        }
    }

    private int getLastIndex(int[] array, int k) {
        int start = 0;
        int end = array.length - 1;

        int mid = (start + end) >> 1;
        while (start <= end) {
            if (array[mid] < k) {
                start = mid + 1;
            } else if (array[mid] > k) {
                end = mid - 1;
            } else if (mid + 1 < array.length && array[mid + 1] == k) {
                start = mid + 1;
            } else {
                return mid;
            }
            mid = (start + end) >> 1;
        }
        return -1;
    }

    private int getFirstIndex(int[] array, int k) {
        int start = 0;
        int end = array.length - 1;

        int mid = (start + end) >> 1;
        while (start <= end) {
            if (array[mid] < k) {
                start = mid + 1;
            } else if (array[mid] > k) {
                end = mid - 1;
            } else if (mid - 1 >= 0 && array[mid - 1] == k) {
                end = mid - 1;
            } else {
                return mid;
            }
            mid = (start + end) >> 1;
        }
        return -1;
    }

    @Test
    public void test() {
        System.out.println(GetNumberOfK(new int[]{1, 3, 3, 3, 4, 5}, 0));
    }
}
