package foo

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class ChangerTest {

    @Test
    fun `changes non-null`() {
        assertEquals(null, Changer.change("foo"))
    }
}
