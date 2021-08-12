import _1.Solution2
import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.Test

class _1_Test {

    private val SOLUTION = Solution2()

    @Test
    fun test1() {
        val nums = intArrayOf(2,7,11,15)
        val target = 9
        val result = intArrayOf(0,1).sortedArray()
        assertThat(SOLUTION.twoSum(nums, target).sortedArray().contentEquals(result), equalTo(true))
    }

    @Test
    fun test2() {
        val nums = intArrayOf(3,2,4)
        val target = 6
        val result = intArrayOf(1,2).sortedArray()
        assertThat(SOLUTION.twoSum(nums, target).sortedArray().contentEquals(result), equalTo(true))
    }

    @Test
    fun test3() {
        val nums = intArrayOf(3,3)
        val target = 6
        val result = intArrayOf(0,1).sortedArray()
        assertThat(SOLUTION.twoSum(nums, target).sortedArray().contentEquals(result), equalTo(true))
    }
}