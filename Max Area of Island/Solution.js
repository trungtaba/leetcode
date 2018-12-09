//https://leetcode.com/problems/max-area-of-island/

/**
 * @param {number[][]} grid
 * @return {number}
 */
let maxAreaOfIsland = function(grid) {
    let max=0;
    for(let i=0;i<grid.length;i++){
        for(let j=0;j<grid[0].length;j++){
            if(grid[i][j]===1){
                let count=0;
                count=countArea(i,j,count,grid);
                if(max<count){
                    max=count;
                }
            }
        }
    }
    return max;
};

let countArea=function(i,j,count,grid){
    if(i>=0 && i<grid.length && j>=0 && j<grid[0].length && grid[i][j]===1){
        count++;
        grid[i][j]=0;
        count=countArea(i+1,j,count,grid);
        count=countArea(i-1,j,count,grid);
        count=countArea(i,j+1,count,grid);
        count=countArea(i,j-1,count,grid);
    }
    return count;
}

