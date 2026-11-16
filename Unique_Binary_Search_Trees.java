/*96. Unique Binary Search Trees

Given an integer n, return the number of structurally unique BST's (binary search trees) which has exactly n nodes of unique values from 1 to n.

 */

class Solution {
    public int numTrees(int n) {
        int[] dp = new int[n + 1];
        dp[0] = 1;
        dp[1] = 1;

        for(int k = 2; k <= n; k++){
            for(int i = 1; i <= k; i++){
                dp[k] += dp[i - 1] * dp[k - i];
            }
        }

        return dp[n];
    }
}
