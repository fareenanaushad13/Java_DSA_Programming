import java.util.*;

public class FloodFill {
    public int[][] helper(int[][] image, int sr, int sc, int color, boolean vis[][], int orgCol) {
        if (sr < 0 || sc < 0 || sr >= image.length || sc >= image[0].length 
            || vis[sr][sc] || image[sr][sc] != orgCol) {
            return image;
        }

        vis[sr][sc] = true;
        image[sr][sc] = color;

        // left
        helper(image, sr, sc - 1, color, vis, orgCol);
        // right
        helper(image, sr, sc + 1, color, vis, orgCol);
        // up
        helper(image, sr - 1, sc, color, vis, orgCol);
        // down
        helper(image, sr + 1, sc, color, vis, orgCol);

        return image;
    }

    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        boolean vis[][] = new boolean[image.length][image[0].length];
        if (image[sr][sc] != color) { 
            helper(image, sr, sc, color, vis, image[sr][sc]);
        }
        return image;
    }

    public static void main(String args[]) {
        FloodFill obj = new FloodFill();
        int[][] image = {
            {1, 1, 1},
            {1, 1, 0},
            {1, 0, 1}
        };
        int sr = 1, sc = 1, color = 2;

        int[][] result = obj.floodFill(image, sr, sc, color);

        for (int[] row : result) {
            System.out.println(Arrays.toString(row));
        }
    }
}
