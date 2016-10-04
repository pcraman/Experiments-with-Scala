
object BalanceParanthesis {

  def main(args : Array[String]) {
    val testString1 = "(there's a cat?)"
    val testString2 = "(hello (how are you?)).(But he wasn’t listening)"
    val testString3 = "())("
    val testString4 = ":)"

    println(s"Result for $testString1 is " + balance(testString1.toList))
    println(s"Result for $testString2 is " + balance(testString2.toList))
    println(s"Result for $testString3 is " + balance(testString3.toList))
    println(s"Result for $testString4 is " + balance(testString4.toList))

  }


  def balance(chars: List[Char]) : Boolean = {
    def balance(chars: List[Char], open: Int) : Boolean = {
      if (chars.isEmpty) open == 0
      else if (chars.head == '(') balance(chars.tail, open + 1)
      else if (chars.head == ')' ) open > 0 && balance(chars.tail, open - 1)
      else balance(chars.tail, open)
    }
    balance(chars, 0)
  }
}
