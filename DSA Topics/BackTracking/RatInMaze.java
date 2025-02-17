import java.util.Arrays;
//Time Complexity: O(n^2)
public class RatInMaze {
    public static boolean solveMazeUtil(int[][] maze, int x, int y, int[][] sol) {
        
        if (x == maze.length - 1 && y == maze[0].length - 1 && maze[x][y] == 1) {
            sol[x][y] = 1;
            return true;
        }

        // Check if the current cell is valid and not visited
        if (x >= 0 && y >= 0 && x < maze.length && y < maze[0].length && maze[x][y] == 1 && sol[x][y] == 0) {
            // Mark the current cell
            sol[x][y] = 1;

            // Recursively explore the 4 possible directions
            if (solveMazeUtil(maze, x + 1, y, sol)) {
                return true;
            }
            if (solveMazeUtil(maze, x, y + 1, sol)) {
                return true;
            }
            if (solveMazeUtil(maze, x - 1, y, sol)) {
                return true;
            }
            if (solveMazeUtil(maze, x, y - 1, sol)) {
                return true;
            }

            // If none of the above movements work, backtrack and mark the cell as unvisited
            sol[x][y] = 0;
            return false;
        }

        return false;
    }

    public static void solveMaze(int[][] maze) {
        int N = maze.length;
        int[][] sol = new int[N][N];

        if (solveMazeUtil(maze, 0, 0, sol) == false) {
            System.out.print("Solution doesn't exist");
        } else {
            printSolution(sol);
        }
    }

    public static void printSolution(int[][] sol) {
        for (int[] row : sol) {
            System.out.println(Arrays.toString(row));
        }
    }

    public static void main(String[] args) {
        int maze[][] = {{1, 0, 1, 0},
                        {1, 1, 0, 1},
                        {0, 1, 0, 0},
                        {1, 1, 1, 1}};

        solveMaze(maze);
    }
}