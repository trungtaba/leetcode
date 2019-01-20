class Solution {
    public int uniquePathsWithObstacles(int[][] grid) {
        int m = grid.length, n = grid[0].length;
        int[][]dp=new int[m+1][n+1];
        dp[0][1] = 1;
        for(int i = 1 ; i <= m ; ++i)
            for(int j = 1 ; j <= n ; ++j)
                if(grid[i-1][j-1]==0)
                    dp[i][j] = dp[i-1][j]+dp[i][j-1];
        return dp[m][n];
    }
}