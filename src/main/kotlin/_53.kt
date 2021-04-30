/**
 * <a href="https://leetcode.com/problems/maximum-subarray/">53. Maximum Subarray</a>
 */

class _53 {
    class Solution {
        fun maxSubArray(nums: IntArray): Int {
            var sum = nums.first()
            for (i in 1 until nums.size) {
                nums[i] = kotlin.math.max(nums[i - 1] + nums[i], nums[i])
                sum = kotlin.math.max(nums[i], sum)
            }
            return sum
        }
    }
}

