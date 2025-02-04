import java.util.*;

public class SmallestNum {
    public static int getSmallest(int numbers[]) {
        int smallest = Integer.MAX_VALUE;
        for(int i=0;i<numbers.length;i++){
            if(smallest > numbers[i]){
                smallest = numbers[i];
            }
        }
        return smallest;
    }
     public static void main(String args[]) {
        int numbers[] = {1,2,3,6,8,13,14,31,36};


        System.out.println("Smallest Value is: " + getSmallest(numbers));
     }
}