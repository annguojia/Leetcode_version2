package guojia.target.google;

/**
 * Created by ann on 12/24/16.
 */
public class IslandPerimeter {
    public int islandPerimeter(int[][] grid) {
        int res = 0;
        int commonEdge = 0;
        if (grid == null || grid.length == 0 || grid[0].length == 0) {
            return 0;
        }
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == 1) {
                    res++;
                    if (i + 1 < grid.length && grid[i + 1][j] == 1) {
                        commonEdge++;
                    }
                    if (j + 1 < grid[0].length && grid[i][j + 1] == 1) {
                        commonEdge++;
                    }
                }
            }
        }
        return res * 4 - 2 * commonEdge;
    }

    public static void main(String[] args) {

    }
}
