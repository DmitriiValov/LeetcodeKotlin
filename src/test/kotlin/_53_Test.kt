import _53.Solution
import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.Test

class _53_Test {

    private val SOLUTION = Solution()

    @Test
    fun test1() {
        val nums = intArrayOf(-2, 1, -3, 4, -1, 2, 1, -5, 4)
        assertThat(SOLUTION.maxSubArray(nums), equalTo(6))
    }

    @Test
    fun test2() {
        val nums = intArrayOf(1)
        assertThat(SOLUTION.maxSubArray(nums), equalTo(1))
    }

    @Test
    fun test3() {
        val nums = intArrayOf(5,4,-1,7,8)
        assertThat(SOLUTION.maxSubArray(nums), equalTo(23))
    }
}