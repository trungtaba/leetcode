import java.util.Stack;

//https://leetcode.com/problems/largest-rectangle-in-histogram/

class Solution {
    public int largestRectangleArea(int[] heights) {
        Stack<Integer> stack=new Stack<>();
        int max=0;
        int top=0;
        int areaWithTop=0;

        int i=0;
        while(i<heights.length){
            if(stack.isEmpty() || heights[i]>=heights[stack.peek()]){
                stack.push(i++);
            }else{
                top=stack.pop();
                areaWithTop=heights[top]*(stack.isEmpty()?i:i-stack.peek()-1);
                if(max<areaWithTop) max=areaWithTop;
            }
        }

        while(!stack.isEmpty()){
            top=stack.pop();
            areaWithTop=heights[top]*(stack.isEmpty()?i:i-stack.peek()-1);
            if(max<areaWithTop) max=areaWithTop;
        }

        return max;
    }


    public static void main(String[] args) {
        Solution s=new Solution();
        int[]heights={6, 2, 5, 4, 5, 1, 6};
        s.largestRectangleArea(heights);
    }
}