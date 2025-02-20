import java.util.*;
//Time Complexity: O(nlogn)
public class MinAbsoluteDiffPair{
    public static void main(String args[]){
        int A[] ={3,6,1};
        int B[] ={3,6,1};
        Arrays.sort(A);
        Arrays.sort(B);
        
        int minDiff = 0;
        for(int i=0;i<A.length;i++){
            minDiff += Math.abs(A[i]-B[i]);
        }
        System.out.println("min Absolute Differnce of pais:" + minDiff);
    }
}