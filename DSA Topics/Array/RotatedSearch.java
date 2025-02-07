import java.util.*;

public class RotatedSearch {
    public static int search(int nums[], int target) {
        int min = minSearch(nums);
        
        if (nums[min] <= target && target <= nums[nums.length - 1]) {
            return binarySearch(nums, min, nums.length - 1, target);
        } else {
            return binarySearch(nums, 0, min - 1, target);
        }
    }

    public static int binarySearch(int[] nums, int left, int right, int target) {
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] > target) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return -1;
    }

    public static int minSearch(int nums[]) {
        int left = 0;
        int right = nums.length - 1;

        while (left < right) {
            int mid = left + (right - left) / 2;

            if (mid > 0 && nums[mid - 1] > nums[mid]) {
                return mid;
            } else if (nums[left] <= nums[mid] && nums[mid] > nums[right]) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }
        return left;
    }

    public static void main(String args[]) {
        int nums[] = {4, 5, 6, 7, 0, 1, 2};
        int target = 7;
        System.out.println("Target found at index: " + search(nums, target));
    }
}
