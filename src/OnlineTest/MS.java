package OnlineTest;

import org.junit.Test;

import java.util.Arrays;

public class MS {
    int[] sum(int[] arr, int target) {
        if (arr == null || arr.length < 2) {
            return null;
        }
        int[] res = new int[2];
        Arrays.sort(arr);
        int i = 0;
        int j = arr.length - 1;
        while (i < j) {
            int sum = arr[i] + arr[j];
            if (sum == target) {
                res[0] = arr[i];
                res[1] = arr[j];
                return res;
            }
            if (sum < target) {
                i++;
            } else {
                j--;
            }
        }
        return null;
    }

    void sort(int[] arr) {
        if (arr == null) {
            return;
        }
        quickSort(arr, 0, arr.length - 1);
    }


    void quickSort(int[] arr, int start, int end) {
        if (start == end) {
            return;
        }
        int index = partion(arr, start, end);
        if (index < end) {
            quickSort(arr, index + 1, end);
        }
        if (index > start) {
            quickSort(arr, start, index - 1);
        }
    }


    int partion(int[] arr, int start, int end) {
        if (arr == null || start > end) {
            return -1;
        }

        int sorted = start - 1;
        for (int i = start; i < end; i++) {
            if (arr[i] < arr[end]) {
                sorted++;
                if (sorted != i) {
                    swap(arr, i, sorted);
                }
            }
        }
        sorted++;
        swap(arr, sorted, end);
        return sorted;
    }

    private void swap(int[] arr, int i, int sorted) {

    }

    void sortAge(int[] arr) {
        int[] ageCount = new int[100];
        for (int i = 0; i < arr.length; i++) {
            ageCount[arr[i]]++;
        }
        int sorted = 0;
        for (int i = 0; i < ageCount.length; i++) {

            if (ageCount[i] > 0) {
                for (int j = 0; j < ageCount[i]; j++) {
                    arr[sorted] = i;
                    sorted++;
                }

            }
//            while (ageCount[i] != 0) {
//                ageCount[i]--;
//                arr[sorted] = i;
//                sorted++;
//            }
        }
        System.out.println();
    }

    @Test
    public void test() {
        sortAge(new int[]{11, 44, 32, 12, 11, 32, 12, 44});
        int[] sum = sum(new int[]{9, 2, 4, 2, 3, 2, 5}, 6);
        System.out.println();
    }
}
