/**
 * <a href="https://leetcode.com/problems/reverse-string/">344. Reverse String</a>
 */

class _344 {
    class Solution {
        fun reverseString(s: CharArray): Unit {
            val size = s.size
            for (i in 0 until size / 2) {
                val t = s[i]
                s[i] = s[size - i - 1]
                s[size - i - 1] = t
            }
        }
    }
}