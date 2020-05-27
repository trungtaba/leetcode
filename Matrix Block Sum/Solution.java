//https://leetcode.com/problems/matrix-block-sum/

class Solution {
    public int[][] matrixBlockSum(int[][] mat, int K) {
        int rows = mat.length;
        int cols = mat[0].length;
        int[][] prefixSum = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                prefixSum[i][j] = (j == 0) ? mat[i][j] : prefixSum[i][j - 1] + mat[i][j];
            }
        }
        for (int i = 1; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                prefixSum[i][j] += prefixSum[i - 1][j];
            }
        }

        int[][] ans = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            int rowStart = Math.max(i - K, 0);
            int rowEnd = Math.min(i + K, rows - 1);
            for (int j = 0; j < cols; j++) {
                int colStart = Math.max(j - K, 0);
                int colEnd = Math.min(j + K, cols - 1);
                ans[i][j] = prefixSum[rowEnd][colEnd] 
                        - (rowStart>0?prefixSum[rowStart - 1][colEnd]:0 )
                        - (colStart>0?prefixSum[rowEnd][colStart - 1]:0)
                        + (rowStart>0 && colStart>0 ? prefixSum[rowStart - 1][colStart - 1]:0);
            }
        }
        return ans;
    }
}