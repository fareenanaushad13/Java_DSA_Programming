//Time Complexity: O(n!)
public class NQueenPrintOneSol {
    public static boolean isSafe(char board[][], int row, int col) {
        // Vertical up
        for (int i = row - 1; i >= 0; i--) {
            if (board[i][col] == 'Q') {
                return false;
            }
        }
        // Diagonal left up
        for (int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--) {
            if (board[i][j] == 'Q') {
                return false;
            }
        }
        // Diagonal right up
        for (int i = row - 1, j = col + 1; i >= 0 && j < board.length; i--, j++) {
            if (board[i][j] == 'Q') {
                return false;
            }
        }
        return true;
    }

    public static boolean nQueens(char board[][], int row) {
        // Base case: If all queens are placed
        if (row == board.length) {
            printBoard(board); // Print only one valid solution
            return true; // Stop recursion after finding one solution
        }
        // Column loop
        for (int j = 0; j < board.length; j++) {
            if (isSafe(board, row, j)) { // Check if placing queen is safe
                board[row][j] = 'Q';
                if (nQueens(board, row + 1)) { // Recursive call
                    return true; 
                }
                board[row][j] = 'X'; // Backtracking
            }
        }
        return false; // No valid placement found
    }

    public static void printBoard(char board[][]) {
        System.out.println("------------- Chess Board -------------");
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                System.out.print(board[i][j] + " "); 
            }
            System.out.println();
        }
    }

    public static void main(String args[]) {
        int n = 6; 
        char board[][] = new char[n][n];
        // Initialize board
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                board[i][j] = 'X';
            }
        }
        if (!nQueens(board, 0)) {
            System.out.println("No solution exists.");
        }
    }
}
