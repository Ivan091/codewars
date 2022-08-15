package edu.meineliebe

object Solution {
  def zeros(n: Int): Int = {
    LazyList.from(1)
      .takeWhile(x => n / math.pow(5, x))
  }
}