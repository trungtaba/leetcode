//https://leetcode.com/explore/featured/card/top-interview-questions-easy/127/strings/884/

class Solution {

    public int myAtoi(String str) {
        int result = 0;
        String s = "";
        char[] chars = str.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (isValid(chars[i])) {
                //System.out.println("is valid");
                if (chars[i]=='-') {
                    if(s.length()!=0) break;
                    if(i!=chars.length-1 && isNum(chars[i+1])){
                        s = "-";
                    }else break;
                    
                }
                if (chars[i]=='+') {
                    if(s.length()!=0) break;
                    if(i!=chars.length-1 && isNum(chars[i+1])){
                        s = "+";
                    }else break;
                    
                }
                if (isNum(chars[i])) {
                    s += chars[i];
                }
            }else if(chars[i]==' '){
                if(s.length()!=0) break;
                continue;
            }else break;

        }
        if (s.length() == 0 || s.equalsIgnoreCase("-")) {
            return 0;
        }
        if (Math.abs(Double.parseDouble(s)) > Integer.MAX_VALUE) {
            if (s.startsWith("-")) {
                return Integer.MIN_VALUE;
            } else {
                return Integer.MAX_VALUE;
            }
        }

        return Integer.parseInt(s);

    }

    public boolean isNum(char a) {
        return a >= '0' && a <= '9';
    }

    public boolean isValid(char a) {
        return isNum(a) || (a == '-')||(a=='+');
    }
}




