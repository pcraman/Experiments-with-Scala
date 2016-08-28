
object BubbleSort {
  def main(args: Array[String]) {
    val arr = Array(30, 32, 14, 57, 49, 23)
    val res = bubbleSort(arr)
    for (i <- 0 to (res.length - 1)) {
      print(res(i) + " ")
    }
    print("\n")

  }

  def bubbleSort(arr: Array[Int]): Array[Int] = {
    for (i <- 1 to (arr.length - 1)) {
      for (j <- (i - 1) to 0 by -1) {
        if (arr(j) > arr(j + 1)) {
          val temp = arr(j)
          arr(j) = arr(j + 1)
          arr(j + 1) = temp
        }
      }
    }
    return arr
  }
}
