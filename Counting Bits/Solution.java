//https://leetcode.com/problems/counting-bits/

class Solution {
public int[] countBits(int num) { 
        int[]result=new int[num+1];
        result[0]=0;
        int nextPower=1;
        for(int i=1;i<=num;i++){
            if(i==nextPower){
                nextPower*=2;
            }
            result[i]=result[i-nextPower/2]+1;
        }
        return result;
    }
}