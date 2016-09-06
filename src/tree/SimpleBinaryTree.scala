object SimpleBinaryTree {
  case class Tree[Int](value: Int,
    left: Option[Tree[Int]],
    right: Option[Tree[Int]])

  def inorderTraversal(t: Option[Tree[Int]]): Unit = {
    t match {
      case None =>
      case Some(x) =>
        if (x.left != None) inorderTraversal(x.left)
        println(x.value)
        if (x.right != None) inorderTraversal(x.right)
    }
  }
  def main(arr: Array[String]) {
    var t = Some(Tree(7, Some(Tree(3, None, None)), Some(Tree(2, None, None))))
    println(s"Inorder Traversal of tree : ${t} is = ")
    inorderTraversal(t)
  }
}
