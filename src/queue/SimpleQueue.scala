import scala.collection.mutable.Queue;

object SimpleQueue {
  def main(args : Array[String]) {
    var list = List("Apple", "Orange", "Banana", "Kiwi", "Pear");
    fruitsInQueue(list)
  }
  def fruitsInQueue(list : List[String]) : Unit = {
    var queue = new Queue[String]()
    queue ++= list
    println("The contents of the queue are :")
    while(!queue.isEmpty) {
      println(queue.dequeue)
    }
  }
}
