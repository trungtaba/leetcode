//https://leetcode.com/problems/search-in-rotated-sorted-array/
/**
 * @param {number[]} nums
 * @param {number} target
 * @return {number}
 */

// simple solution
let search = (nums, target) =>{
    return nums.findIndex((a)=>{
        return a===target;
    })
};

