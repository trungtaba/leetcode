//https://leetcode.com/problems/number-of-longest-increasing-subsequence/submissions/
/**
 * @param {number[]} nums
 * @return {number}
 */
var findNumberOfLIS = function (nums) {
    let count = [];
    let len=[];

    let n=nums.length,res = 0, max_len = 0;

    for(let i = 0; i<n; i++){
        len[i] = count[i] = 1;
        for(let j = 0; j <i ; j++){
            if(nums[i] > nums[j]){
                if(len[i] == len[j] + 1)count[i] += count[j];
                if(len[i] < len[j] + 1){ 
                    len[i] = len[j] + 1;
                    count[i] = count[j];
                }
            }
        }
        if(max_len == len[i]){
            res += count[i];
        }
        if(max_len < len[i]){
            max_len = len[i];
            res = count[i];
        }
    }

    return res;
};

