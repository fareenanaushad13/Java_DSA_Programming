import java.util.*;
public class TrappingRainwater{
    public static int trappedRainWater(int height[]){
        int n = height.length;
        //calculate leftMax boundary
        int leftMax[] = new int[n];
        leftMax[0] = height[0];
        for(int i=1;i<n;i++){
            leftMax[i] = Math.max(height[i],leftMax[i-1]);
        }
        //calculate rightmax boundary
        int rightMax[] = new int[n];
        rightMax[n-1] = height[n-1];
        for(int i=n-2;i>=0;i--){
            rightMax[i] = Math.max(height[i],rightMax[i+1]);
        }
        int trappedwater = 0;
        for(int i=0;i<n;i++){
            int waterLevel = Math.min(leftMax[i],rightMax[i]);
            trappedwater += waterLevel-height[i];
        }
        return trappedwater;
    }
    public static void main(String args[]){
        int height[] = {4,7,8,1,6,0,9,3,8,5};
        System.out.println(trappedRainWater(height));
    }
}