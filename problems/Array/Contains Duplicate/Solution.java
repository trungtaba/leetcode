//https://leetcode.com/explore/featured/card/top-interview-questions-easy/92/array/578/
class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashMap<Integer,Boolean>map=new HashMap<>();
        for(int i:nums){
            if(map.containsKey(i)){
                return true;
            }else{
                map.put(i,Boolean.TRUE);
            }
        }
        return false;
    }
}