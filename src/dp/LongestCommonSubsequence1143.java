package dp;

public class LongestCommonSubsequence1143 {
	 public int longestCommonSubsequence(String text1, String text2) {
        /*. . a c e
        * . 0 0 0 0
        * a 0 1 1 1
        * b 0 1 1 1
        * c 0 1 2 2
        * d 0 1 2 2  
        * e 0 1 2 3
        */
		int[][] dp = new int[text1.length() + 1][text2.length() + 1];

		for (int i = 1; i < dp.length; i++) {
			for (int j = 1; j < dp[0].length; j++) {

				if (text1.charAt(i - 1) == (text2.charAt(j - 1))) {
					dp[i][j] = dp[i - 1][j - 1] + 1;
				} else {
					dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
				}
			}
		}

		return dp[text1.length()][text2.length()];
	}
}
