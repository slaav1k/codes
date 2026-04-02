import java.util.*;

class Solution {
    public int maximumAmount(int[][] coins) {
        int n = coins.length;
        int m = coins[0].length;
        int curr;

        int[][][] dp = new int[n][m][3];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                for (int k = 0; k < 3; k++) {
                    dp[i][j][k] = Integer.MIN_VALUE / 2;
                }
            }
        }

        dp[0][0][0] = coins[0][0];

        dp[0][0][1] = Math.max(coins[0][0], 0);
        dp[0][0][2] = dp[0][0][1];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                for (int k = 0; k < 3; k++) {

                    if (i == 0 && j == 0) continue;
                    
                    curr = coins[i][j];

                    if (i > 0) {
                        dp[i][j][k] = Math.max(dp[i][j][k], dp[i-1][j][k] + curr);
                    }

                    if (i > 0 && k > 0) {
                        dp[i][j][k] = Math.max(dp[i][j][k], dp[i - 1][j][k - 1]);
                    }

                    if (j > 0) {
                        dp[i][j][k] = Math.max(dp[i][j][k], dp[i][j-1][k] + curr);
                    }

                    if (j > 0 && k > 0) {
                        dp[i][j][k] = Math.max(dp[i][j][k], dp[i][j - 1][k - 1]);
                    }
                }
            }
        }

        int ans = Integer.MIN_VALUE;
        for (int k = 0; k < 3; k++) {
            ans = Math.max(ans, dp[n-1][m-1][k]);
        }
        
        return ans;
    }
}