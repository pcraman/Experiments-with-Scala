
import scala.collection.mutable.Stack;
import scala.collection.mutable.Set;
object ReversePolishNotation {
  def main(args : Array[String]) {
    val rpnString = "3,4,+,2,*,1,+"
    val res = evaluateRPN(rpnString)
    println(s"The result of RPN {${rpnString}} evaluation is ${res}")
  }
  def evaluateRPN (rpnString : String) : Int = {
    var arr = rpnString.split(",")
    var intStack = Stack[Int]()
    var operatorSet = Set("+", "-", "*", "/")
    for(i <- 0 until arr.size) {
      if (operatorSet.contains(arr(i))) {
        arr(i) match {
          case "+" => intStack.push(intStack.pop + intStack.pop)
          case "-" => intStack.push(intStack.pop - intStack.pop)
          case "*" => intStack.push(intStack.pop * intStack.pop)
          case "/" => intStack.push(intStack.pop / intStack.pop)
        }
      } else {
        intStack.push(arr(i).toInt)
      }
    }
  return intStack.top
  }
}
