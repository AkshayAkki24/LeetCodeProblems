package LeetCodeProblems;

public class LongestVShapedDiagonal {

    public int longestVDiagonal(int[][] grid) {
        int m = grid.length, n = grid[0].length;
        
        // DP tables for 4 diagonals
        int[][] downRight = new int[m][n];
        int[][] downLeft = new int[m][n];
        int[][] upRight = new int[m][n];
        int[][] upLeft = new int[m][n];

        // Fill DP for downRight (↘) and downLeft (↙)
        for (int i = m - 1; i >= 0; i--) {
            for (int j = n - 1; j >= 0; j--) {
                if (grid[i][j] != 1) { 
                    downRight[i][j] = 1;
                }
                if (i + 1 < m && j + 1 < n && grid[i][j] != grid[i + 1][j + 1]) {
                    downRight[i][j] = 1 + downRight[i + 1][j + 1];
                }
            }
        }
        for (int i = m - 1; i >= 0; i--) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] != 1) {
                    downLeft[i][j] = 1;
                }
                if (i + 1 < m && j - 1 >= 0 && grid[i][j] != grid[i + 1][j - 1]) {
                    downLeft[i][j] = 1 + downLeft[i + 1][j - 1];
                }
            }
        }

        // Fill DP for upRight (↗) and upLeft (↖)
        for (int i = 0; i < m; i++) {
            for (int j = n - 1; j >= 0; j--) {
                if (grid[i][j] != 1) {
                    upRight[i][j] = 1;
                }
                if (i - 1 >= 0 && j + 1 < n && grid[i][j] != grid[i - 1][j + 1]) {
                    upRight[i][j] = 1 + upRight[i - 1][j + 1];
                }
            }
        }
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] != 1) {
                    upLeft[i][j] = 1;
                }
                if (i - 1 >= 0 && j - 1 >= 0 && grid[i][j] != grid[i - 1][j - 1]) {
                    upLeft[i][j] = 1 + upLeft[i - 1][j - 1];
                }
            }
        }

        int maxLen = 0;

        // Now check for each "1" cell
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] == 1) {
                    // longest straight diagonals
                    maxLen = Math.max(maxLen, downRight[i][j]);
                    maxLen = Math.max(maxLen, downLeft[i][j]);
                    maxLen = Math.max(maxLen, upRight[i][j]);
                    maxLen = Math.max(maxLen, upLeft[i][j]);

                    // combine for V-shapes (clockwise turn)
                    if (downRight[i][j] > 1 && downLeft[i][j] > 1) {
                        maxLen = Math.max(maxLen, downRight[i][j] + downLeft[i][j] - 1);
                    }
                    if (downRight[i][j] > 1 && upRight[i][j] > 1) {
                        maxLen = Math.max(maxLen, downRight[i][j] + upRight[i][j] - 1);
                    }
                    if (upLeft[i][j] > 1 && downLeft[i][j] > 1) {
                        maxLen = Math.max(maxLen, upLeft[i][j] + downLeft[i][j] - 1);
                    }
                    if (upLeft[i][j] > 1 && upRight[i][j] > 1) {
                        maxLen = Math.max(maxLen, upLeft[i][j] + upRight[i][j] - 1);
                    }
                }
            }
        }

        return maxLen;
    }

    public static void main(String[] args) {
        LongestVShapedDiagonal sol = new LongestVShapedDiagonal();

        int[][] grid1 = {
            {2,2,1,2,2},
            {2,0,2,2,0},
            {2,0,1,1,0},
            {1,0,2,2,2},
            {2,0,0,2,2}
        };

        System.out.println("Longest V-shaped diagonal length: " + sol.longestVDiagonal(grid1));
    }
}

