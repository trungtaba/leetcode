//https://leetcode.com/problems/find-minimum-in-rotated-sorted-array/
/**
 * @param {number[]} nums
 * @return {number}
 */
var findMin = function(nums) {
    // let number=Number.MAX_VALUE;
    // nums.forEach((a)=>{
    //     if(a<number){
    //         number=a;
    //     }
    // });
    // return number;

    let start=0;
    let end=nums.length-1;
    while(start<end){
        if(nums[start]<nums[end]){
            return nums[start];
        }else {
            let mid=Math.trunc((start+end)/2);
            if(nums[mid]>=nums[start]){
                start=mid+1;
            }else{
                end=mid;
            }
        }
    }
};