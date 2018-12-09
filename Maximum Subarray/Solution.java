//https://leetcode.com/explore/interview/card/top-interview-questions-easy/97/dynamic-programming/566/

class Solution {
    public int maxSubArray(int[] a) {
        int [] solution = new int[a.length+1];
        solution[0] = 0;
        int max=a[0];

        for (int j = 1; j <=a.length ; j++) {
            solution[j] = Math.max(solution[j-1]+a[j-1],a[j-1]);
            if(max<solution[j]){
                max=solution[j];
            }
        }


        return max;
    }
}