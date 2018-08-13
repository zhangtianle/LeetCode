package OnlineTest;

import org.junit.Test;

public class SortRGB {


    public void sort(char[] arr, int len) throws Exception {
        if (arr == null || len % 3 != 0) {
            throw new Exception("error input");
        }

        for (int i = 0; i < len; i++) {
            if (!rightPosition(arr, i)) {
//                int j = i + 1;
                int j = i + 1;
                while (j < len && !rightPosition(arr, j)) {
                    swap(arr, i, j);
                    j++;
                }
            }
        }
    }

    /**
     * 判断对应的位置是否为对应的颜色
     * @param arr 数组
     * @param i 位置
     * @return
     */
    private boolean rightPosition(char[] arr, int i) {
        if ((i % 3 == 0 && getColor(arr, i) == 'R') || (i % 3 == 1 && getColor(arr, i) == 'G') || (i % 3 == 2 && getColor(arr, i) == 'B')) {
            return true;
        } else {
            return false;
        }
    }

    private char getColor(char[] arr, int i) {
        return arr[i];
    }

    private void swap(char[] arr, int i, int j) {
        char c = arr[i];
        arr[i] = arr[j];
        arr[j] = c;
    }

    @Test
    public void test() throws Exception {
        char[] c = new char[]{'R','B','R','G','B','G','G','B','R'};
        sort(c, 9);
        System.out.println();
    }
}
