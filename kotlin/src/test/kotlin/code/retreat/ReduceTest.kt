package code.retreat

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test
import kotlin.system.measureNanoTime

class ReduceTest {

    val reduce = Reduce()

    @Test
    fun `should reduce inefficiently using list concatenation`() {
        val duration = measureNanoTime {
            reduce.reduceHugeList()
        } / 1000000.0
        println("Concatenation ran for $duration ms")
        assertTrue(duration < 6000.0)
    }

    @Test
    fun `should reduce more efficiently using list mutation`() {
        val duration = measureNanoTime {
            reduce.reduceHugeMutableList()
        } / 1000000.0
        println("Mutation ran for $duration ms")
        assertTrue(duration < 6000.0)
    }

}
