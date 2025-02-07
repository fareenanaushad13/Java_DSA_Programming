import java.util.*;

//Time Complexity= O(n)
public class ContainDuplicate {
    public boolean containDuplicate(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < nums.length; i++) { 
            if (set.contains(nums[i])) {
                return true;
            } else {
                set.add(nums[i]);
            }
        }
        return false;
    }

    public static void main(String args[]) { 
        int nums[] = {3, 4, 5, 6, 3};
        
        
        ContainDuplicate obj = new ContainDuplicate();
        System.out.println("The array contains duplicates: " + obj.containDuplicate(nums));
    }
}
