//https://leetcode.com/problems/counting-bits/

class Solution {
    public int[] countBits(int num) {
        int[]result=new int[num+1];
        for(int i=0;i<=num;i++){
            result[i]=countBit(i);
        }
        return result;
    }
    
    int countBit(int num){
        int count=0;
        while(num>0){
            count+=num%2;
            num/=2;
        }
        return count;
    }
}