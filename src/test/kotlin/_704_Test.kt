import org.hamcrest.CoreMatchers
import org.hamcrest.MatcherAssert
import org.junit.Test

class _704_Test {

    private val SOLUTION = _704.Solution()

    @Test
    fun test1() {
        val nums = intArrayOf(-1,0,3,5,9,12)
        val target = 9
        val result = 4
        MatcherAssert.assertThat(SOLUTION.search(nums, target), CoreMatchers.equalTo(result))
    }

    @Test
    fun test2() {
        val nums = intArrayOf(-1,0,3,5,9,12)
        val target = 2
        val result = -1
        MatcherAssert.assertThat(SOLUTION.search(nums, target), CoreMatchers.equalTo(result))
    }
}