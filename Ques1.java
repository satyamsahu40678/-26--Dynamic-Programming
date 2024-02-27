// Q1. There are n stairs, a person standing at the bottom wants to reach the top. The person can 
// climb either 1,2,3…m stairs at a time where m is a user given integer. Count the number of ways 
// the person can reach the top.

class Ques1 {
	static int climbingStairs(int n, int m){
		int dp[] = new int[n+1];
		dp[0] = 1;
		dp[1] = 1;
		for (int i = 2; i < n; i++) {
			dp[i] = 0;
			for (int j = 1; j <= m && j <= i; j++)	dp[i] += dp[i - j];
		}
		return dp[n - 1];
	}
	public static void main(String[] args){
		int n = 5, m = 3;
		System.out.println("Number of ways = " + climbingStairs(n, m));
	}
}