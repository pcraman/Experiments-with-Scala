object BinarySearch {
  def main(args: Array[String]) {
    val l = List(2, 4, 5);
    val res = binSearch(l, 4);
    println("\nAnswer = " + res);
  }

	def binSearch(l: List[Int], target: Int): Int = {
    var left = 0;
    var right = l.size - 1;
    while (left <= right) {
      val mid = (left + right) / 2;
      if (l(mid) == target)
        return mid + 1;
      else if (l(mid) > target)
        right = mid - 1;
      else
        left = mid + 1;
    }
    return -1;
  }
}
