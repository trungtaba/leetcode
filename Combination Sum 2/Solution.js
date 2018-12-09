//https://leetcode.com/problems/combination-sum-ii/
/*
Input: candidates = [10,1,2,7,6,1,5], target = 8,
A solution set is:
[
  [1, 7],
  [1, 2, 5],
  [2, 6],
  [1, 1, 6]
]
*/
/**
 * @param {number[]} candidates
 * @param {number} target
 * @return {number[][]}
 */
let combinationSum2 = (candidates, target) => {
    let results = [];

    if(candidates == null || candidates.length == 0) 
        return result;
    candidates.sort((a,b)=>{
        return a-b;
    });

    let current = [];
    
    combinationSumBT(candidates, target, 0, current, results);
    return results;
};

let combinationSumBT=(candidates, target, index, currentList,results)=>{
    if(target == 0){
        let temp = currentList.slice();
        results.push(temp);
        return;
    }
    for(let i = index; i < candidates.length; i++){
        if(target<candidates[i]){
            break;
        }
        if(i>index && candidates[i]===candidates[i-1]) continue;
        currentList.push(candidates[i]);
        combinationSumBT(candidates,target-candidates[i],i+1,currentList,results);
        currentList.pop();
    }
}

