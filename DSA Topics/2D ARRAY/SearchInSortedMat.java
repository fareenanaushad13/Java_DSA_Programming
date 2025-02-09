import java.util.*;
public class SearchInSortedMat{
    public static boolean staircaseSearch(int matrix[][], int key){
        int row = 0, col = matrix[0].length-1;
        while(row<matrix.length && col>=0){
            if(matrix[row][col] == key){
                System.out.println("Found key at("+ row+"," + col + ")");
                return true;
            }else if(key<matrix[row][col]){
                col--;
            }
            else{
                row++;
            }
        }
        System.out.println("key not found!");
        return false;
    }
    public static void main(String args[]){
        int matrix[][] = {{1,3,6,7},{13,5,14,26},{16,20,30,40},{50,60,70,80}};
        int key = 60;
        staircaseSearch(matrix,key);
    }
}