public class SplitArrInKSubArr {
    public static int ans = Integer.MAX_VALUE;

    public static void solve(int a[], int n, int k, int index, int sum, int maxSum) {
        if (k == 1) {
            maxSum = Math.max(maxSum, sum);
            sum = 0;
            for (int i = index; i < n; i++) {
                sum += a[i];
            }
            maxSum = Math.max(maxSum, sum);
            ans = Math.min(ans, maxSum);
            return;
        }

        sum = 0;
        for (int i = index; i < n; i++) {
            sum += a[i];
            maxSum = Math.max(maxSum, sum);
            solve(a, n, k - 1, i + 1, 0, maxSum);
        }
    }

    public static void main(String args[]) {
        int arr[] = {1, 2, 3, 4};
        int k = 3;
        int n = arr.length;
        solve(arr, n, k, 0, 0, 0);
        System.out.println(ans);
    }
}
