//https://leetcode.com/problems/unique-paths-iii/

class Solution {
    int path;
    int[][] directions = {{1, 0}, {-1, 0}, {0, 1}, {0, -1}};
    
    public int uniquePathsIII(int[][] grid) {
        path = 0;
        int total = 0;
        int startX = 0;
        int startY = 0;
        
        for(int i=0; i<grid.length; i++) {
            for(int j=0; j<grid[0].length; j++) {
                if(grid[i][j]!=-1) {
                    total++;                   
                }
                if(grid[i][j]==1) {
                    startX = i;
                    startY = j;                    
                }
            }
        }
        dfs(grid, startX, startY, total, 1);
        return path;
    }
    
    private void dfs(int[][] grid, int x, int y, int total, int current){
        if(x<0 || y< 0 || x>=grid.length || y>=grid[0].length || grid[x][y]==-1){
            return;
        }
        
        if(grid[x][y]==2){
            path+= total==current?1:0;
            return;
        }
        grid[x][y]=-1;
        for(int[] direction : directions) {
            dfs(grid, x+direction[0], y+direction[1], total, current+1);
        }
        grid[x][y]= 0;
    }
}