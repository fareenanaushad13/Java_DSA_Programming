import java.util.*;

public class LinearSearch {
    public static int linearSearch(int numbers[], int key) {
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == key) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String args[]) {
        int numbers[] = {1, 2, 3, 5, 6, 18, 113, 14, 37, 36};
        int key = 6;

        int index = linearSearch(numbers, key);
        if (index == -1) {
            System.out.println("key not found");
        } else {
            System.out.println("key is found at index: " + index);
        }
    }
}
