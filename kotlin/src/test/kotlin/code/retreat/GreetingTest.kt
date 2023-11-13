package code.retreat

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class GreetingTest {

    val greeting = Greeting()

    @Test
    fun `should return the good old greeting`() {
        assertEquals("Hello World!", greeting.getMessage())
    }

}
