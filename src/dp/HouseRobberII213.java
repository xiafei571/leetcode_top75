package dp;

public class HouseRobberII213 {
	public int rob(int[] nums) {
		if (nums.length == 1) {
			return nums[0];
		}

		if (nums.length == 2) {
			return Math.max(nums[0], nums[1]);
		}
		int max1 = robHelp(nums, 0, nums.length - 2);
		int max2 = robHelp(nums, 1, nums.length - 1);

		return Math.max(max1, max2);
	}

	private static int robHelp(int[] nums, int start, int end) {
		int pre1 = nums[start];
		int pre2 = Math.max(nums[start], nums[start + 1]);
		for (int i = start + 2; i <= end; i++) {
			int temp = pre2;
			pre2 = Math.max(pre1 + nums[i], pre2);
			pre1 = temp;
		}
		return pre2;
	}
}
