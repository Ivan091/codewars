package edu.meineliebe
package matrixDeterminant

import org.scalatest.flatspec._
import org.scalatest.matchers.should.Matchers

class MatrixTest extends AnyFlatSpec with Matchers {

  val tests: List[(Array[Array[Int]], Int, Option[String])] = List(
    (Array(Array(1)), 1, Some("Determinant of a 1 x 1 matrix yields the value of the one element.")),
    (Array(Array(1, 3), Array(2, 5)), -1, Some("Should return 1 * 5 - 3 * 2, i.e., -1.")),
    (Array(Array(2, 5, 3), Array(1, -2, -1), Array(1, 3, 4)), -20, None)
  )

  tests.foreach { case (matrix, expected, message) =>
    val matrixStr = s"Array(${matrix.map(r => s"Array(${r.mkString(", ")})").mkString(", ")})"
    s"determinant($matrixStr)" should s"return $expected" in {
      message match {
        case Some(error) => withClue(message)(Matrix.determinant(matrix) should be(expected))
        case None        => Matrix.determinant(matrix) should be(expected)
      }
    }
  }

  "minor" should "be minor" in {
    val arr = Array(
      Array(1, 2),
      Array(2, 3)
    )
    Matrix.minor(arr, 0, 0) shouldBe Array(Array(3))
  }

  "minor" should "be minor2" in {
    val arr = Array(
      Array(1, 2, 3),
      Array(2, 3, 4),
      Array(5, 6, 7)
    )
    Matrix.minor(arr, 1, 1) shouldBe Array(Array(1, 3), Array(5, 7))
  }
}
