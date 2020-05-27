//https://leetcode.com/problems/house-robber-ii/

class Solution {
    public int rob(int[] nums) {
        if (nums == null || nums.length == 0)
            return 0;
        if(nums.length==1) return nums[0];
        int[] dp1 = new int[nums.length];
        int[] dp2 = new int[nums.length];
        dp1[1] = nums[1]; 
        dp2[1]=nums[0];

        for (int i = 2; i < nums.length; i++) {
            dp1[i] = Math.max(dp1[i-1],dp1[i-2]+nums[i]);
        }

        for (int i = 1; i < nums.length-1; i++) {
            dp2[i+1] = Math.max(dp2[i],dp2[i-1]+nums[i]);
        }

        return Math.max(dp1[dp1.length -1],dp2[dp2.length-1]);
    }
}