//https://leetcode.com/explore/featured/card/top-interview-questions-easy/102/math/743/
import java.util.ArrayList;
import java.util.List;

class Solution {
   public List<String> fizzBuzz(int n) {
        List<String> result=new ArrayList<>();
        for(int i=1;i<=n;i++){
            String tmp="";
            if(i%3==0){
                tmp="Fizz";
            }
            
            if(i%5==0){
                tmp+="Buzz";
            }
            if(tmp.length()==0){
                tmp=i+"";
            }
            result.add(tmp);
        }
        return result;
    }
}