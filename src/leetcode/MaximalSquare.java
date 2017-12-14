package leetcode;

import org.junit.Test;

public class MaximalSquare {

    public int maximalSquare(char[][] matrix) {
        if (matrix == null || matrix.length == 0) {
            return 0;
        }
        int maxsqlen = 0;
        int rows = matrix.length;
        int cols = matrix[0].length;
        int[][] ints = new int[rows + 1][cols + 1];
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= cols; j++) {
                if (matrix[i - 1][j - 1] == '1') {
                    ints[i][j] = Math.min(Math.min(ints[i - 1][j], ints[i - 1][j - 1]), ints[i][j - 1]) + 1;
                    maxsqlen = Math.max(maxsqlen, ints[i][j]);
                }
            }
        }
        return maxsqlen * maxsqlen;
    }


    /**
     * error 只考虑了是方阵的情况，暴力搜索
     * @param matrix
     * @return
     */
    public int maximalSquare2(char[][] matrix) {
        if (matrix == null || matrix.length == 0) {
            return 0;
        }
        int mLen = Math.min(matrix.length, matrix[0].length);
        int len = 1;
        int max = 0;
        while (len <= mLen) {
            for (int y = 0; y < mLen - len; y++) {
                for (int x = 0; x < mLen - len; x++) {
                    // 遍历小矩阵
                    boolean check = true;
                    for (int i = x; i <= x + len; i++) {
                        for (int j = y; j <= y + len; j++) {
                            if (matrix[i][j] == '0') {
                                check = false;
                            }
                        }
                    }
                    if (check) {
                        max = (len + 1) * (len + 1);
                    }
                }
            }
            len++;
        }
        if (max == 0) {
            for (int i = 0; i < matrix.length; i++) {
                for (int j = 0; j < matrix[0].length; j++) {
                    if (matrix[i][j] == '1') {
                        return 1;
                    }
                }
            }
        }
        return max;
    }

    @Test
    public void test() {
        System.out.println(maximalSquare(new char[][]{{'1', '0', '1', '0', '0'}, {'1', '0', '1', '1', '1'}, {'1', '1', '1', '1', '1'}, {'1', '0', '0', '1', '0'}}));
//        System.out.println(maximalSquare(new char[][]{{'1', '1', '0'}, {'1', '1', '0'}, {'0', '0', '0'}}));
    }
}
