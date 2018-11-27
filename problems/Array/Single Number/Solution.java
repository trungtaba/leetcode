//https://leetcode.com/explore/featured/card/top-interview-questions-easy/92/array/549/
class Solution {
    public int singleNumber(int[] nums) {
        int result=0;
        for(int i:nums){
            result=result^i;
        }
        return result;
    }
}