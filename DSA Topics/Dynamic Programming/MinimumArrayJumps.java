import java.util.Arrays;
//Time Complexity: O(n^2)

public class MinimumArrayJumps {

    public static void print(int dp[]){ //print DP
        for(int i=0; i<dp.length; i++){
            System.out.print(dp[i] + " ");
        }
        System.out.println();
    }

    public static int minJumps(int nums[]){
        int n = nums.length;
        int dp[] =  new int[n];
        Arrays.fill(dp,-1);
        dp[n-1] = 0;
        
        for(int i=n-2;i>=0;i--){
            int steps = nums[i];
            int ans = Integer.MAX_VALUE;
            for(int j=i+1;j<=i+steps && j<n ; j++){
                if(dp[j] != -1){
                    ans = Math.min(ans, dp[j]+1);
                }
            }
            if(ans != Integer.MAX_VALUE){
                dp[i] = ans;
            }
        }
        print(dp);
        return dp[0];

    }
    public static void main(String[] args) {
        int nums[] = {3,6,1,1,7,3,6,1};
        System.out.println(minJumps(nums));
    }
}
