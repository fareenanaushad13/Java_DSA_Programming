import java.util.Arrays;

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
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,3}; // n=5
        int n = arr.length;

        //System.out.println(mcm(arr, 1, n-1));//recursion

        int dp[][] =  new int[n][n];
        for(int i=0;i<n;i++){
            Arrays.fill(dp[i], -1);
        }
        System.out.println(mcmMemoization(arr, 1, n-1, dp)); //Memoization
    }
}
