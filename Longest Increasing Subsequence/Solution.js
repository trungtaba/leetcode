//https://leetcode.com/problems/longest-increasing-subsequence/
/*
Input: [10,9,2,5,3,7,101,18]
Output: 4 
Explanation: The longest increasing subsequence is [2,3,7,101], therefore the length is 4. 
/**
 * @param {number[]} nums
 * @return {number}
 */
var lengthOfLIS = function (nums) {
    let list = [];
    let max = 0;
    let n=nums.length;

    /* Initialize LIS values for all indexes */
    for (let i = 0; i < n; i++) {
        list[i] = 1;
    }

    for (let i = 1; i < n; i++)
        for (let j = 0; j < i; j++) {
            if (nums[i] > nums[j] && list[i] < list[j] + 1) {
                list[i] = list[j] + 1;
            }
        }

    /* Pick maximum of all LIS values */
    for (let i = 0; i < n; i++)
        if (max < list[i])
            max = list[i];

    return max;
};