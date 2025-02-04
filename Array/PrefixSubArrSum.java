import java.util.*;

//Time Complexity O(n^2)
public class PrefixSubArrSum {
    public static void maxSubArraySum(int numbers[]) {
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;
        int prefix[] = new int[numbers.length];

       
        prefix[0] = numbers[0];
        for (int i = 1; i < prefix.length; i++) {
            prefix[i] = prefix[i - 1] + numbers[i];
        }

       
        for (int i = 0; i < numbers.length; i++) {  
            for (int j = i; j < numbers.length; j++) { 
                int end = j;
                currSum = (i == 0) ? prefix[end] : prefix[end] - prefix[i - 1];  
                
                if (maxSum < currSum) { 
                    maxSum = currSum;
                }
            }
        }

        System.out.println("Max Sum = " + maxSum);
    }

    public static void main(String args[]) {
        int numbers[] = {4, 6, 7, 3, 6, 1, 13, 16, 5};
        maxSubArraySum(numbers);
    }
}
