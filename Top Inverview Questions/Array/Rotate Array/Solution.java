//https://leetcode.com/explore/featured/card/top-interview-questions-easy/92/array/646/
class Solution {
    public void rotate(int[] nums, int k) {
        int counter = 0;
        while ( counter < k )
        {
            int temp = nums[nums.length - 1];
            for ( int i = nums.length - 1; i > 0; i-- )
            {
                nums[i] = nums[i - 1];
            }
            nums[0] = temp;
            counter++;
        }
    }
}