import org.hamcrest.CoreMatchers
import org.hamcrest.MatcherAssert
import org.junit.Test

class _344_Test {

    private val SOLUTION = _344.Solution()

    @Test
    fun test1() {
        val s = charArrayOf('h','e','l','l','o')
        val results = charArrayOf('o','l','l','e','h')
        SOLUTION.reverseString(s)
        MatcherAssert.assertThat(s, CoreMatchers.equalTo(results))
    }

    @Test
    fun test2() {
        val s = charArrayOf('H','a','n','n','a','h')
        val results = charArrayOf('h','a','n','n','a','H')
        SOLUTION.reverseString(s)
        MatcherAssert.assertThat(s, CoreMatchers.equalTo(results))
    }

    @Test
    fun test3() {
        val s = charArrayOf('a','b','c','d','e')
        val results = charArrayOf('e','d','c','b','a')
        SOLUTION.reverseString(s)
        MatcherAssert.assertThat(s, CoreMatchers.equalTo(results))
    }
}