public class PivoteIndex {
    public static int pivotIndex(int[] nums) {
        int totalSum = 0, leftSum = 0;

        for (int num : nums) {
            totalSum += num;
        }

        for (int i = 0; i < nums.length; i++) {
            if (leftSum == totalSum - leftSum - nums[i]) {
                return i;
            }
            leftSum += nums[i];
        }

        return -1;
    }

    public static void main(String[] args) {
        int[] nums1 = {1, 7, 3, 6, 5, 6};
        System.out.println("Pivot Index: " + pivotIndex(nums1));

        int[] nums2 = {1, 2, 3};
        System.out.println("Pivot Index: " + pivotIndex(nums2)); 

        int[] nums3 = {2, 1, -1};
        System.out.println("Pivot Index: " + pivotIndex(nums3)); 
    }
}
