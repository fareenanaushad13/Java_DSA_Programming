import java.util.*;
public class PrintPair{
    public static void printPairs(int numbers[]){
        for(int i=0;i<numbers.length;i++){
            int curr = numbers[i];
            for(int j=i+1;j<numbers.length;j++){
               System.out.print("(" + curr + "," + numbers[j] + ") ");
            }
            System.out.println();
        }
    }
    public static void main(String args[]){
        int numbers[] = {23,6,4,7,3,2,1,24};
        printPairs(numbers);
    }
}