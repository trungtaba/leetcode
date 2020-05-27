//https://leetcode.com/problems/maximum-product-of-three-numbers/

class Solution {
    public int maximumProduct(int[] nums) {
        int firstLargest=Integer.MIN_VALUE, secondLargest=Integer.MIN_VALUE, thridLargest=Integer.MIN_VALUE;
        int firstSmallest=Integer.MAX_VALUE, secondSmallest=Integer.MAX_VALUE;

        for(int i=0;i<nums.length;i++){
            if(nums[i]>firstLargest){
                thridLargest=secondLargest;
                secondLargest=firstLargest;
                firstLargest=nums[i];
            }else if(nums[i]>secondLargest){
                thridLargest=secondLargest;
                secondLargest=nums[i];
            }else if (nums[i]>thridLargest){
                thridLargest=nums[i];
            }
            if(nums[i]<firstSmallest){
                secondSmallest=firstSmallest;
                firstSmallest=nums[i];
            }else if (nums[i]<secondSmallest){
                secondSmallest=nums[i];
            }
        }

        return Math.max(firstLargest*secondLargest*thridLargest, firstLargest*firstSmallest*secondSmallest);
    }
}