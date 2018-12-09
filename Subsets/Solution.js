//https://leetcode.com/problems/subsets/
/*

Input: nums = [1,2,3]
Output:
[
  [3],
  [1],
  [2],
  [1,2,3],
  [1,3],
  [2,3],
  [1,2],
  []
]

/**
 * @param {number[]} nums
 * @return {number[][]}
 */
// solution 1:
var subsets = function (nums) {
    result = [];
    let n = nums.length;

    for (let i = 0; i < (1 << n); i++) {
        let tmp = [];
        for (let j = 0; j < n; j++)
            if ((i & (1 << j)) > 0) {
                tmp.push(nums[j]);
            }

        result.push(tmp);
    }
    return result;
};


//Solution 2:
// subsets = function (nums) {
//     if(nums.length === 0){ return [[]] };
//     let last = nums.pop();
//     let prev = subsets(nums);
//     let current = prev.map (a => a.concat([last]));
    
//     return prev.concat(current);
// };
