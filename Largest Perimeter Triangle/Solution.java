import java.util.Arrays;

//https://leetcode.com/problems/largest-perimeter-triangle/

class Solution {
    boolean canTriangle(int a, int b, int c){
        return (a+b)>c;
    }
    public int largestPerimeter(int[] A) {
        Arrays.sort(A);
        int n=A.length-3;
        int a=A[n];
        int b=A[n+1];
        int c=A[n+2];

        while(!canTriangle(a, b, c)){
            //  a b c
            //a b c
            c=b;
            b=a;
            a=A[--n];
        }

        if(n<0) return 0;
        else return (a+b+c);
    }
}