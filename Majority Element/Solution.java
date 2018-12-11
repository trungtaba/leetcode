//https://leetcode.com/problems/majority-element/

import java.util.Hashtable;
class Solution {
    public int majorityElement(int[] nums) {
        int n= nums.length;
        Hashtable<Integer, Integer> table =new Hashtable<>();

        for(int i=0;i<n;i++){
            if(!table.containsKey(nums[i])){
                table.put(nums[i],1);
            }else{
                if(1+ table.get(nums[i]) > n/2 ){
                    return nums[i];
                }else{
                    table.replace(nums[i], table.get(nums[i])+1);
                }
            }
        }
        return nums[0];
    }
}