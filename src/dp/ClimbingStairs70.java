package dp;

public class ClimbingStairs70 {
	public int climbStairs(int n) {
		// dp[i] = max(dp[i-1], dp[i-2]) + 1
		// Space可以优化到O(1) 
		if (n == 0) {
			return 0;
		}

		if (n == 1) {
			return 1;
		}

		int dp[] = new int[n + 1];
		dp[1] = 1;
		dp[2] = 2;
		for (int i = 3; i <= n; i++) {
			dp[i] = dp[i - 1] + dp[i - 2];
		}

		return dp[n];
	}

}
