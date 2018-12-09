//https://leetcode.com/explore/featured/card/top-interview-questions-easy/92/array/567/
class Solution {
    public void moveZeroes(int[] nums) {
//        Input: [0,1,0,3,12]
//        Output: [1,3,12,0,0]
        int index=0;int count=0;
        while(index<nums.length && (index+count)<nums.length ){
            if(nums[index+count]!=0){
                nums[index]=nums[index+count];
                index++;
            }else{
                count++;
            }
        }
        for(int i=index;i<nums.length;i++){
            nums[i]=0;
        }
    }
}