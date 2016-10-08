import org.junit.Test;

/**
 *
 Given a m x n matrix, if an element is 0, set its entire row and column to 0. Do it in place.

 click to show follow up.
 Follow up:

 Did you use extra space?
 A straight forward solution using O(mn) space is probably a bad idea.
 A simple improvement uses O(m + n) space, but still not the best solution.
 Could you devise a constant space solution?

 *
 * Created by Tianle Zhang on 2016/10/9.
 */
public class SetMatrixZeroes {

    public void setZeroes(int[][] matrix) {
        if (matrix == null) return;

        int temp = 1;

        int row = matrix.length;
        int col = matrix[0].length;

        for (int i = 0; i < row; i++) {
            if (matrix[i][0] == 0) {
                temp = 0;
            }
            for (int j = 1; j < col; j++) {
                if (0 == matrix[i][j]) {
                    matrix[i][0] = matrix[0][j] = 0;
                }
            }
        }

        for (int i = row - 1; i >= 0; i--) {
            for (int j = col - 1; j >= 1; j--) {
                if (matrix[i][0] == 0 || matrix[0][j] == 0) {
                    matrix[i][j] = 0;
                }
            }
            if (temp == 0) {
                matrix[i][0] = 0;
            }
        }
    }

    @Test
    public void test() {
        setZeroes(new int[][]{{0,0,0,5},{4,3,1,4},{0,1,1,4},{1,2,1,3},{0,0,1,1}});
    }


}
