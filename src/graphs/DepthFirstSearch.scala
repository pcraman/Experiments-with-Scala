import scala.collection.mutable.Stack;
object DepthFirstSearch {

  def main(args : Array[Stting]) {
    var g = new Graph(4)
    g.addEdge(1, 3)
    g.addEdge(1, 4)
    g.addEdge(2, 3)
    g.addEdge(3, 4)
    g.addEdge(4, 2)
    g.addEdge(1, 5)
    println("Size is " + g.vertices.size)
    dfsIterative(g, 1, Set.empty)

  }

  def dfsIterative(g : Graph, src : Int) : List[Int]= {
    var stack = Stack[Int]()
    var res = List[Int]()
    var visited = Set[Int]()
    stack.push(src)
    visited += src
    while (!stack.isEmpty) {
      res  = stack.top :: res
      g.adjacencyList(stack.pop).filter(!visited.contains(_)).map{
                                                        s => stack.push(s)
                                                        visited  += s }
    }
    res.reverse
  }

}
