
import java.util.HashMap;

class Solution {
    public int removeDuplicates(int[] nums) {
        HashMap<Integer,Boolean>map=new HashMap<>();
        int count=0;
        int index=0;
        for(int i=0;i<nums.length;i++){
            if(!map.containsKey(nums[i])){
                map.put(nums[i], Boolean.TRUE);
                if(nums[index]!=nums[i])
                    nums[++index]=nums[i];
                count++;
            }
        }
        
        return count;
    }
}