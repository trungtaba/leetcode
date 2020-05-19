//https://leetcode.com/problems/jump-game/

class Solution {
    public boolean canJump(int[] nums) {
        int distinct=1;
        for(int i=nums.length-2;i>=0;i--){
            nums[i]-=distinct;
            if(nums[i]<0) distinct++;else{
                distinct=1;
            }
        }

        return nums[0]>=0?true:false;
    }
}