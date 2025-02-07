import java.util.*;

public class LargestNum {
    public static int getLargest(int numbers[]) {
        int largest = Integer.MIN_VALUE;
        for(int i=0;i<numbers.length;i++){
            if(largest<numbers[i]){
                largest = numbers[i];
            }
        }
        return largest;
    }
     public static void main(String args[]) {
        int numbers[] = {1,2,3,6,8,13,14,31,36};


        System.out.println("Largest Value is: " + getLargest(numbers));
     }
}