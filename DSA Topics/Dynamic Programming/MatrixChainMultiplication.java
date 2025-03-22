public class MatrixChainMultiplication {
    //Recursion ----> O(2^n)
    public static int mcm(int arr[], int i, int j){
        if( i == j){
            return 0; //single matrix case
        }
        int mincost = Integer.MAX_VALUE;
        for(int k=i;k<=j-1;k++){
            int cost1 = mcm(arr, i,k); //Ai...Ak =>arr[i-1] x arr[k]
            int cost2 = mcm(arr, k+1, j); //Ai+1....Aj => arr[k] x arr[j]
            int cost3 = arr[i-1] * arr[k] * arr[j];
            int finalcost = cost1 + cost2 + cost3;
            mincost = Math.min(mincost, finalcost);
        }

        return mincost; 
    }

    //Memoization ---> O(n^2)
    public static int mcmMemoization(int arr[], int i, int j, int dp[][]){
        if( i == j){
            return 0; 
        }
        if(dp[i][j] != -1){
            return dp[i][j];
        }

        int mincost = Integer.MAX_VALUE;
        for(int k=i;k<=j-1;k++){
            int cost1 = mcmMemoization(arr, i,k,dp); 
            int cost2 = mcmMemoization(arr, k+1, j,dp); 
            int cost3 = arr[i-1] * arr[k] * arr[j];
            int finalcost = cost1 + cost2 + cost3;
            mincost = Math.min(mincost, finalcost);
        }

        return dp[i][j] = mincost; 
    }

    //Tabulation --- > O(n^3)
    public static int mcmTabulation(int arr[]){
        int n = arr.length;
        int dp[][] = new int[n][n];

        for(int i=0;i<n;i++){
            dp[i][i] = 0;
        }

        //bottom up
        for(int len=2;len<=n-1;len++){
            for(int i=1;i<=n-len;i++){
                int j = i+len-1; //col
                dp[i][j] = Integer.MAX_VALUE;
                for(int k=i;k<=j-1;k++){
                    int cost1 = dp[i][k];
                    int cost2 = dp[k+1][j];
                    int cost3 = arr[i-1] * arr[k] * arr[j];
                    dp[i][j] = Math.min(dp[i][j], cost1+cost2+cost3);
                }
            }
        }
        print(dp);
        return dp[1][n-1];
    }
    public static void print(int dp[][]){
        for(int i=0;i<dp.length;i++){
            for(int j=0;j<dp[0].length;j++){
                System.out.print(dp[i][j]+ " ");
            }
            System.err.println();
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,3}; // n=5
        System.out.println(mcmTabulation(arr));

        //System.out.println(mcm(arr, 1, n-1));//recursion

        // int dp[][] =  new int[n][n];
        // for(int i=0;i<n;i++){
        //     Arrays.fill(dp[i], -1);
        // }
        // System.out.println(mcmMemoization(arr, 1, n-1, dp)); //Memoization


    }
}
