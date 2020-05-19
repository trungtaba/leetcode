//https://leetcode.com/problems/bitwise-and-of-numbers-range/
class Solution {
    public int rangeBitwiseAnd(int x, int y) {
        int res = 0; 
        while (x > 0 && y > 0) {  
            int msb_p1 = msbPos(x);  
            int msb_p2 = msbPos(y);  

            if (msb_p1 != msb_p2)  
                break;  
  
            int msb_val = (1 << msb_p1);  
            res = res + msb_val;  
            x = x - msb_val;  
            y = y - msb_val;  
        }  
  
        return res;  
    }

    private int msbPos(int n)  {  
        int msb = -1;  
        while (n > 0) {  
            n = n >> 1;  
            msb++;  
        }  
          
        return msb;  
    }  
}