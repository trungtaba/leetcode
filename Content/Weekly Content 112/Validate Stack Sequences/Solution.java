//https://leetcode.com/contest/weekly-contest-112/problems/validate-stack-sequences/
import java.util.Stack;

class Solution {
    public boolean validateStackSequences(int[] pushed, int[] popped) {
        Stack<Integer> stack=new Stack<>();
        int index=0;
        for(int i=0;i<pushed.length;i++){
            if(pushed[i]!=popped[index]){
                stack.add(pushed[i]);
            }else{
                index++;
                while(!stack.empty() && stack.peek()==popped[index]){
                    index++;
                    stack.pop();
                }
            }
        }
        
        for(int i=index;i<popped.length;i++){
            if(!stack.empty()){
                int pop=stack.pop();
                if(pop!=popped[index]){
                    return false;
                }else{
                    index++;
                }
            }
        }
        
        return stack.empty();
    }
}