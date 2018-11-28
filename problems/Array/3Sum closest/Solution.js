//https://leetcode.com/problems/3sum-closest/
/*
Given array nums = [-1, 2, 1, -4], and target = 1.

The sum that is closest to the target is 2. (-1 + 2 + 1 = 2).
/**
 * @param {number[]} nums
 * @param {number} target
 * @return {number}
 */
let threeSumClosest = function (nums, target) {
    let res;
    let smallestDiff = Number.MAX_SAFE_INTEGER;
    nums.sort((a,b)=>{
        return a-b;
    });
    for (let i = 0; i < nums.length - 2; i++)
    {
        let l = i + 1;
        let r = nums.length - 1;
        while (l < r) {
            let sum = nums[i] + nums[l] + nums[r];
            let diff = sum - target;
            if (diff == 0) {
                res = sum;
                return res;
            }
            else if (diff > 0) {
                if (diff < smallestDiff) {
                    smallestDiff = diff;
                    res = sum;
                }
                r--;
            }
            else {
                diff = -diff;
                if (diff < smallestDiff) {
                    smallestDiff = diff;
                    res = sum;
                }
                l++;
            }
        }
    }
    return res;
};

