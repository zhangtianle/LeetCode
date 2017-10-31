package leetcode;

import org.junit.Test;

/**
 * Created by Kyle on 2017/10/31.
 */
public class RotateImage {
    public void rotate(int[][] matrix) {
        int[][] matrixCopy = new int[matrix.length][matrix.length];
//        matrixCopy = (int[][]) matrix.clone();
//        System.arraycopy(matrix, 0, matrixCopy, 0, matrix.length);

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                matrixCopy[i][j] = matrix[i][j];
            }
        }

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                matrix[j][matrix.length - 1 - i] = matrixCopy[i][j];
            }
        }
        System.out.println();
    }

    public void rotate2(int[][] matrix) {
        for (int i = 0; i < matrix.length / 2; i++) {
            int[] temp = matrix[i];
            matrix[i] = matrix[matrix.length - 1 - i];
            matrix[matrix.length - 1 - i] = temp;
        }

        for (int i = 0; i < matrix.length; i++) {
            for (int j = i + 1; j < matrix.length; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }

    }

    @Test
    public void test() {
        rotate2(new int[][]{{1,2,3},{4,5,6},{7,8,9}});
        System.out.println();
    }
}
