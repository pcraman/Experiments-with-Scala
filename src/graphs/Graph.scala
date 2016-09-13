
case class Vertex(v : Int)
case class Edge(v1 : Vertex, v2 : Vertex, w : Int = 0)

class Graph (var numOfVertices: Int){

  var vertices = Set[Vertex]()
  var edges = List[Edge]()
  var adjacencyList = Map[Vertex, List[Vertex]]()
  (1 to numOfVertices).toList.map(vertices += Vertex(_))

  def addEdge(v1 : Vertex, v2 : Vertex, isDirected : Boolean = false) = {
    println("Adding the edge")
    val e1 = new Edge(v1, v2)
    adjacencyList += e1.v1 -> (e1.v2::adjacencyList.getOrElse(e1.v1, Nil))
    if (!isDirected) {
      val e2 = new Edge(v2, v1)
      adjacencyList += e2.v1 -> (e2.v2::adjacencyList.getOrElse(e1.v1, Nil))
    }
  }

  
}
