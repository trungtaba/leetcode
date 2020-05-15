class Solution {
    public int totalNQueens(int n) {
        if (n < 2) return n;
        int[][] array = new int[n][n];
        int count = backtrack(array, 0, 0);
        return count;
    }

    private int backtrack(int[][] array, int row, int count) {
        if (row >= array.length) return count + 1;
        else {
            for (int col = 0; col < array.length; col++) {
                if (isNotUnderAttack(array, row, col)) {
                    placeQueen(array, row, col);
                    count = backtrack(array, row+1, count);
                    removeQueen(array, row, col);
                }
            }
            return count;
        }
    }

    private boolean isNotUnderAttack(int[][] array, int row, int col) {

        // check that col
        for (int i = row-1; i >= 0; i--) {
            if (array[i][col] == 1) return false;
        }

        // check left diag
        for (int i = row-1, j = col-1; i >= 0 && j >= 0; i--, j--) {
            if (array[i][j] == 1) return false;
        }

        // check top right diag
        for (int i = row-1, j = col+1; i >= 0 && j < array.length; i--, j++) {
            if (array[i][j] == 1) return false;
        }
        return true;
    }

    private void placeQueen(int[][] array, int row, int col) {
        array[row][col] = 1;
    }

    private void removeQueen(int[][] array, int row, int col) {
        array[row][col] = 0;
    }
}

/**
 * def backtrack(candidate):
    if find_solution(candidate):
        output(candidate)
        return
    
    # iterate all possible candidates.
    for next_candidate in list_of_candidates:
        if is_valid(next_candidate):
            # try this partial candidate solution
            place(next_candidate)
            # given the candidate, explore further.
            backtrack(next_candidate)
            # backtrack
            remove(next_candidate)
 */