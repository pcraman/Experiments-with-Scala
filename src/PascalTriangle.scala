
object PascalTriangle {
  def main(args : Array[String]) {
    println("The Pascal Traingle - 6 lines")
    println("------------------------------")
    pascalTriangle(6)
  }

  def pascalTriangle(numOfLines: Int) = {
    for ( i <- 0 until numOfLines) {
      for (j <- 0 to i )
        print(getPascalNumber(i, j) + " ")
      print("\n")
    }
  }

  def getPascalNumber(row: Int, column: Int) : Int = {
    if (column == 0 || row == column) 1
    else getPascalNumber(row - 1, column) + getPascalNumber(row - 1, column - 1)
  }
}
