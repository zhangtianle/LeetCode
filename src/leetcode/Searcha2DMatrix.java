package leetcode;

import org.junit.Test;

/**
 * Write an efficient algorithm that searches for a value in an m x n matrix. This matrix has the following properties:
 * <p>
 * Integers in each row are sorted from left to right.
 * The first integer of each row is greater than the last integer of the previous row.
 * <p>
 * For example,
 * <p>
 * Consider the following matrix:
 * <p>
 * [
 * [1,   3,  5,  7],
 * [10, 11, 16, 20],
 * [23, 30, 34, 50]
 * ]
 * <p>
 * Given target = 3, return true.
 * <p>
 * <p>
 * Created by Tianle Zhang on 2016/10/8.
 */
public class Searcha2DMatrix {
    public boolean searchMatrix(int[][] matrix, int target) {

        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) return false;

        int row = matrix.length;
        int col = matrix[0].length;

        int rowBegin = 0;
        int rowEnd = row - 1;
        int rowMid = (rowEnd - rowBegin) / 2 + rowBegin;

        while (rowBegin <= rowEnd) {
            if (target > matrix[rowMid][0]) {
                rowBegin = rowMid + 1;
                rowMid = (rowEnd - rowBegin) / 2 + rowBegin;
            } else if (target < matrix[rowMid][0]) {
                rowEnd = rowMid - 1;
                rowMid = (rowEnd - rowBegin) / 2 + rowBegin;
            } else {
                return true;
            }
        }

        if (rowMid == 0) return false;
        rowMid--;

        int colBegin = 0;
        int colEnd = col - 1;
        int colMid = (colEnd - colBegin) / 2 + colBegin;
        while (colBegin <= colEnd) {
            if (target > matrix[rowMid][colMid]) {
                colBegin = colMid + 1;
                colMid = (colEnd - colBegin) / 2 + colBegin;
            } else if (target < matrix[rowMid][colMid]) {
                colEnd = colMid - 1;
                colMid = (colEnd - colBegin) / 2 + colBegin;
            } else {
                return true;
            }
        }
        return false;
    }

    @Test
    public void test() {
        System.out.println(searchMatrix(new int[][]{{1}}, 0));
    }
}
