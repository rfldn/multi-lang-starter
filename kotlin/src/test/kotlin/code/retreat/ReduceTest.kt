package code.retreat

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test
import kotlin.system.measureNanoTime

class ReduceTest {

    val reduce = Reduce()

    @Test
    fun `should return the good old greeting`() {
        val duration = measureNanoTime {
            reduce.reduceHugeList()
        } / 1000000.0
        println("Ran for $duration ms")
        assertTrue(duration < 6000.0)
    }

}
