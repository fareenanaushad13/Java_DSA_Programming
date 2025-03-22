// similar to Fibonacci but Tribonacci is the sum of the three preceding terms

//Time Complexity: O(n)
public class TribonacciNumber {  
    static void printTrib(int n){
        int dp[] = new int[n];
        dp[0] = dp[1] = 0;
        dp[2] = 1;

        for(int i=3;i<n;i++){
            dp[i] = dp[i-1] + dp[i-2] + dp[i-3];
        }
            for(int i=0;i<n;i++){
                System.out.print(dp[i] + " ");
            }
        }
        public static void main(String[] args) {
            int n = 6;
            printTrib(n);
        }
    }

