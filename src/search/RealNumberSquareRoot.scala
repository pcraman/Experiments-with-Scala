

object RealNumberSquareRoot {

  def main(args : Array[String]) {
    println("Square root of 2 is " + findSquareRoot(2))
  }

  def findSquareRoot(x : Double) : Double = {
    val threshold = 0.00000001

    def absolute(y : Double) : Double = if (y < 0) -y else y
    def getMean(left : Double, right: Double) : Double =
      left + ((right - left) / 2)

    def getDiff(guess : Double) : Double =
      (guess - x)/x

    def sqrRoot(left : Double, right : Double) : Double = {
      val mid = getMean(left, right)
      val diff = getDiff(mid * mid)

      if (-diff > threshold) sqrRoot(mid, right)
      else if (diff > threshold) sqrRoot(left, mid)
      else mid

    }
    sqrRoot(1, x)
  }
}
