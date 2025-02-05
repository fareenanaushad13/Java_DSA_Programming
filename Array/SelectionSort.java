import java.util.*;

//Time Coplexity O(n^2)
public class SelectionSort {
    public static void selectionSort(int arr[]) {
        for (int i = 0; i < arr.length - 1; i++) {
            int minpos = i;

            for (int j = i + 1; j < arr.length; j++) {
                if (arr[minpos] < arr[j]) { //descending order
                    minpos = j;
                }
            }
            // Swap
            int temp = arr[minpos];
            arr[minpos] = arr[i];
            arr[i] = temp;
        }
    }

    public static void printArr(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String args[]) {
        int arr[] = {9, 17, 56, 33, 2};
        selectionSort(arr); 
        printArr(arr);
    }
}
