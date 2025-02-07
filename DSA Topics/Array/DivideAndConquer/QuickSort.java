import java.util.*;

//Time Complexity: O(n log n) on average, O(n^2) in the worst case
public class QuickSort {
    public static void printArr(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void quickSort(int arr[], int si, int ei) {
        if (si >= ei) {
            return;
        }
       
        int PIdx = partition(arr, si, ei);
        
       
        quickSort(arr, si, PIdx - 1); // Left part
        quickSort(arr, PIdx + 1, ei); // Right part
    }

    public static int partition(int arr[], int si, int ei) {
        int pivot = arr[ei]; // Choosing last element as pivot
        int i = si - 1; // Pointer for smaller elements

        for (int j = si; j < ei; j++) {
            if (arr[j] <= pivot) { 
                i++;
                
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
            }
        }

        i++;
        int temp = arr[ei];
        arr[ei] = arr[i];
        arr[i] = temp;

        return i; // Returning the pivot index
    }

    public static void main(String args[]) {
        int arr[] = {3, 6, 1, 7, 5, 24, 25, 6, 8, 15, 11};
        quickSort(arr, 0, arr.length - 1);
        printArr(arr);
    }
}
