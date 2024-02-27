// Q5. Given a triangle array, return the minimum path sum from top to bottom.For each step, you 
// may move to an adjacent number of the row below. More formally, if you are on index i on the 
// current row, you may move to either index i or index i + 1 on the next row. 

class Ques5 {
    public static int minimumTotal(int[][] triangle) {
        int n = triangle.length;
        int[][] dp = new int[n + 1][n + 1];

        for (int level = n - 1; level >= 0; level--)
            for (int i = 0; i <= level; i++)
                dp[level][i] = triangle[level][i] + Math.min(dp[level + 1][i], dp[level + 1][i + 1]);

        return dp[0][0];
    }

    public static void main(String[] args) {
        int triangle[][] = { { 2 },
                { 3, 9 },
                { 1, 6, 7 } };
        System.out.println("The desired output is : " + minimumTotal(triangle));
    }
}