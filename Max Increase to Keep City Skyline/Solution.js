//https://leetcode.com/problems/max-increase-to-keep-city-skyline/
/*

[ [3, 0, 8, 4], 
  [2, 4, 5, 7],
  [9, 2, 6, 3],
  [0, 3, 1, 0] ]

[ [8, 4, 8, 7],
    [7, 4, 7, 7],
    [9, 4, 8, 7],
    [3, 3, 3, 3] ]
*/
/**
 * @param {number[][]} grid
 * @return {number}
 */
var maxIncreaseKeepingSkyline = function(grid) {
    let map=new Map();
    const col=grid[0].length;
    const row=grid.length;
    let coltmp,rowtmp;
    let result=0;

    for(let i=0;i<col;i++){
        for(let j=0;j<row;j++){
            if(map.get((i+1)*row)===undefined){
                rowtmp=findRowMin(grid,i);
                map.set((i+1)*row,rowtmp);
            }
            if(map.get(j)===undefined){
                coltmp=findColMin(grid,j);
                map.set(j,coltmp);
            }
            if(map.get((i+1)*row)<map.get(j)){
                result+=(map.get((i+1)*row)-grid[i][j]);
            }else{
                result+=(map.get(j)-grid[i][j]);
            }
        }
    }
    return result;
};

let findColMin=function(grid, col){
    let max=-1;
    for(let i=0;i<grid.length;i++){
        if(max<grid[i][col]){
            max=grid[i][col];
        }
    }
    //console.log(`findColMin ${col} = ${max}`)
    return max;
}

let findRowMin=function(grid, row){
    let max=-1;
    for(let i=0;i<grid[0].length;i++){
        if(max<grid[row][i]){
            max=grid[row][i];
        }
    }

    //console.log(`findRowMin ${row} = ${max}`)
    return max;
}

