object CoinChange {
  def main(args : Array[String]) {
    println("Number of ways to make change for 4" +
            " using (1, 2) is " + getNumberOfWays(4, List(1, 2)))
  }

  def getNumberOfWays(money: Int, coins: List[Int]): Int ={
    if (coins.isEmpty || money < 0) 0
    else if (money == 0) 1
    else {
      getNumberOfWays(money, coins.tail) +
      getNumberOfWays(money - coins.head, coins)
    }
  }
}
