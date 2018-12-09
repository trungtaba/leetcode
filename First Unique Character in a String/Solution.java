//https://leetcode.com/explore/featured/card/top-interview-questions-easy/127/strings/881/
import java.util.HashMap;

class Solution {
    public int firstUniqChar(String s) {
        HashMap<Character,Integer> map=new HashMap<>();
        char[]chars=s.toCharArray();
        for(char c: chars){
            if(!map.containsKey(c)){
                map.put(c, 1);
            }else{
                map.replace(c, map.get(c)+1);
            }
        }
        int result=-1;
        for(int i=0;i<chars.length;i++){
            if(map.get(chars[i])==1){
                result=i; break;
            }
        }
        return result;
    }
}