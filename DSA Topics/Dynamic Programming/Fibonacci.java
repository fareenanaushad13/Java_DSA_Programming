//Time Complexity : O(n)
public class Fibonacci {

    //recursion //Time Complexity : O(2^n)
    public static int fib(int n, int f[]){
        if(n==0 || n==1){
            return n;
        }
        return fib(n-1, f) + fib(n-2, f);
    }
    
    //Memoization------ //O(n)
    public static int fibMemoization(int n, int f[]){
        if(n==0 || n==1){
            return n;
        }
        if(f[n] != 0){ //fib[n] is already calculated
            return f[n];
        }
        f[n] = fibMemoization(n-1, f) + fibMemoization(n-2 ,f);
        return f[n];
    }


    //Tabulation------ // O(n)
    public static int fibTabulation(int n){
        int dp[] =  new int [n+1];
        dp[1] = 1;
        for(int i=2;i<=n;i++){
            dp[i] = dp[i-1] + dp[i-2];
        }
        return dp[n]; //ans
    }

    public static void main(String[] args) {
        int n=5;
        int f[] = new int [n+1]; //0,0,0,0

        System.out.println(fib(n, f)); //recursion 

        System.out.println(fibMemoization(n, f)); 

        System.out.println(fibTabulation(n)); 

    }
}
