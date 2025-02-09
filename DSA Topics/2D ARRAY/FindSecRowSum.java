import java.util.*;

//Time Complexity: O(n^2)
public class FindSecRowSum{
    public static void main(String args[]){
        int nums[][] = {{3,6,1},{6,7,5},{14,13,1}};
        int sum = 0;
        for(int j=0;j<nums[0].length;j++){
            sum += nums[1][j];
        }
        System.out.println("Sum is:" +sum);
    }
}