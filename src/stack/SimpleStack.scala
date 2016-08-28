// This is a simple program to show how to use stacks in scala
import scala.collection.mutable.Stack;
object SimpleStack {
  def main(args: Array[String]) {
    val str = "helloworld"
    val res = reverseStringWithStack(str)
    println(s"The reversal of ${str} is = ${res}")
  }
  def reverseStringWithStack(str: String): String = {
    var letters = Stack[Char]()
    str.map(letters.push(_))
    var reversedString :String = ""
    while (!letters.isEmpty)
      reversedString += letters.pop
    return reversedString
  }
}
