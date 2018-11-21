//https://leetcode.com/explore/featured/card/top-interview-questions-easy/127/strings/880/
class Solution {
    public int reverse(int x) {
        String s="";
        if(Math.abs(x*1.0)>Integer.MAX_VALUE){
            return 0;
        }
        int value=Math.abs(x);
        do{
            s+=value%10;
            value=value/10;
        }while(value>0);
        if(Long.parseLong(s)>Integer.MAX_VALUE){
            return 0;
        }
        int result=Integer.parseInt(s);
        if(x<0){
            result=-result;
        }
        return result;
    }
}