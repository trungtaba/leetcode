//https://leetcode.com/contest/leetcode-weekly-contest-18b/problems/relative-ranks/
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

class Solution {

    public String[] findRelativeRanks(int[] nums) {
        Map<Integer, Integer> hm = new HashMap<>();
        String[] arr = new String[nums.length];
        for (int i = 0; i < nums.length; i++) {
            hm.put(nums[i], i);
        }
        Arrays.sort(nums);
        String[] medal = {"Gold Medal", "Silver Medal", "Bronze Medal"};
        for (int i = 0; i < nums.length && i < 3; i++) {
            arr[hm.get(nums[nums.length - 1 - i])] = medal[i];
        }
        int pos = 4;
        for (int i = nums.length - 4; i >= 0; i--) {
            arr[hm.get(nums[i])] = String.valueOf(pos);
            pos++;
        }
        return arr;
    }
}
