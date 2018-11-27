//https://leetcode.com/contest/weekly-contest-112/problems/minimum-increment-to-make-array-unique/
import java.util.Arrays;

class Solution {
    public int minIncrementForUnique(int[] A) {
        Arrays.sort(A);
        int result = 0;
        for (int i = 1; i < A.length; i++) {
            int pre = A[i - 1]; 
            int cur = A[i];
            if (pre >= cur) {
                result += pre - cur + 1;
                A[i] = pre + 1;
            }
        }
        return result;
    }
}