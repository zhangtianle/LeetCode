package ValidSudoku;

import java.util.HashSet;
import java.util.Set;

/**
 * Determine if a Sudoku is valid, according to: Sudoku Puzzles - The Rules.(http://sudoku.com.au/TheRules.aspx)
 * <p>
 * The Sudoku board could be partially filled, where empty cells are filled with the character '.'.
 * <p>
 * Created by Tianle Zhang on 2016/9/2.
 */
public class Solution {

    public boolean isValidSudoku(char[][] board) {

        int rowLength = board.length;
        int colLength = board[0].length;

        for (int i = 0; i < rowLength; i++) {
            Set<Character> rows = new HashSet<>();
            Set<Character> cols = new HashSet<>();
            Set<Character> cube = new HashSet<>();

            for (int j = 0; j < colLength; j++) {
                if (board[i][j] != '.' && !rows.add(board[i][j]))
                    return false;
                if (board[j][i] != '.' && !cols.add(board[j][i]))
                    return false;

                int rowIndex = 3 * (i / 3);
                int colIndex = 3 * (i % 3);
                if (board[rowIndex + j / 3][colIndex + j % 3] != '.' && !cube.add(board[rowIndex + j / 3][colIndex + j % 3]))
                    return false;
            }
        }
        return true;
    }
}
