import java.util.Arrays;
import java.util.Comparator;

public class FractionalKnapsack {
    public static void main(String args[]) {
        int val[] = {136, 361, 316};
        int weight[] = {13, 31, 36};
        int W = 66;

        double ratio[][] = new double[val.length][2];

        //0th col => idx
        //1st col => ratio
        for (int i = 0; i < val.length; i++) {
            ratio[i][0] = i; 
            ratio[i][1] = val[i] / (double) weight[i]; 
        }

       //ascending order
        Arrays.sort(ratio, Comparator.comparingDouble(o -> o[1]));

        int capacity = W;
        int finalVal = 0;

        //decsending
        for (int i = ratio.length - 1; i >= 0; i--) { 
            int idx = (int) ratio[i][0]; 

            if (capacity >= weight[idx]) {
                // Include full item
                finalVal += val[idx];
                capacity -= weight[idx];
            } else {
                // Include fractional item
                finalVal += (ratio[i][1] * capacity);
                capacity = 0;
                break;
            }
        }

        System.out.println("final value = " + finalVal);
    }
}
