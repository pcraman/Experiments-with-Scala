// Using library functions
object Anagram {
  def main(args: Array[String]) {
    val x = "cat"
    val y = "act"
    println(s"Answer - $x and $y are " + checkAnagram(x, y))

  }

  def checkAnagram(x: String, y: String): String = {
    if ((x diff y).isEmpty)
      return "Anagrams"
    else
      return "not Anagrams"
  }
}
