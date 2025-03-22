//time Complexity: O(n^2)

public class CatalansNumber {
    //Recursion ---> O(2^n)
    public static int catalanRec(int n){
        if(n == 0 || n ==1){
            return 1;
        }
        int ans = 0; //catalan of n
        for(int i=0;i<=n-1;i++){
            ans += catalanRec(i) * catalanRec(n-i-1);
        }
        return ans;
    }

    //Memoization ---> O(n^2)
    public static int catalanMemoization(int n, int dp[]){
        if(n == 0 || n ==1){
            return 1;
        }
        if(dp[n] != -1){
            return dp[n];
        }

        int ans = 0; 
        for(int i=0;i<n;i++){
            ans += catalanMemoization(i, dp) * catalanMemoization(n-i-1, dp);
        }
        return dp[n]= ans;

    }

    //Tabulation ---> O(n^2)
    public static int catalanTab(int n){
        int dp[] = new int[n+1];
        dp[0] = 1;
        dp[1] = 1;

        for(int i=2;i<=n;i++){
            for(int j=0;j<i;j++){
                dp[i] += dp[j] * dp[i-j-1]; //ci = cj * ci-j-1
            }
        }
        return dp[n];
    }


    public static void main(String[] args) {
        // int n = 5;
        //System.out.println(catalanRec(n)); //recursion

        // int dp[] =  new int[n+1];
        // Arrays.fill(dp, -1);
        // System.out.println(catalanMemoization(4, dp)); //Memoization

        System.out.println(catalanTab(6)); //Tabulation
    }
}