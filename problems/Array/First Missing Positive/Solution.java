import java.util.HashMap;

//https://leetcode.com/problems/first-missing-positive/submissions/

class Solution {
    public int firstMissingPositive(int[] nums) {
        if(nums.length==0)return 1;
        HashMap<Integer,Boolean> table=new HashMap<>();

        int length=nums.length;
        for(int i=0;i<length;i++){
            table.put(nums[i], Boolean.TRUE);
        }

        for(int i=1;i<=length;i++){
            if(!table.containsKey(i)){
                return i;
            }
        }

        return length+1;
    }
}