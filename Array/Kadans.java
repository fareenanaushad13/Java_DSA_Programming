import java.util.*;

//Time Complexity O(n)
public class Kadans {
    public static void kadans(int numbers[]) {
        int ms = Integer.MIN_VALUE;
        int cs = 0;

        for (int i = 0; i < numbers.length; i++) {
            cs = cs + numbers[i];
            if (cs < 0) {
                cs = 0;
            }
            ms = Math.max(cs, ms);
        }
        System.out.println("Our Max SubArray Sum: " + ms); 
    }

    public static void main(String args[]) {
        int numbers[] = {4, 6, 7, 3, 6, 1, 13, 16, 5};
        kadans(numbers);
    }
}
