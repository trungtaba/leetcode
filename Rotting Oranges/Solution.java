//https://leetcode.com/problems/rotting-oranges/

class Solution {

    public int orangesRotting(int[][] grid) {
        int step=0;
        int freshCount=0;
        Queue<int[]> queue=new LinkedList<>();
        int rows=grid.length, cols=grid[0].length;
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                if(grid[i][j]==2){
                    queue.add(new int[]{i,j});
                }else if(grid[i][j]==1){
                    freshCount++;
                }
            }
        }

        int[][] directions = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}};
        while(!queue.isEmpty() && freshCount>0){
            int size=queue.size();
            for(int i=0;i<size;i++){
                int[] current=queue.poll();
                for(int[] direction: directions){
                    int nextX=current[0]+direction[0];
                    int nextY=current[1]+direction[1];
                    if(nextX<0 || nextX>=rows || nextY<0 || nextY>=cols || grid[nextX][nextY]!=1) continue;
                    queue.add(new int[]{nextX, nextY});
                    grid[nextX][nextY]=2;
                    freshCount--;
                }
            }
            step++;
        }

        return freshCount==0?step:-1;
    }
}