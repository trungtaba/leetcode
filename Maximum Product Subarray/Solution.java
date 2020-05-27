//https://leetcode.com/problems/maximum-product-subarray/

class Solution {
    public int maxProduct(int[] nums) {
        if(nums==null || nums.length==0) return 0;
        int minValue=nums[0], maxValue=nums[0], max=nums[0];
        for(int i=1;i<nums.length;i++){
            if(nums[i]<0){
                int tmp= minValue;
                minValue=maxValue;
                maxValue=tmp;
            }
            maxValue=Math.max(maxValue*nums[i], nums[i]);
            minValue=Math.min(minValue*nums[i], nums[i]);

            max=Math.max(max, maxValue);
        }
        return max;
    }
}