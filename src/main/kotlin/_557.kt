/**
 * <a href="https://leetcode.com/problems/reverse-words-in-a-string-iii/">557. Reverse Words in a String III</a>
 */

class _557 {
    class Solution {
        fun reverseWords(s: String): String {
            val parts = s.split(" ")
            var result = ""
            for (part in parts) {
                val chs = part.toCharArray()
                val size = chs.size
                for (i in 0 until size / 2) {
                    val t = chs[i]
                    chs[i] = chs[size - i - 1]
                    chs[size - i - 1] = t
                }
                result = "${result} ${String(chs)}"
            }
            return result.trim()
        }
    }
}