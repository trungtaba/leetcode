//https://leetcode.com/explore/interview/card/top-interview-questions-easy/97/dynamic-programming/569/

class Solution {
    public int climbStairs(int n) {
        int[]result=new int[n+1];
        if(n==1){
            result[1]=1;
        }else if(n==2){
            result[2]=2;
        }else{
            result[1]=1;result[2]=2;
            for(int i=3;i<=n;i++)
                result[i]=result[i-1]+result[i-2];
        }
        return result[n];
    }
}