
import java.util.*;

//https://leetcode.com/problems/find-and-replace-pattern/

class Solution {
    public List<String> findAndReplacePattern(String[] words, String pattern) {
        List<String> result=new ArrayList<>();
        
        for(String word:words){
            boolean same=true;
            int[]p=new int[26];
            int[]s=new int[26];
            
            for(int i=0; i<word.length(); i++){
                if(s[word.charAt(i)-'a']!=p[pattern.charAt(i)-'a']){
                    same=false;
                    break;
                }else{
                    s[word.charAt(i)-'a']=p[pattern.charAt(i)-'a']=i+1;
                }
            }
            if(same)
                result.add(word);
        }
        return result;
    }
}