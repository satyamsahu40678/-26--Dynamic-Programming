// 1. You are given an m x n integer array grid. There is a robot initially located at the top-left corner (i.e., 
// grid[0][0]). The robot tries to move to the bottom-right corner (i.e., grid[m - 1][n - 1]). The robot can only 
// move either down or right at any point in time.

// An obstacle and space are marked as 1 or 0 respectively in the grid. A path that the robot takes cannot 
// include any square that is an obstacle.

// Return the number of possible unique paths that the robot can take to reach the bottom-right corner. 

class Ques6 {
    public static int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int width = obstacleGrid[0].length;
        int[] dp = new int[width];
        dp[0] = 1;
        for (int[] row : obstacleGrid) {
            for (int j = 0; j < width; j++) {
                if (row[j] == 1)
                    dp[j] = 0;
                else if (j > 0)
                    dp[j] += dp[j - 1];
            }
        }
        return dp[width - 1];
    }

    public static void main(String[] args) {
        int grid[][] = { { 0, 0, 0 },
                { 0, 1, 0 },
                { 0, 0, 0 } };
        System.out.println("The desired output is : " + uniquePathsWithObstacles(grid));
    }
}