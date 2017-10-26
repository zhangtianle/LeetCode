package leetcode;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * Given a matrix of m x n elements (m rows, n columns), return all elements of the matrix in spiral order.
 *
 * For example,
 * Given the following matrix:
 *
 * [
 *  [ 1, 2, 3 ],
 *  [ 4, 5, 6 ],
 *  [ 7, 8, 9 ]
 * ]
 *
 * You should return [1,2,3,6,9,8,7,4,5].
 *
 * Created by Tianle Zhang on 2016/10/8.
 */
public class SpiralMatrix {

    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> list = new ArrayList<>();

        if(matrix == null || matrix.length == 0 || matrix[0].length == 0) return list;

        int m = matrix.length;
        int n = matrix[0].length;

        int left = 0;
        int right = n-1;
        int top = 0;
        int bottom = m-1;

        while (top <= bottom && left <= right) {
            for (int j = left; j <= right; j++) {
                list.add(matrix[top][j]);
            }
            top++;
            for (int i = top; i <= bottom; i++) {
                list.add(matrix[i][right]);
            }
            right--;
            if (top <= bottom) {
                for (int j = right; j >= left; j--) {
                    list.add(matrix[bottom][j]);
                }
            }
            bottom--;
            if (left <= right) {
                for (int i = bottom; i >= top; i--) {
                    list.add(matrix[i][left]);
                }
            }
            left++;
        }

        return list;
    }

    @Test
    public void test() {
        List<Integer> list = spiralOrder(new int[][]{{2,2,1}});
        System.out.println(list);
    }
}
