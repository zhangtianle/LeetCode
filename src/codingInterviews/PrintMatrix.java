package codingInterviews;

import org.junit.Test;

import java.util.ArrayList;

public class PrintMatrix {
    public ArrayList<Integer> printMatrix(int[][] matrix) {
        if (matrix == null && matrix.length == 0) {
            return null;
        }
        int col = matrix[0].length;
        int row = matrix.length;

        int start = 0;

        ArrayList<Integer> arrayList = new ArrayList<>();

        while (col > start * 2 && row > start * 2) {
            ArrayList<Integer> list = printMatrixInCircle(matrix, col, row, start);
            arrayList.addAll(list);
            start++;
        }

        return arrayList;
    }

    private ArrayList<Integer> printMatrixInCircle(int[][] matrix, int col, int row, int start) {
        ArrayList<Integer> arrayList = new ArrayList<>();

        int endCol = col - 1 - start;
        int endRow = row - 1 - start;

        // 从左到右
        for (int i = start; i <= endCol; i++) {
            arrayList.add(matrix[start][i]);
        }
        // 从上到下
        if (endRow > start) {
            for (int i = start + 1; i <= endRow; i++) {
                arrayList.add(matrix[i][endCol]);
            }
        }
        // 从右到左
        if (endRow> start && endCol - start >= 1) {
            for (int i = endCol-1; i >= start; i--) {
                arrayList.add(matrix[endRow][i]);
            }
        }
        // 从下到上
        if (endCol > start && endRow - start >= 2) {
            for (int i = endRow-1; i >= start + 1; i--) {
                arrayList.add(matrix[i][start]);
            }
        }
        return arrayList;
    }

    @Test
    public void test() {
        System.out.println(printMatrix(new int[][]{{1,2,3,4,5}}));
    }
}













