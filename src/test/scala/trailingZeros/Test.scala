package edu.meineliebe
package trailingZeros
import trailingZeros.Solution.zeros

import org.scalatest.flatspec.AnyFlatSpec

class Test extends AnyFlatSpec {

  behavior of "Number of trailing zeros of N! Test"

  it should "work with example tests" in {
    assert(zeros(0) == 0)
    assert(zeros(6) == 1)
    assert(zeros(14) == 2)
  }
}
