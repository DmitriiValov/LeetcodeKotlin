/**
 * <a href="https://leetcode.com/problems/two-sum-ii-input-array-is-sorted/">167. Two Sum II - Input array is sorted</a>
 */

class _167 {
    class Solution {
        fun twoSum(numbers: IntArray, target: Int): IntArray {
            var map = HashMap<Int, Int>()
            for (i in 0 until numbers.size) {
                if (map.containsKey(target - numbers[i])) {
                    return intArrayOf(map.get(target - numbers[i])!!, i + 1)
                }
                else {
                    map.put(numbers[i], i + 1)
                }
            }
            return intArrayOf();
        }
    }
}