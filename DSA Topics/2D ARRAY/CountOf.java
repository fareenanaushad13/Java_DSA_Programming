import java.util.*;
//Time Complexity: O(n^2)

public class CountOf{
    public static void main(String args[]){
        int array[][] = {{3,6,1},{3,3,7},{13,1,5}};
        int countof3 = 0;
        for(int i=0;i<array.length;i++){
            for(int j=0;j<array[0].length;j++){
                if(array[i][j] == 3){
                    countof3++;
                }
            }
        }
        System.out.println("Count of 3 is:" + countof3);
    }
}