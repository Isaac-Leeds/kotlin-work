// Task 6.3: unit tests for grade()

import kotlin.test.Test
import kotlin.test.assertEquals

class GradeTest {
    // Write tests here
    @Test
    fun `Mark of -1 gives a ?` () {
        assertEquals("?", grade(-1))
    }
    @Test
    fun `Mark of 0 gives a Fail` () {
        assertEquals("Fail", grade(0))
    }
    @Test
    fun `Mark of 1 gives a Fail` () {
        assertEquals("Fail", grade(1))
    }
    @Test
    fun `Mark of 39 gives a Fail` () {
        assertEquals("Fail", grade(39))
    }

    @Test
    fun `Mark of 40 gives a Pass` () {
        assertEquals("Pass", grade(40))
    }
    @Test
    fun `Mark of 60 gives a Pass` () {
        assertEquals("Pass", grade(60))
    }
    @Test
    fun `Mark of 69 gives a Pass` () {
        assertEquals("Pass", grade(69))
    }

    @Test
    fun `Mark of 70 gives a Distinction` () {
        assertEquals("Distinction", grade(70))
    }
    @Test
    fun `Mark of 99 gives a Distinction` () {
        assertEquals("Distinction", grade(99))
    }
    @Test
    fun `Mark of 100 gives a Distinction` () {
        assertEquals("Distinction", grade(100))
    }

    @Test
    fun `Mark of 101 gives a ?` () {
        assertEquals("?", grade(101))
    }

}
