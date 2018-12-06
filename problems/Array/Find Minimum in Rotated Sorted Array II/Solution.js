//https://leetcode.com/problems/find-minimum-in-rotated-sorted-array-ii/

/**
 * @param {number[]} nums
 * @return {number}
 */

var findMin = function(nums) {
    let len = nums.length;
    let left = 0;
    let right = len-1;
    if(len ===  1)
        return nums[0];
    if(nums[left] < nums[right])
        return nums[left]; 
    while((right-left)>1){
        if(nums[left] <= nums[left+1])
            left++;
        if(nums[right] >= nums[right-1])
            right--;
    }
    return nums[right]; 
};