//https://leetcode.com/explore/featured/card/top-interview-questions-easy/92/array/674/
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;


class Solution {

    public int[] intersect(int[] nums1, int[] nums2) {
        HashMap<Integer, Integer> map1 = new HashMap<>();
        HashMap<Integer, Integer> map2 = new HashMap<>();

        for (int i : nums1) {
            if (map1.containsKey(i)) {
                map1.replace(i, map1.get(i) + 1);
            } else {
                map1.put(i, 1);
            }
        }
        for (int i : nums2) {
            if (map2.containsKey(i)) {
                map2.replace(i, map2.get(i) + 1);
            } else {
                map2.put(i, 1);
            }
        }
        List<Integer> arrayList = new ArrayList<>();
        for (int i : map1.keySet()) {
            if (map2.containsKey(i)) {
                if (map1.get(i) > map2.get(i)) {
                    for (int j = 0; j < map2.get(i); j++) {
                        arrayList.add(i);
                    }
                }else{
                     for (int j = 0; j < map1.get(i); j++) {
                        arrayList.add(i);
                    }
                }
            }
        }
        int[] array =  new int[arrayList.size()];
        int index=0;
        for(int i:arrayList){
            array[index++]=i;
        }

        return array;
    }

}

