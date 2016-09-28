import scala.annotation.tailrec

// Finds square root of perfect squares using binary search approach
object SquareRoot {

  def main(args : Array[String]) = {
    println("Square root of 25 is " + findSquareRoot(25))
    println("Square root of 169 is " + findSquareRoot(169))
  }

  def findSquareRoot(x : Int) : Int = {
    def getMean(left: Int, right : Int) : Int = left + ((right - left) / 2)

    @tailrec
    def sqrtRoot (left : Int, right : Int) : Int = {
      val mid = getMean(left, right)
      val guess = mid * mid
      if (guess < x) sqrtRoot(mid + 1 , right)
      else if (guess > x) sqrtRoot(left , mid - 1)
      else mid
    }
    sqrtRoot(1 , x)
  }
}
