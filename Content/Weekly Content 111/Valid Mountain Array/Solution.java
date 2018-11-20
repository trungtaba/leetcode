
//https://leetcode.com/contest/weekly-contest-111/problems/valid-mountain-array/
class Solution {
    public static boolean validMountainArray(int[] A) {
        public boolean validMountainArray(int[] A) {
            if(A.length<3) return false;
           int i=0;
           while(i<A.length-1 && A[i+1]>A[i])i++;
           if(i==A.length-1||i==0) return false;
           //System.out.println(i);
           while(i<A.length-1 &&A[i+1]<A[i])i++;
           //System.out.println(i);
           if(i==A.length-1) return true;
           return false;
       }
    }
    public static void main(String[] args) {
        int[]A={9,8,7,6,5,4,3,2,1,0};
        System.out.println(validMountainArray(A));
    }
}