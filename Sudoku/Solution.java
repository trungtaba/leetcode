//https://leetcode.com/explore/learn/card/recursion-ii/472/backtracking/2796/

class Solution {
    public void solveSudoku(char[][] board) {
        backtrack(board);
    }

    private boolean backtrack(char[][] board) {
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (board[i][j] != '.')
                    continue;
                for (char c = '1'; c <= '9'; c++) {
                    if (canPlace(board, i, j, c)) {
                        board[i][j] = c;
                        if (backtrack(board))
                            return true;
                        board[i][j] = '.';
                    }
                }
                return false;
            }
        }
        return true;
    }

    private boolean canPlace(char[][] board, int row, int col, char value) {
        for (int i = 0; i < 9; i++) {
            if (board[i][col] == value)
                return false;
            if (board[row][i] == value)
                return false;
        }

        int x = row / 3 * 3;
        int y = col / 3 * 3;
        for (int m = x; m < x + 3; m++) {
            for (int n = y; n < y + 3; n++) {
                if (board[m][n] == value) {
                    return false;
                }
            }
        }
        return true;
    }
}