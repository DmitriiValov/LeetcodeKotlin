/**
 * <a href="https://leetcode.com/problems/maximum-subarray/">53. Maximum Subarray</a>
 */

class _53 {
    class Solution {
        fun maxSubArray(nums: IntArray): Int {
            val dp = nums.clone()
            var maxSum = nums.first()
            dp[0] = nums.first()
            for (i in 1 until nums.size) {
                dp[i] = kotlin.math.max(dp[i - 1] + nums[i], nums[i])
                maxSum = kotlin.math.max(dp[i], maxSum)
            }
            return maxSum
        }
    }
}

