//https://leetcode.com/problems/longest-palindromic-subsequence/

class Solution {
    public int longestPalindromeSubseq(String s) {
        int length=s.length();
        if(s.endsWith(StringBuilder(s).reverse().toString())){
            return s.length();
        }

        int[][]dp=new int[length][length];
        for(int i=)
    }
}