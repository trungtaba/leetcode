//https://leetcode.com/explore/featured/card/top-interview-questions-easy/102/math/745/
class Solution {
    public boolean isPowerOfThree(int n) {
        while(n>=3){
            if(n%3!=0){
                return false;
            }
            n=n/3;
        }
        
        if(n==1)return true;
        return false;
    }

    public boolean isPowerOfThree(int n) {
        if(n==0) return false;
 
        return n == Math.pow(3, Math.round(Math.log(n)/Math.log(3)));
    }
}