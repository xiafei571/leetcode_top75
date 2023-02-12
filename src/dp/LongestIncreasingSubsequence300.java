package dp;

import java.util.Arrays;

public class LongestIncreasingSubsequence300 {
	//O(N^2)
	public int lengthOfLIS(int[] nums) {
		int[] dp = new int[nums.length + 1];
		int maxLength = 1;
		Arrays.fill(dp, 1);
		for (int i = 1; i < nums.length; i++) {
			for (int j = i - 1; j >= 0; j--) {
				if (nums[j] < nums[i]) {
					dp[i] = Math.max(dp[j] + 1, dp[i]);
				}
				maxLength = Math.max(maxLength, dp[i]);
			}
		}

		return maxLength;

	}
}
