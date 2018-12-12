import java.util.HashMap;
import java.util.SortedMap;
import java.util.TreeMap;

//https://leetcode.com/problems/kth-largest-element-in-an-array/

class Solution {
    public int findKthLargest(int[] nums, int k) {
        TreeMap<Integer,Integer> treeMap= new TreeMap<>();
        HashMap<Integer,Boolean> map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(!treeMap.containsKey(nums[i])){
                treeMap.put(nums[i], 1);
            }else{
                treeMap.replace(nums[i], treeMap.get(nums[i])+1);
            }
            
            if(!map.containsKey(nums[i])){
                map.put(nums[i], Boolean.TRUE);
            }
        }
        
        for(int i:map.keySet()){        
            SortedMap<Integer,Integer> tmp= treeMap.tailMap(i);
            int count=0;
            for(int key:tmp.values() ){
                count+=key;
            }
            if(count==k || (count>k && count-tmp.get(i)<k)){
                return i;
            }
        }
        return -1;
    }
}