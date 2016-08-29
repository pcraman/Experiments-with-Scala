import scala.collection.mutable.Stack;
import scala.collection.immutable.Map;
object WellFormedness {
  def main(args : Array[String]) {
    val str = "()[((())){}]"
    val res = checkMathchingBrackets(str)
    if (res) println (s"${str} is well-formed")
    else println (s"${str} is not well-formed")
  }
  def checkMathchingBrackets(str : String) : Boolean = {
    var brackets = Stack[Char]()
    val pattern_map = Map('(' -> ')' , '{' -> '}', '[' -> ']')
    var check_pattern : (Char, Char) => Boolean =
      (a, b) => { pattern_map(a) != b }
    for (i <- 0 until str.size) {
      str(i) match {
        case '(' | '[' | '{' => brackets.push(str(i))
        case _ => {
          if (brackets.isEmpty || check_pattern(brackets.top, str(i)))
            return false
          else brackets.pop
        }
      }
    }
    return brackets.isEmpty
  }
}
