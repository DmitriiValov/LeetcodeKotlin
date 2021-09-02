import _67.Solution
import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.Test

class _67_Test {

    private val SOLUTION = Solution()

    @Test
    fun test1() {
        val a = "11"
        val b = "1"
        val output = "100"
        assertThat(SOLUTION.addBinary(a, b), equalTo(output))
    }

    @Test
    fun test2() {
        val a = "1010"
        val b = "1011"
        val output = "10101"
        assertThat(SOLUTION.addBinary(a, b), equalTo(output))
    }
}