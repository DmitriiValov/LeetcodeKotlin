import org.hamcrest.CoreMatchers
import org.hamcrest.MatcherAssert
import org.junit.Test

class _977_Test {
    private val SOLUTION = _977.Solution()

    @Test
    fun test1() {
        val nums = intArrayOf(-4,-1,0,3,10)
        val results = intArrayOf(0,1,9,16,100)
        MatcherAssert.assertThat(SOLUTION.sortedSquares(nums), CoreMatchers.equalTo(results))
    }

    @Test
    fun test2() {
        val nums = intArrayOf(-7,-3,2,3,11)
        val results = intArrayOf(4,9,9,49,121)
        MatcherAssert.assertThat(SOLUTION.sortedSquares(nums), CoreMatchers.equalTo(results))
    }
}