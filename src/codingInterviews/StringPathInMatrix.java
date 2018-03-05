package codingInterviews;

import org.junit.Test;

public class StringPathInMatrix {
    public boolean hasPath(char[] matrix, int rows, int cols, char[] str) {
        if (matrix == null || rows < 1 || cols < 1 || str == null) {
            return false;
        }

        boolean[] visited = new boolean[rows * cols];
        for (int i = 0; i < visited.length; i++) {
            visited[i] = false;
        }

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (hasPathCore(matrix, visited, rows, cols, str, i, j, 0))
                    return true;
            }
        }
        return false;
    }

    private boolean hasPathCore(char[] matrix, boolean[] visited, int rows, int cols, char[] str, int row, int col, int pathLength) {
        if (str.length == pathLength) {
            return true;
        }

        boolean hasPath = false;
        if (row >= 0 && col >= 0 && row < rows && col < cols && !visited[row * cols + col] && pathLength < str.length && str[pathLength] == matrix[row * cols + col]) {
            pathLength++;
            visited[row * cols + col] = true;
            hasPath = hasPathCore(matrix, visited, rows, cols, str, row + 1, col, pathLength) ||
                    hasPathCore(matrix, visited, rows, cols, str, row, col + 1, pathLength) ||
                    hasPathCore(matrix, visited, rows, cols, str, row, col - 1, pathLength) ||
                    hasPathCore(matrix, visited, rows, cols, str, row - 1, col, pathLength);
            if (!hasPath) {
                pathLength--;
                visited[row * cols + col] = false;
            }
        }
        return hasPath;
    }

    @Test
    public void test() {
        System.out.println(hasPath("ABCESFCSADEE".toCharArray(), 3, 4, "SEE".toCharArray()));
    }
}
