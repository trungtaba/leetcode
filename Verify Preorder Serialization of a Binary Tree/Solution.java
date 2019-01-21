
import java.util.Stack;

class Solution {
    public boolean isValidSerialization(String preorder) {
        if(preorder==null){
            return false;
        }
        Stack<String> stack = new Stack<>();
        String[] strs = preorder.split(",");
        for(int i=0;i<strs.length;i++){
            String s=strs[i];
            while(s.equals("#") && !stack.isEmpty() && stack.peek().equals("#")){
                stack.pop();
                if(stack.isEmpty()) return false;
                stack.pop();
            }
            stack.push(s);
        }
        return stack.size() == 1 && stack.peek().equals("#");
    }
}