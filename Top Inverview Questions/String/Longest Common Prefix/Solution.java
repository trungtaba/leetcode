//https://leetcode.com/explore/featured/card/top-interview-questions-easy/127/strings/887/
class Solution {
    public  String longestCommonPrefix(String[] strs) {
        String result = "";
        if (strs.length == 0) {
            return result;
        }
        int length = strs[0].length();
        for (String s : strs) {
            if (length > s.length()) {
                length = s.length();
            }
        }
        for (int i = 0; i < length; i++) {
            char c = strs[0].charAt(i);
            //System.out.println("c=" + c);
            boolean isSame = true;
            for (int j = 0; j < strs.length; j++) {
                //System.out.println("j=" + j + " value=" + strs[j].charAt(i));
                if (strs[j].charAt(i) != c) {
                    isSame = false;
                    break;
                }
            }
            if (isSame) {
                result += c;
            }else break;
        }
        //System.out.println(result);
        return result;
    }

}