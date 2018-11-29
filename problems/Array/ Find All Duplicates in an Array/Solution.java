import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> list=new ArrayList<>();
        HashMap<Integer,Boolean> map=new HashMap<>();
        for(int i: nums){
            if(!map.containsKey(i)){
                map.put(i, Boolean.TRUE);
            }else{
                list.add(i);
            }
        }
        return list;
    }
}