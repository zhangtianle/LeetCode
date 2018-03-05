package codingInterviews;

import org.junit.Test;

public class RobotMove {
    public int movingCount(int threshold, int rows, int cols) {
        if (threshold < 0 || rows <= 0 || cols <= 0) {
            return 0;
        }

        boolean[] visited = new boolean[rows * cols];
        for (int i = 0; i < visited.length; i++) {
            visited[i] = false;
        }

        return movingCountCore(threshold, rows, cols, 0, 0, visited);
    }

    private int movingCountCore(int threshold, int rows, int cols, int row, int col, boolean[] visited) {
        int count = 0;
        if (row >= 0 && col >= 0 && row < rows && col < cols && !visited[row * cols + col] && getIn(row, col, threshold)) {
            visited[row * cols + col] = true;
            count = 1 + movingCountCore(threshold, rows, cols, row + 1, col, visited)
                    + movingCountCore(threshold, rows, cols, row, col + 1, visited)
                    + movingCountCore(threshold, rows, cols, row - 1, col, visited)
                    + movingCountCore(threshold, rows, cols, row, col - 1, visited);
        }
        return count;
    }


    private boolean getIn(int row, int col, int threshold) {
        int sumRow = 0;
        while (row != 0) {
            sumRow += row % 10;
            row /= 10;
        }

        int sumCol = 0;
        while (col != 0) {
            sumCol += col % 10;
            col /= 10;
        }
        return sumRow + sumCol <= threshold ? true : false;
    }

    @Test
    public void test() {
        System.out.println(movingCount(5, 10, 10));
    }
}
