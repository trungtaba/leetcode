class Solution {
    String[]chars={"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
    List<String> result;
    public List<String> letterCombinations(String digits) {
         if(digits==null || digits.length()==0) return new ArrayList<>();
        int[] nums=new int[digits.length()];
        for(int i=0;i<digits.length();i++){
            nums[i]= Integer.parseInt(String.valueOf(digits.charAt(i))) ;
        }
        result=new ArrayList<>();
        helper(nums,"",0);
        return result;
    }

    private void helper(int[] nums, String currenString, int currentLevel){
        if(currentLevel==nums.length){
            result.add(currenString);
            return;
        }

        for(int i=0;i< chars[nums[currentLevel]].length();i++){
            helper(nums, currenString+chars[nums[currentLevel]].charAt(i), currentLevel+1);
        }
    }
}