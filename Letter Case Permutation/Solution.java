
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

//https://leetcode.com/problems/letter-case-permutation/

class Solution {
    public List<String> letterCasePermutation(String S) {
        if (S == null) {
            return new LinkedList<>();
        }
        
        List<String> res = new LinkedList<>();
        helper(S.toCharArray(), res, 0);
        return res;
    }
    
    void helper(char [] chars,List<String> res, int i){
        if(i==chars.length){
            res.add(new String(chars));
            return;
        }
        
        if(chars[i] >= '0' && chars[i] <= '9'){
            helper(chars, res, i+1);
            return;
        }
        
        chars[i]=Character.toLowerCase(chars[i]);
        helper(chars, res, i+1);
        
        chars[i]=Character.toUpperCase(chars[i]);
        helper(chars, res, i+1);
    }
    
    
}