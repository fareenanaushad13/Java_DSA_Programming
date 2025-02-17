import java.util.ArrayList;
import java.util.List;

public class RatMaze {

    public static void main(String[] args) {
        int[][] maze = {
            {1, 0, 0, 0},
            {1, 1, 0, 1},
            {0, 1, 0, 0},
            {1, 1, 1, 1}
        };
        int n = maze.length;

        List<String> paths = findPaths(maze, n);

        if (paths.isEmpty()) {
            System.out.println("No paths found");
        } else {
            System.out.println("All possible paths:");
            for (String path : paths) {
                System.out.println(path);
            }
        }
    }

    public static List<String> findPaths(int[][] maze, int n) {
        List<String> result = new ArrayList<>();
        if (maze[0][0] == 0 || maze[n - 1][n - 1] == 0) {
            return result; 
        }

        boolean[][] visited = new boolean[n][n];
        findPathsUtil(maze, n, 0, 0, "", visited, result);
        return result;
    }

    private static void findPathsUtil(int[][] maze, int n, int x, int y, String path, boolean[][] visited, List<String> result) {
        // Base case: Reached the destination
        if (x == n - 1 && y == n - 1) {
            result.add(path);
            return;
        }

        // Mark the current cell as visited
        visited[x][y] = true;

        // Explore all four directions
        if (isSafe(maze, n, x + 1, y, visited)) {
            findPathsUtil(maze, n, x + 1, y, path + "D", visited, result);
        }

      
        if (isSafe(maze, n, x - 1, y, visited)) {
            findPathsUtil(maze, n, x - 1, y, path + "U", visited, result);
        }

     
        if (isSafe(maze, n, x, y + 1, visited)) {
            findPathsUtil(maze, n, x, y + 1, path + "R", visited, result);
        }

      
        if (isSafe(maze, n, x, y - 1, visited)) {
            findPathsUtil(maze, n, x, y - 1, path + "L", visited, result);
        }

        
        visited[x][y] = false;
    }

    private static boolean isSafe(int[][] maze, int n, int x, int y, boolean[][] visited) {
        return (x >= 0 && x < n && y >= 0 && y < n && maze[x][y] == 1 && !visited[x][y]);
    }
}
