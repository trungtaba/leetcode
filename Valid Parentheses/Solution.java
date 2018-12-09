//https://leetcode.com/explore/featured/card/top-interview-questions-easy/99/others/721/

class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
            
            for(char c : s.toCharArray())
            {
                if(c == '(')
                    stack.push(')');
                else if(c == '{')
                    stack.push('}');
                else if(c == '[')
                    stack.push(']');
                
                else{
                    if( stack.isEmpty() || c != stack.peek()){
                        return false;   
                    }
                    else{
                        stack.pop();
                    }
                }
            }
            if(stack.isEmpty())
                return true;
            else
                return false;
        
    }
}