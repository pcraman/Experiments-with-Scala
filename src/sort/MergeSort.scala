object MergeSort {
  def main(args: Array[String]) {
    val l = List(4, 6, 3, 2, 7, 8, 1)
    val res = mergeSort(l)
    println(s"Unsorted Array : $l")
    println(s"After sorting : $res")

  }

  def mergeSort(numList: List[Int]): List[Int] = {
    var len = numList.size / 2
    if (len == 0) return numList
    else {
      var (left, right) = numList.splitAt(len)
      merge(mergeSort(left), mergeSort(right))
    }
  }

  def merge(left: List[Int], right: List[Int]): List[Int] = {
    (left, right) match {
      case (left, Nil) => left
      case (Nil, right) => right
      case (l :: ltail, r :: rtail) => if (l < r) l :: merge(ltail, right)
      else r :: merge(left, rtail)
    }
  }
}
