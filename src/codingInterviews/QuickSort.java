package codingInterviews;


import org.junit.Test;

public class QuickSort {

    public void quickSort(int[] arr, int start, int end) {
        if (start == end) {
            return;
        }

        int index = partition(arr, start, end);
        if (index > start) {
            quickSort(arr, start, index - 1);
        }
        if (index < end) {
            quickSort(arr,index + 1, end);
        }
    }


    public int partition(int[] arr, int start, int end) {
        if (arr == null || start < 0 || end >= arr.length) {
            return -1;
        }

        // 把最后一个做为基准元素
        int sortedIndex = start - 1;
        for (int i = start; i < end; i++) {
            if (arr[i] < arr[end]) {
                sortedIndex++;
                if (sortedIndex != i) {
                    swap(arr, sortedIndex, i);
                }
            }
        }

        // 把基准元素换回来
        sortedIndex++;
        swap(arr, sortedIndex, end);

        return sortedIndex;
    }

    private void swap(int[] arr, int a, int b) {
        int temp = arr[b];
        arr[b] = arr[a];
        arr[a] = temp;
    }

    @Test
    public void test() {
        int[] arr = new int[]{3,1,5,7,2,5,8,4};
        quickSort(arr,0, arr.length-1);
        System.out.println();
    }
}
