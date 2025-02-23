import java.util.Arrays;

public class LexicographicallySmallestString {
    public static char[] lexo_small(int n, int k) {
        char arr[] = new char[n];
        Arrays.fill(arr, 'a'); 
        k -= n; 

        for (int i = n - 1; i >= 0; i--) {
            int add = Math.min(25, k); 
            arr[i] = (char) ('a' + add);
            k -= add;
        }
        
        return arr;
    }

    public static void main(String[] args) {
         int n = 6, k = 36;
        char arr[] = lexo_small(n, k);
        System.out.println(new String(arr)); 
    }
}
