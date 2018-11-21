//https://leetcode.com/explore/featured/card/top-interview-questions-easy/127/strings/879/
class Solution {
    public String reverseString(String s) {
        StringBuilder sb = new StringBuilder();
        
        for(int i = s.length() - 1; i >= 0; i--)
        {
            sb.append(s.charAt(i));
        }
        return sb.toString();
    }
}