import java.util.Scanner;

//Time Complexity O(log(min(m, n)))
public class MedianOfTwoSortedArrays {
    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        if (nums1.length > nums2.length) {
            return findMedianSortedArrays(nums2, nums1); 
        }
        
        int m = nums1.length, n = nums2.length;
        int left = 0, right = m;
        
        while (left <= right) {
            int partitionX = (left + right) / 2;
            int partitionY = (m + n + 1) / 2 - partitionX;
            
            int maxLeftX = (partitionX == 0) ? Integer.MIN_VALUE : nums1[partitionX - 1];
            int minRightX = (partitionX == m) ? Integer.MAX_VALUE : nums1[partitionX];
            
            int maxLeftY = (partitionY == 0) ? Integer.MIN_VALUE : nums2[partitionY - 1];
            int minRightY = (partitionY == n) ? Integer.MAX_VALUE : nums2[partitionY];
            
            if (maxLeftX <= minRightY && maxLeftY <= minRightX) {
                if ((m + n) % 2 == 0) {
                    return (Math.max(maxLeftX, maxLeftY) + Math.min(minRightX, minRightY)) / 2.0;
                } else {
                    return Math.max(maxLeftX, maxLeftY);
                }
            } else if (maxLeftX > minRightY) {
                right = partitionX - 1;
            } else {
                left = partitionX + 1;
            }
        }
        
        return 0.0; 
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input first array
        System.out.print("Enter size of nums1: ");
        int m = scanner.nextInt();
        int[] nums1 = new int[m];
        System.out.println("Enter elements of nums1:");
        for (int i = 0; i < m; i++) {
            nums1[i] = scanner.nextInt();
        }

        // Input second array
        System.out.print("Enter size of nums2: ");
        int n = scanner.nextInt();
        int[] nums2 = new int[n];
        System.out.println("Enter elements of nums2:");
        for (int i = 0; i < n; i++) {
            nums2[i] = scanner.nextInt();
        }

        // Find and print median
        double median = findMedianSortedArrays(nums1, nums2);
        System.out.println("Median: " + median);

        scanner.close();
    }
}
