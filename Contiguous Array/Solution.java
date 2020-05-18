import java.util.HashMap;

//https://leetcode.com/problems/contiguous-array/


class Solution {
    public int findMaxLength(int[] nums) {
        HashMap<Integer,Integer> map=new HashMap<>();
        map.put(0,-1);
        int max=0;
        int count=0;
        
        for(int i=0;i<nums.length;i++){
            if(nums[i]==1) count++;
            else count--;
            if(count==0) max++;
            if(!map.containsKey(count)){
                map.put(count, i);
            }else{
                max=Math.max(max, i-map.get(count));
            }
        }
        return max;
    }
}