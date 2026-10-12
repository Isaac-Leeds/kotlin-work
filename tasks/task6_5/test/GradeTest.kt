// Task 6.5: unit tests for grade()

import io.kotest.assertions.assertSoftly
import io.kotest.assertions.withClue
import io.kotest.core.spec.style.FreeSpec
import io.kotest.matchers.shouldBe


@Suppress("unused")
class GradeTest : FreeSpec({
    // Write your tests in here

    "Mark below 0 or above 100 should return ?"{
        assertSoftly {
            withClue("Mark of -1 gives a ?") {
                grade(-1) shouldBe "?"
            }
            withClue("Mark of 101 gives a ?") {
                grade(101) shouldBe "?"
            }
        }
    }

    "Mark of 0 to 39 should return Fail"{
        assertSoftly {
            withClue("Mark of 0 gives a Fail") {
                grade(0) shouldBe "Fail"
            }
            withClue("Mark of 1 gives a Fail") {
                grade(1) shouldBe "Fail"
            }
            withClue("Mark of 39 gives a Fail") {
                grade(39) shouldBe "Fail"
            }
        }
    }

    "Mark of 40 to 69 should return Pass"{
        assertSoftly {
            withClue("Mark of 40 gives a Pass") {
            grade(40) shouldBe "Pass"
            }
            withClue("Mark of 60 gives a Pass") {
                grade(60) shouldBe "Pass"
            }
            withClue("Mark of 69 gives a Pass") {
                grade(69) shouldBe "Pass"
            }
        }
    }

    "Mark of 70 to 100 should return Distinction"{
        assertSoftly {
            withClue("Mark of 70 gives a Distinction") {
                grade(70) shouldBe "Distinction"
            }
            withClue("Mark of 99 gives a Distinction") {
                grade(99) shouldBe "Distinction"
            }
            withClue("Mark of 100 gives a Distinction") {
                grade(100) shouldBe "Distinction"
            }
        }
    }
})
