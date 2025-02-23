public class KthLargestOddNum {
    public static int kthOdd(int[] range, int k) {
        if (k <= 0) {
            return 0;
        }
        int L = range[0];
        int R = range[1];

        if (R % 2 != 0) {  //if R is odd
            int count = (R - L + 1) / 2;  // Count of odd numbers
            if (k > count) {
                return 0;
            } else {
                return (R - 2 * k + 2);
            }
        } else {  // If R is even
            int count = (R - L + 1) / 2;  // Count of odd numbers
            if (k > count) {
                return 0;
            } else {
                return (R - 2 * k + 1);
            }
        }
    }

    public static void main(String[] args) {
        int[] p = { -10, 10 };
        int k = 8;
        System.out.println(kthOdd(p, k)); 
    }
}
