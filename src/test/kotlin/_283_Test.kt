import org.hamcrest.CoreMatchers
import org.hamcrest.MatcherAssert
import org.junit.Test

class _283_Test {

    private val SOLUTION = _283.Solution()

    @Test
    fun test1() {
        val nums = intArrayOf(0,1,0,3,12)
        val results = intArrayOf(1,3,12,0,0)
        MatcherAssert.assertThat(SOLUTION.moveZeroes(nums), CoreMatchers.equalTo(results))
    }

    @Test
    fun test2() {
        val nums = intArrayOf(0)
        val results = intArrayOf(0)
        MatcherAssert.assertThat(SOLUTION.moveZeroes(nums), CoreMatchers.equalTo(results))
    }
}