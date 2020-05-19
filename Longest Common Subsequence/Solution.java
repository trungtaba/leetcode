import java.util.HashMap;

//https://leetcode.com/problems/longest-common-subsequence/

class Solution {
    public int longestCommonSubsequence(String text1, String text2) {
        int m=text1.length(), n= text2.length();
        char[] char1=text1.toCharArray(), char2=text2.toCharArray();

        int[][]dp=new int[m][n];
        for(int i=0;i<m;i++) dp[i][0]=0;
        for(int i=0;i<n;i++) dp[0][i]=0;
        for(int i=1;i<m;i++){
            for(int j=1;j<n;j++){
                if(char1[i]==char2[j]){
                    dp[i][j]=dp[i-1][j-1]+1;
                }else{
                    dp[i][j]=Math.max(dp[i-1][j], dp[i][j-1]);
                }
            }
        }
        return dp[m-1][n-1];
    }
}