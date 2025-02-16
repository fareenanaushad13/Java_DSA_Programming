public class Sudoku {
    public static boolean isSafe(int sudoku[][], int row, int col, int digit) {
        // Check if the digit is already present in the column
        for (int i = 0; i < 9; i++) {
            if (sudoku[i][col] == digit) {
                return false;
            }
        }
        // Check if the digit is already present in the row
        for (int j = 0; j < 9; j++) {
            if (sudoku[row][j] == digit) {
                return false;
            }
        }
        // Check if the digit is already present in the 3x3 sub-grid
        int sr = (row / 3) * 3;
        int sc = (col / 3) * 3;
        for (int i = sr; i < sr + 3; i++) {
            for (int j = sc; j < sc + 3; j++) {
                if (sudoku[i][j] == digit) {
                    return false;
                }
            }
        }
        return true;
    }

    public static boolean sudokuSolver(int sudoku[][], int row, int col) {
        // Base case: If we have reached row 9, the Sudoku is solved
        if (row == 9) {
            return true;
        }
        //recursion
        // Move to the next column, if last column then move to the next row
        int nextRow = row, nexCol = col + 1;
        if (col + 1 == 9) {
            nextRow = row + 1;
            nexCol = 0;
        }
        // If the cell is already filled, move to the next cell
        if (sudoku[row][col] != 0) {
            return sudokuSolver(sudoku, nextRow, nexCol);
        }
        // Try placing digits 1-9 in the empty cell
        for (int digit = 1; digit <= 9; digit++) {
            if (isSafe(sudoku, row, col, digit)) {
                sudoku[row][col] = digit;
                // If the solution works, return true
                if (sudokuSolver(sudoku, nextRow, nexCol)) {
                    return true;
                }
                // If not, backtrack
                sudoku[row][col] = 0;
            }
        }
        return false;
    }

    public static void printSudoku(int sudoku[][]) {
        // Print the Sudoku grid
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                System.out.print(sudoku[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int sudoku[][] = {
                { 0, 0, 8, 0, 0, 0, 0, 0, 0 },
                { 4, 9, 0, 1, 5, 7, 0, 0, 2 },
                { 0, 0, 3, 0, 0, 4, 1, 9, 0 },
                { 1, 8, 5, 0, 6, 0, 0, 2, 0 },
                { 0, 0, 0, 0, 2, 0, 0, 6, 0 },
                { 9, 6, 0, 4, 0, 5, 3, 0, 0 },
                { 0, 3, 0, 0, 7, 2, 0, 0, 4 },
                { 0, 4, 9, 0, 3, 0, 0, 5, 7 },
                { 8, 2, 7, 0, 0, 9, 0, 1, 3 }
        };
        if (sudokuSolver(sudoku, 0, 0)) {
            System.out.println("Solution Exists");
            printSudoku(sudoku);
        } else {
            System.out.println("Sudoku does not exist");
        }
    }
}
