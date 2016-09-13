
object SimpleGraph {

  def main(args : Array[String]) {
    var g = new Graph(4)
    g.addEdge(1, 3)
    g.addEdge(1, 4)
    g.addEdge(2, 3)
    g.addEdge(1, 5)
    println("Size is " + g.vertices.size)
  }
}
