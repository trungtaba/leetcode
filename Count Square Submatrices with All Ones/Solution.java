//https://leetcode.com/problems/count-square-submatrices-with-all-ones/

class Solution {
    public int countSquares(int[][] matrix) {
        int rows = matrix.length, cols = matrix[0].length;
        int result = 0;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (matrix[i][j] == 1) {
                    if (i == 0 || j == 0)
                        result++;
                    else {
                        int value = min(matrix[i - 1][j], matrix[i][j - 1], matrix[i - 1][j - 1]) + matrix[i][j];
                        result += value;
                        matrix[i][j] = value;
                    }
                }
            }
        }
        return result;
    }

    private int min(int a, int b, int c) {
        return Math.min(a, Math.min(b, c));
    }
}