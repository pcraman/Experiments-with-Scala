import scala.collection.mutable.Map;
import scala.collection.mutable.Set;

object Isomorphism {
  def main(args: Array[String]) {
    var a = "xxy"
    var b = "aab"
    var res1 = checkIsomorphic(a, b)
    println(s"$a and $b Isomorphism is $res1")

    a = "xyz"
    b = "aab"
    println(s"$a and $b Isomophism is " + checkIsomorphic(a, b))

  }

  def checkIsomorphic(a: String, b: String): Boolean = {
    if (a.size != b.size)
      return false;
    if (a == null && b == null)
      return true;

    var isomorphic_map = Map[Char, Char]()
    var is_present = Set[Char]()
    for (i <- 0 until a.size) {
      var temp = isomorphic_map.contains(a(i))
      if (temp && isomorphic_map(a(i)) != b(i))
        return false
      else if (!temp && is_present.contains(b(i)))
        return false
      else {
        isomorphic_map += (a(i) -> b(i))
        is_present += b(i)
      }
    }
    return true
  }
}
