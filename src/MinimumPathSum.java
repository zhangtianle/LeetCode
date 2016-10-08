import org.junit.Test;

/**
 * Given a m x n grid filled with non-negative numbers, find a path from top left to bottom right which minimizes the sum of all numbers along its path.
 * Note: You can only move either down or right at any point in time.
 * <p>
 * Created by Tianle Zhang on 2016/10/8.
 */
public class MinimumPathSum {
    public int minPathSum(int[][] grid) {

        if (grid == null || grid.length == 0) return 0;
        if (grid.length == 1 && grid[0].length == 1) return grid[0][0];

        int row = grid.length;
        int col = grid[0].length;

        int[][] dist = new int[row][col];

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (i==0 || j==0) {
                    dist[0][0] = grid[0][0];
                }
                dist[i][j] = min(getDist(dist, i, j-1), getDist(dist, i-1, j)) + grid[i][j];
            }
        }
        return dist[row-1][col-1];
    }

    private int getDist(int[][] dist, int i, int j) {
        if (i < 0 || j < 0) {
            return Integer.MAX_VALUE;
        }
        return dist[i][j];
    }

    private int min(int i, int j) {
        return i > j ? j : i;
    }

    @Test
    public void test() {
        int i = minPathSum(new int[][]{{0}});
        System.out.println(i);
    }
}
