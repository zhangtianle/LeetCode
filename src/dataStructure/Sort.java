package dataStructure;

import org.junit.Test;

public class Sort {
    // 归并排序的辅助数组
    int[] aux;

    public void insertSort(int[] arr) {
        if (arr == null || arr.length == 0) {
            return;
        }
        for (int i = 1; i < arr.length; i++) {
            for (int j = i; j > 0 && arr[j] < arr[j - 1]; j--) {
                exch(arr, j, j - 1);
            }
        }
        return;
    }

    public void shellSort(int[] arr) {
        if (arr == null || arr.length == 0) {
            return;
        }
        int h = 1;
        while (h < arr.length / 3) {
            h = 3 * h + 1;
        }
        while (h >= 1) {
            // 将数组变成h有序
            for (int i = h; i < arr.length; i++) {
                // 注意 j >= h
                for (int j = i; j >= h && arr[j] < arr[j - h]; j -= h) {
                    exch(arr, j, j - h);
                }
            }
            h /= 3;
        }
        return;
    }

    public void mergingSort(int[] arr) {
        aux = new int[arr.length];
        mergingSortCore(arr, 0, arr.length - 1);
        return;
    }

    private void mergingSortCore(int[] arr, int lo, int hi) {
        if (lo >= hi) {
            return;
        }
        int mid = lo + (hi - lo) / 2;
        mergingSortCore(arr, lo, mid);
        mergingSortCore(arr, mid + 1, hi);
        merge(arr, lo, mid, hi);
    }

    private void merge(int[] arr, int lo, int mid, int hi) {
        int i = lo;
        int j = mid + 1;

        for (int k = lo; k <= hi; k++) {
            aux[k] = arr[k];
        }

        for (int k = lo; k <= hi; k++) {
            if (i > mid) {
                // 左半边完了，把右半边复制过来
                arr[k] = aux[j++];
            } else if (j > hi) {
                // 右半边完了，把左半边复制过来
                arr[k] = aux[i++];
            } else if (aux[i] > aux[j]) {
                // 左半边大于右半边，把右半边复制过来
                arr[k] = aux[j++];
            } else {
                // 右半边大于左半边，把左半边复制过来
                arr[k] = aux[i++];
            }
        }
    }

    private void exch(int[] arr, int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }

    @Test
    public void test() {
        int[] arr = new int[]{2, 3, 1, 4, 5, 7, 5, 6};
        mergingSort(arr);
        shellSort(arr);
        insertSort(arr);
    }
}
