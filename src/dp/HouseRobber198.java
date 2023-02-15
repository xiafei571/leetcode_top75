package dp;

public class HouseRobber198 {
	public int rob(int[] nums) {
		// rob[i] = max(rob[i-1], rob[i-2]+nums[i])
		if (nums.length == 1) {
			return nums[0];
		}

		if (nums.length == 2) {
			return nums[0] > nums[1] ? nums[0] : nums[1];
		}

		int[] dp = new int[nums.length];
		dp[0] = nums[0];
		dp[1] = Math.max(nums[0], nums[1]);
		for (int i = 2; i < nums.length; i++) {
			dp[i] = Math.max(dp[i - 1], dp[i - 2] + nums[i]);
		}

		return dp[nums.length - 1];
	}
}
