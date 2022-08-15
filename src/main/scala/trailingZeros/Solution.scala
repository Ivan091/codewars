package edu.meineliebe
package trailingZeros

object Solution {
  def zeros(n: Int): Int =
    LazyList
      .from(1)
      .takeWhile(p => n > math.pow(5, p))
      .map(p => n / math.pow(5, p).toInt)
      .sum
}
