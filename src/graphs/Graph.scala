
case class Edge(v1 : Int, v2 : Int, w : Int = 0)

class Graph (var n: Int){
  val numOfVertices = n
  var vertices = Set[Int]()
  var edges = List[Edge]()
  var adjacencyList = Map[Int, List[Int]]()

  def addEdge(v1 : Int, v2 : Int, isDirected : Boolean = false) = {
    if((!vertices.contains(v1) || !vertices.contains(v2))
        && vertices.size == numOfVertices)
      println("Cannot Add vertices, ERROR!")
    else {
      vertices += v1
      vertices += v2
      println("Adding the edge " + v1 + " " + v2)
      val e1 = new Edge(v1, v2)
      adjacencyList += e1.v1 -> (e1.v2::adjacencyList.getOrElse(e1.v1, Nil))
      if (!isDirected) {
        val e2 = new Edge(v2, v1)
        adjacencyList += e2.v1 -> (e2.v2::adjacencyList.getOrElse(e1.v1, Nil))
      }
    }
  }
}
