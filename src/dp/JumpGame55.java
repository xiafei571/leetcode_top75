package dp;

public class JumpGame55 {

	// greedy is better: O(n)
	public boolean canJump(int[] nums) {
		int goal = nums.length - 1;

		for (int i = nums.length - 1; i >= 0; i--) {
			if (i + nums[i] >= goal) {
				goal = i;
			}
		}

		return goal == 0 ? true : false;
	}

}
