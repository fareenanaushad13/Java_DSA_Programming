//Time Complexity: O(n^2)
public class CountEqualAndDivisiblePairs {
    public static int countPairs(int nums[], int k){
        int count = 0;
        int n = nums.length;

        for(int i = 0; i< n ;i ++){
            for(int j = i+1 ; j< n ;j++){
                if(nums[i] == nums[j] && (i * j) % k == 0){
                    count ++;
                }
            }
        }
        return count;
    }
    public static void main(String[] args) {
        //Dry Run
        //n = 7
        //k = 2
        //index(0,6)-->  nums[0] = 3, nums[6] = 3 //same 
        //&& 0 * 6 = 0, and 0 % 2 == 0 //valid

        //index(2,3) -->  nums[2] = nums[3] = 2 //same
        //&& 2 * 3 = 6 , and 6 % 2 == 0 //valid

        //index(2,4) --> nums[2] = nums[4] = 2
        // && 2 * 4 = 8, 8 % 2 == 0 

        //index (3,4) --> nums[3] = nums[4] = 2
        //&& 3 * 4 = 12 , and 12 % 2 == 0 //valid
        
        //So 4 valid pairs

        int nums[] = {3,1,2,2,2,1,3}; 
        int k = 2;
        System.out.println(countPairs(nums,k)); //output----> 4

        //Dry Run
        //n = 4
        //k =1
        //No two values in nums are the same.
        //So nums[i] == nums[j] is never true.
        //Therefore, count remains 0.
        
        int[] nums1 = {1, 2, 3, 4}; 
        int k1 = 1;
        System.out.println(countPairs(nums1,k1)); //output --- >0
    }
}