//https://leetcode.com/submissions/detail/190618820/
class Solution {
    public int[] diStringMatch(String S) {
        int length=S.length();
        int[]array=new int[length+1];
        int currentI=0;
        int currentD=length;
        for(int i=0;i<length;i++){
            switch(S.charAt(i)){
                case 'I':
                    array[i]=currentI++; break;
                case 'D':
                    array[i]=currentD--; break;
            }
            array[length]=currentI;
        }
        return array;
    }
}