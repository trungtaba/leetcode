import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<Integer> diffWaysToCompute(String input) {
        List<Integer> result=new ArrayList<>();

        for(int i=0;i<input.length();i++){
            char c= input.charAt(i);
            if(c =='+'||c=='-'||c=='*'){
                String left=input.substring(0,i);
                String right=input.substring(i+1);
                List<Integer> leftResult=diffWaysToCompute(left);
                List<Integer> rightResult=diffWaysToCompute(right);

                for(int l: leftResult){
                    for(int r:rightResult){
                        if(c=='+'){
                            result.add(l+r);
                        }else if (c=='-'){
                            result.add(l-r);
                        }else{
                            result.add(l*r);
                        }
                    }
                }
            }
        }
        if(result.size()==0){
            result.add(Integer.valueOf(input));
        }

        return result;
    }
}