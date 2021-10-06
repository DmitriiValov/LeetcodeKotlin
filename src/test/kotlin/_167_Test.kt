import org.hamcrest.CoreMatchers
import org.hamcrest.MatcherAssert
import org.junit.Test

class _167_Test {

    private val SOLUTION = _167.Solution()

    @Test
    fun test1() {
        val nums = intArrayOf(2,7,11,15)
        val target = 9
        val results = intArrayOf(1,2)
        MatcherAssert.assertThat(SOLUTION.twoSum(nums, target), CoreMatchers.equalTo(results))
    }

    @Test
    fun test2() {
        val nums = intArrayOf(2,3,4)
        val target = 6
        val results = intArrayOf(1,3)
        MatcherAssert.assertThat(SOLUTION.twoSum(nums, target), CoreMatchers.equalTo(results))
    }

    @Test
    fun test3() {
        val nums = intArrayOf(-1,0)
        val target = -1
        val results = intArrayOf(1,2)
        MatcherAssert.assertThat(SOLUTION.twoSum(nums, target), CoreMatchers.equalTo(results))
    }
}