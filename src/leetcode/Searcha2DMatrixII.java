package leetcode;


import org.junit.Test;

public class Searcha2DMatrixII {
    public boolean searchMatrix(int[][] matrix, int target) {
        if (matrix.length == 0) {
            return false;
        }

        int m = matrix.length; //row
        int n = matrix[0].length; //col

        int row = 0;
        int col = n - 1;

        while (row < m && col >= 0) {
            int p = matrix[row][col];
            if (p == target) {
                return true;
            } else if (p > target) {
                col--;
            } else {
                row++;
            }
        }


        return false;
    }

    @Test
    public void test() {
        System.out.println(searchMatrix(new int[][]{{1, 4, 7, 11, 15}, {2, 5, 8, 12, 19}, {3, 6, 9, 16, 22}, {10, 13, 14, 17, 24}, {18, 21, 23, 26, 30}}, 18));
    }
}
