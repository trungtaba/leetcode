//https://leetcode.com/explore/featured/card/top-interview-questions-easy/99/others/565/

public class Solution {
    public int hammingDistance(int x, int y) {
        int tmp=x^y;
        return hammingWeight(tmp);
    }
    
    public int hammingWeight(int n) {
        int count = 0;
        for(int i=1; i<33; i++){
            if(getBit(n, i) == true){
                count++;
            }
        }
        return count;
    }

    public boolean getBit(int n, int i){
        return (n & (1 << i)) != 0;
    }
}