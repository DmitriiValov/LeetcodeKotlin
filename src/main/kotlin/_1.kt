/**
 * <a href="https://leetcode.com/problems/two-sum/">1. Two Sum</a>
 */

class _1 {
    class Solution {
        fun twoSum(nums: IntArray, target: Int): IntArray {
            for (i in 0 until nums.size-1) {
                val first = nums[i]
                for (j in i+1 until nums.size) {
                    val second = nums[j]
                    if (first + second == target) {
                        return intArrayOf(i, j)
                    }
                }
            }
            return intArrayOf()
        }
    }

    class Solution2 {
        fun twoSum(nums: IntArray, target: Int): IntArray {
            val results: HashMap<Int, Int> = HashMap()
            for (i in 0 until nums.size) {
                if (results.keys.contains(nums[i])) {
                    return intArrayOf(i, results.get(nums[i])!!)
                }
                else {
                    results.set(target-nums[i], i)
                }
            }
            return intArrayOf()
        }
    }
}