
class Solution {

    public int maxTurbulenceSize(int[] A) {
        int[] dp = new int[A.length];
        dp[0] = 1;
        for (int i = 1; i < A.length; i++) {
            dp[i] = Math.max(dp[i - 1], maxTurbulence(A, i));
        }

        return dp[A.length - 1];
    }

    int maxTurbulence(int[] A, int n) {
        int result = 1;
        boolean check = A[n] > A[n - 1];
        int first, second;
        while (n >0) {
            first = A[n - 1];
            second = A[n];

            if ((check && A[n] <= A[n - 1]) || (!check && A[n] >= A[n - 1])) {
                break;
            }
            result++;
            check = !check;
            n--;
        }
        return result;
    }

    public static void main(String[] args) {
        int[]A={100};
        System.out.println(new Solution().maxTurbulenceSize(A));
    }
}
