package leetcode;

import org.junit.Test;

/**
 * Given an integer n, generate a square matrix filled with elements from 1 to n2 in spiral order.
 * For example,
 * Given n = 3,
 * You should return the following matrix:
 *
 * [
 *  [ 1, 2, 3 ],
 *  [ 8, 9, 4 ],
 *  [ 7, 6, 5 ]
 * ]
 *
 * Created by Tianle Zhang on 2016/10/8.
 */
public class SpiralMatrixII {

    public int[][] generateMatrix(int n) {
        int[][] matrix = new int[n][n];
        int content = 1;

        int left = 0;
        int right = n-1;
        int top = 0;
        int bottom = n-1;

        while (left <= right) {
            for (int j = left; j <= right; j++) {
                matrix[top][j] = content++;
            }
            top++;
            for (int i = top; i <= bottom; i++) {
                matrix[i][right] = content++;
            }
            right--;
            for (int j = right; j >= left; j--) {
                matrix[bottom][j] = content++;
            }
            bottom--;
            for (int i = bottom; i >= top; i--) {
                matrix[i][left] = content++;
            }
            left++;
        }
        return matrix;
    }

    /*public int[][] generateMatrix2(int n) {
        int[][] matrix = new int[n][n];
        int content = 1;

        // right, down, left, up
        int[] direction = {1,2,3,4};
        int dIndex = 0;

        int i = 0;
        int j = 0;
        while(content <= n * n) {

            matrix[i][j] = content;

            if (j+1 >= n || i+1 >=n || j-1 < 0 || i-1 < 0
                    || matrix[i][j+1] == 0 || matrix[i+1][j] == 0 || matrix[i][j-1] == 0 || matrix[i-1][j] == 0) {
                dIndex++;
            }
            if (dIndex == 4) {
                dIndex = 0;
            }

            if (direction[dIndex] == 1 && j != n-1) {
                j++;
            }
            if (direction[dIndex] == 2 && i != n-1) {
                i++;
            }
            if (direction[dIndex] == 3 && j != 0) {
                j--;
            }
            if (direction[dIndex] == 4 && i != 0) {
                i--;
            }

            content++;
        }

        return matrix;
    }*/

    @Test
    public void test() {
        generateMatrix(3);
    }
}
