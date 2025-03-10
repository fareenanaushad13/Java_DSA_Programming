import java.util.*;
public class MaxProfit{
    public static int maxProfit(int prices[]){
        int buy = prices[0];
        int profit = 0;

        for(int i=1;i<prices.length;i++){
            if(buy<prices[i]){
                profit = Math.max(prices[i] - buy, profit);
            }
            else{
                buy = prices[i];
            }
        }
        return profit;
    }
    public static void main(String args[]){
        int prices[] = {3,5,6,7,3,1,2,9,8};
        System.out.println("Maximum Profit:"+maxProfit(prices));
    }
}