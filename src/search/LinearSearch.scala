
object LinearSearch {
  def main(args: Array[String]) {
    val l = List(4, 6, 8, 9, 3, 1, 2);
    val res = linearSrch(l, 9);
    println("\nAnswer = " + res);
  }

  def linearSrch(l: List[Int], target: Int): Int = {
    var i = l.size - 1;
    for (j <- 0 to i) {
      if (l(j) == target) {
        return j + 1;
      }
    }
    return -1;
  }
}
