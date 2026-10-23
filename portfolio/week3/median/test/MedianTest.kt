// COMP2850 Portfolio: Week 3
// Tests for median()

import io.kotest.core.spec.style.FreeSpec
import io.kotest.assertions.throwables.shouldThrow
import io.kotest.matchers.shouldBe
import io.kotest.matchers.floats.plusOrMinus

const val tolerance = 0.000001f

@Suppress("Unused")
class MedianTest : FreeSpec({
    "Exception when size=0" {
        shouldThrow<IllegalArgumentException> {
            median(listOf())
        }
    }

    // Write four more tests here
    "Median is the number entered when only one number is entered"{
        median(listOf(5f)) shouldBe (5f plusOrMinus 0.000001f)
    }

    "Median is the midpoint between two numbers entered"{
        median(listOf(2f,9f)) shouldBe (5.5f plusOrMinus 0.000001f)
    }

    "Median is the middle number when an odd number of numbers is entered"{
        median(listOf(1f,175f,4000f)) shouldBe (175f plusOrMinus 0.000001f)
    }

    "Median is the midpoint of the two middle numbers when an even number of numbers are entered"{
        median(listOf(1f, 210f, 420f, 2000f)) shouldBe (315f plusOrMinus 0.000001f)
    }
})
