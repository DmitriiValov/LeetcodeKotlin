import java.util.*

/**
 * <a href="https://leetcode.com/problems/squares-of-a-sorted-array/">977. Squares of a Sorted Array</a>
 */

class _977 {

    class Solution {
        fun sortedSquares(nums: IntArray): IntArray {
            for ((index, value) in nums.withIndex()) {
                nums[index] = value * value;
            }
            nums.sort();
            return nums;
        }
    }
}