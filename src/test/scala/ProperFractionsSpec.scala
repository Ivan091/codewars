import org.scalatest.flatspec.AnyFlatSpec

class RomanNumeralsTest extends AnyFlatSpec {
  val myRoman = RomanNumerals()

  "Arabic" should "be converted to Roman" in {
    assert(myRoman.toRoman(1) === "I", "1 converts to I")
    assert(myRoman.toRoman(2) === "II", "2 converts to II")
    assert(myRoman.toRoman(1666) === "MDCLXVI", "1666 converts to MDCLXVI")
    assert(myRoman.toRoman(1664) === "MDCLXIV", "1664 converts to MDCLXIV")
    assert(myRoman.toRoman(1995) === "MCMXCV", "1995 converts to MCMXCV")
    assert(myRoman.toRoman(1005) === "MV", "1005 converts to MV")
  }
  "Roman" should "be converted to Arabic" in {
    assert(myRoman.fromRoman("I") === 1, "I converts to 1")
    assert(myRoman.fromRoman("II") === 2, "II converts to 2")
    assert(myRoman.fromRoman("MDCLXVI") === 1666, "MDCLXVI converts to 1666")
    assert(myRoman.fromRoman("MDCLXIV") === 1664, "MDCLXIV converts to 1664")
    assert(myRoman.fromRoman("MCMXCV") === 1995, "MCMXCV converts to 1995")
    assert(myRoman.fromRoman("MV") === 1005, "MV converts to 1005")
  }
}
