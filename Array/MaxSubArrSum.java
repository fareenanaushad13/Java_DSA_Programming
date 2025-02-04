import java.util.*;

//Time Complexity O(n^3)
public class MaxSubArrSum {
    public static void maxSubArraySum(int numbers[]) {
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;
        
        for (int i = 0; i < numbers.length; i++) {
            int start = i;
            for (int j = i; j < numbers.length; j++) {
                int end = j;
                currSum = 0; 
                for (int k = start; k <= end; k++) { 
                    currSum += numbers[k];
                }

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