//https://leetcode.com/problems/4sum/

/**
 * @param {number[]} nums
 * @param {number} target
 * @return {number[][]}
 */
let fourSum = function(nums, target) {
    nums.sort((a,b)=>{
        return a-b;
    });
    let result=[];

    findNSum(nums,target,4,[],result);
    return result;
};

let findNSum=(nums,target,N,current,result)=>{
    if(nums.length<N || N < 2 || nums[0]*N> target || nums[nums.length-1]*N<target) return;

    if(N===2){
        let l=0;
        let r=nums.length-1;
        while(l<r){
            let sum=nums[l]+nums[r];
            if(sum===target){
                result.push(current.concat(nums[l],nums[r]) );
                l++;
                while(l<r && nums[l]===nums[l-1]) l++;
            }else if(sum<target){
                l++;
            }else{
                r--;
            }
        }
    }else{
        for(let i=0;i< nums.length-N+1;i++){
            if(i===0 || nums[i]!==nums[i-1]){
                
                findNSum(nums.slice(i+1),target-nums[i],N-1, current.concat(nums[i]),result);
            }
        }
    }
}