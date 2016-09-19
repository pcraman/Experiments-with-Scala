import scala.collection.mutable.Stack;
object DepthFirstSearch {

  def main(args : Array[String]) {
    var g = new Graph(4)
    g.addEdge(1, 3)
    g.addEdge(1, 4)
    g.addEdge(2, 3)
    g.addEdge(3, 4)
    g.addEdge(4, 2)
    val res = dfsIterative(g, 1)
    println("The DFS is ")
    res.foreach(println)

  }

  def dfsIterative(g : Graph, src : Int) : List[Int]= {
    var stack = Stack[Int]()
    var res = List[Int]()
    var visited = Set[Int]()
    stack.push(src)
    visited += src
    while (!stack.isEmpty) {
      res  = stack.top :: res
      if (!g.adjacencyList.contains(stack.top)) {
        stack.pop
      } else {
        g.adjacencyList(stack.pop).
        filter(!visited.contains(_)).
        map { s => stack.push(s)
              visited  += s }
      }
    }
    res.reverse
  }

}
