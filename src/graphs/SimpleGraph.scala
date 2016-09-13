
object SimpleGraph {

  def main(args : Array[String]) {
    var g = new Graph(4)
    g.addEdge(Vertex(1), Vertex(3))
    println("Size is" + g.vertices.size)
  }
}
