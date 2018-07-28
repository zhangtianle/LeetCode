package leetcode;

public class WordSearch {
    public boolean exist(char[][] board, String word) {
        if(board == null || board.length == 0 || word == null || word.length() == 0) {
            return false;
        }
        boolean[][] visited = new boolean[board.length][board[0].length];
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                if(hasPath(board, i, j, word, 0, visited)) {
                    return true;
                }
            }
        }
        return false;
    }

    private boolean hasPath(char[][] board, int x, int y, String path, int index, boolean[][] visited) {
        boolean res = false;
        if(index == path.length()) {
            return true;
        }
        if (x < 0 || x >= board.length || y < 0 || y >= board[0].length) {
            return false;
        }
        if(board[x][y] != path.charAt(index)) {
            return false;
        }
        if(visited[x][y]) {
            return false;
        }

        visited[x][y] = true;
        res = hasPath(board, x + 1, y, path, index+1, visited) || hasPath(board, x - 1, y, path, index+1, visited) ||
                hasPath(board, x, y + 1, path, index+1, visited) || hasPath(board, x, y - 1, path, index+1, visited);
        visited[x][y] = false;
        return res;
    }
}
