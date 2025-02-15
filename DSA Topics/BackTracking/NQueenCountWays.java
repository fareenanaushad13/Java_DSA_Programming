//Time Complexity: O(n!)
public class NQueenCountWays {
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
    public static void nQueens(char board[][], int row) {
        // Base case
        if (row == board.length) {
            count++;
            return;
        }
        // Column loop
        for (int j = 0; j < board.length; j++) {
            if (isSafe(board, row, j)) { // Check safety before placing
                board[row][j] = 'Q';
                nQueens(board, row + 1); // Recursive call
                board[row][j] = 'X'; // Backtracking
            }
        }
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
    static int count = 0;
    public static void main(String args[]) {
        int n = 5; 
        char board[][] = new char[n][n];
        // Initialize board
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                board[i][j] = 'X';
            }
        }
        nQueens(board, 0);
        System.out.println("Total Ways to solve nQueens=" + count);
    }
}
