package array;

import java.util.HashMap;
import java.util.Map;

public class TwoSum1 {
	class Solution {
		public int[] twoSum(int[] nums, int target) {
			// T:O(N)
			Map<Integer, Integer> map = new HashMap<>();
			for (int i = 0; i < nums.length; i++) {
				if (map.containsKey(target - nums[i])) {
					return new int[] { map.get(target - nums[i]), i };
				}
				map.put(nums[i], i);
			}
			return new int[2];
		}
	}
}
