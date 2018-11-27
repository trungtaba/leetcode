//https://leetcode.com/problems/3sum/
/*

Given array nums = [-1, 0, 1, 2, -1, -4],

A solution set is:
[
  [-1, 0, 1],
  [-1, -1, 2]
]

/**
 * @param {number[]} nums
 * @return {number[][]}
 */
var threeSum = function(nums) {
    let number=[];
    nums.sort((a,b)=>{
        return a-b;
    });
    for(let i=0;i+2<nums.length;i++){
        if(i>0 && nums[i]===nums[i-1]){
            continue;
        }
        let target=-nums[i];
        let j=i+1;
        let k=nums.length-1;
        while(j<k){
            if(nums[j]+nums[k]===target){
                number.push([nums[i],nums[j],nums[k]]);
                j++;k--;
                while (j < k && nums[j] === nums[j - 1]) j++;  
                while (j < k && nums[k] === nums[k + 1]) k--;
            }else if(nums[j]+nums[k]>target){
                k--;
            }else{
                j++;
            }
        }
    }
    return number;
};