/**
 * <a href="https://leetcode.com/problems/move-zeroes/">283. Move Zeroes</a>
 */

class _283 {
    class Solution {
        fun moveZeroes(nums: IntArray): Unit {
            var zeroCount = 0
            for (i in 0 until nums.size) {
                if (nums[i] === 0) {
                    ++zeroCount
                } else if (zeroCount > 0) {
                    nums[i - zeroCount] = nums[i]
                    nums[i] = 0
                }
            }
        }
    }
}