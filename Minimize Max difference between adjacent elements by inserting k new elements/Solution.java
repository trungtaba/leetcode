class Solution {
    public static int minimizedMaxDiff(int arr[], int n, int k) {
        int worst = Integer.MIN_VALUE;
        for (int i = 0; i < n - 1; i++)
            worst = Math.max(worst, Math.abs(arr[i] - arr[i + 1]));
        if (worst == 0)
            return 0;
        int best = 1;
        int mid, required;

        while (best < worst) {
            mid = (best + worst) / 2;
            required = 0;

            for (int i = 0; i < n - 1; i++) {

                required += (Math.abs(arr[i] - arr[i + 1]) - 1) / mid;
            }
            if (required > k)
                best = mid + 1;
            else
                worst = mid;
        }
        return worst;
    }
}