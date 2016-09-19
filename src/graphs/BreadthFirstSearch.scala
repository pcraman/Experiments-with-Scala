import scala.collection.mutable.Queue;
object BreadthFirstSearch {
  def main(args : Array[String]) {
    var g = new Graph(4)
    g.addEdge(1, 3)
    g.addEdge(1, 4)
    g.addEdge(4, 2)
    val res = bfsIterative(g, 1)
    println("The BFS is ")
    res.foreach(println)
  }

  def bfsIterative(g : Graph, src : Int) : List[Int]={
    var queue = Queue[Int]()
    var visited = Set[Int]()
    var res = List[Int]()
    queue += src
    visited += src
    while (!queue.isEmpty) {
      res = queue.front :: res
      if (!g.adjacencyList.contains(queue.front)) {
        queue.dequeue
      } else {
        g.adjacencyList(queue.dequeue).
        filter(!visited.contains(_)).
        map { s => queue.enqueue(s)
              visited  += s }
      }
    }
    res.reverse
  }
}
