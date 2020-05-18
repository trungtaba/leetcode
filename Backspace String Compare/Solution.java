import java.util.Stack;

//https://leetcode.com/problems/backspace-string-compare/

class Solution {
    public boolean backspaceCompare(String S, String T) {
        String s=helper(S);
        String t=helper(T);
        return s.equals(t);
    }

    private String helper(String str){
        Stack<Character> stack=new Stack<>();
        for(char c: str.toCharArray()){
            if(c!='#') stack.push(c);
            else if (!stack.isEmpty()) stack.pop();
        }
        return String.valueOf(stack);
    }
}