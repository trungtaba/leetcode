
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
	public int maximalRectangle(char matrix[][]) 
	{ 
        if(matrix.length==0) return 0;
        int M=matrix.length;
        int N=matrix[0].length;
        int[]bars=new int[N];
        int result=0;
        
        for(int i=0;i<M;i++){
            for(int j=0;j<N;j++){
                if(matrix[i][j]=='1') bars[j]+=1;
                else bars[j]=0;
            }
            result=Math.max(result, largestRectangleArea(bars));
        }
        return result;
    } 
} 
