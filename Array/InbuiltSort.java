import java.util.*;
public class InbuiltSort{
    public static void main(String args[]){
        int arr[] = {5,-3,6,7,-500,700};
        System.out.println("The original array");
        for(int num:arr){
            System.out.print(num+ " ");
        }
        Arrays.sort(arr);
        System.out.println("\n Sorted Array is:");
        for(int num:arr){
            System.out.print(num+" ");
        }
    }
}