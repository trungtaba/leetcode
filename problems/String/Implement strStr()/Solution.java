//https://leetcode.com/explore/featured/card/top-interview-questions-easy/127/strings/885/
class Solution {
    public int strStr(String haystack, String needle) {
        if(needle.length()==0 || needle.isEmpty()){
            return 0;
        }
        
        int l1=haystack.length();
        int l2=needle.length();
        if(l1<l2) {
            return -1;
        }
        for(int i=0;i<=l1-l2;i++){
            String tmp=haystack.substring(i, i+l2);
            if( tmp.equals(needle)) return i;
        }
        return -1;
    }
}