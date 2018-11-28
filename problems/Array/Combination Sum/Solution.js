//https://leetcode.com/problems/combination-sum/
/*
Input: candidates = [2,3,5], target = 8,
A solution set is:
[
  [2,2,2,2],
  [2,3,3],
  [3,5]
]
*/
/**
 * @param {number[]} candidates
 * @param {number} target
 * @return {number[][]}
 */
let combinationSum = (candidates, target) => {
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

        currentList.push(candidates[i]);
        combinationSumBT(candidates,target-candidates[i],i,currentList,results);
        currentList.pop();
    }
}

