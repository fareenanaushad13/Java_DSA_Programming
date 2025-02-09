public class TransposeOfMatrix {
    public static void main(String args[]) {
        int row = 3, col = 3;  
        int matrix[][] = { 
            {3, 5, 6}, 
            {6, 7, 8}, 
            {3, 6, 1} 
        };

        System.out.println("Original Matrix:");
        printMatrix(matrix);

        // Transpose of matrix
        int[][] transpose = new int[col][row]; 
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                transpose[j][i] = matrix[i][j];  
            }
        }

        System.out.println("Transpose of Matrix:");
        printMatrix(transpose);
    }

    public static void printMatrix(int matrix[][]) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {  
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
