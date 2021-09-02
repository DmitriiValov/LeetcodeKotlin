/**
 * <a href="https://leetcode.com/problems/add-binary/">67. Add Binary</a>
 */

class _67 {
    class Solution {
        fun addBinary(a: String, b: String): String {
            var result = ""
            var i = a.length - 1
            var j = b.length - 1
            var s = 0
            while (i >= 0 || j >= 0 || s > 0) {
                s = s.plus(if(i >= 0) (a[i] - '0') else 0)
                s = s.plus(if(j >= 0) (b[j] - '0') else 0)
                result = "${'0'.plus(s % 2)}$result"
                s = s/2
                --i
                --j
            }
            return result
        }
    }
}