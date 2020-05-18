import java.util.ArrayList;

class Solution {
    private List<List<Integer>> result;
    public List<List<Integer>> permute(int[] nums) {
        if(nums==0)return new ArrayList<>();
        result=new ArrayList<>();
        helper(nums,0);
        return result;
    }
    private void helper(int[]nums, int start){
        if(start==nums.length){
            List<Element> list = Arrays.asList(nums);
            result.add(list);
        }
        for(int i=star;i<nums.length;i++){
            
        }
    }
}