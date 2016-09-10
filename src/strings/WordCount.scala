import scala.collection.mutable.Map;
object WordCount {
  def main (args : Array[String]) {
    val listOfFruits = List("Apple","Apple", "Orange","Banana","Apple","Kiwi")
    var result = getWordCount(listOfFruits)
    println("Count of each fruit in list :  " + listOfFruits + " is " + result)
  }
  
  def getWordCount(listOfFruits : List[String]) : Map[String, Int] ={
    var emptyMap = Map.empty[String, Int]
    var result = listOfFruits.foldLeft(emptyMap) {
      (res, word) => res + (word -> (res.getOrElse(word, 0) + 1))
    }
    result
  }
}
