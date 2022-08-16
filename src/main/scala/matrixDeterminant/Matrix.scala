package edu.meineliebe
package matrixDeterminant

object Matrix {

  type Matrix = Array[Array[Int]]

  def determinant(matrix: Matrix): Int = {
    matrix.length match {
      case 1 => matrix(0)(0)
      case _ => {
        var sign = 1
        var i = 0
        var sum = 0
        while (i < matrix.length){
          sum += matrix(i)(0) * sign * determinant(minor(matrix, i, 0))
          sign *= -1
          i += 1
        }
        sum
      }
    }
  }

  def minor(matrix: Matrix, m: Int, n: Int): Matrix = {
    val len = matrix.length
    val res = Array.ofDim[Int](len - 1, len - 1)
    var a = 0
    var i = 0
    while (a < len) {
      var b = 0
      var j = 0
      while (b < len && a < len) {
        if (a == m && b == n){
          a += 1
          b += 1
        } else if (a == m){
          a += 1
        } else if (b == n) {
          b += 1
        } else {
          res(i)(j) = matrix(a)(b)
          b += 1
          j += 1
        }
      }
      a += 1
      i += 1
    }
    res
  }
}