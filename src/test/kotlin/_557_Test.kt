import org.hamcrest.CoreMatchers
import org.hamcrest.MatcherAssert
import org.junit.Test

class _557_Test {

    private val SOLUTION = _557.Solution()

    @Test
    fun test1() {
        val s = "Let's take LeetCode contest"
        val result = "s'teL ekat edoCteeL tsetnoc"
        MatcherAssert.assertThat(SOLUTION.reverseWords(s), CoreMatchers.equalTo(result))
    }

    @Test
    fun test2() {
        val s = "God Ding"
        val result = "doG gniD"
        MatcherAssert.assertThat(SOLUTION.reverseWords(s), CoreMatchers.equalTo(result))
    }
}