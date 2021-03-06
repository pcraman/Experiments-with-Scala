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

  def preorderTraversal(t: Option[Tree[Int]]): Unit = {
    t match {
      case None =>
      case Some(x) =>
        println(x.value)
        if (x.left != None) preorderTraversal(x.left)
        if (x.right != None) preorderTraversal(x.right)
    }
  }

  def postorderTraversal(t: Option[Tree[Int]]): Unit = {
    t match {
      case None =>
      case Some(x) =>
        if (x.left != None) postorderTraversal(x.left)
        if (x.right != None) postorderTraversal(x.right)
        println(x.value)
    }
  }
  def main(arr: Array[String]) {
    var t = Some(Tree(7, Some(Tree(3, None, None)), Some(Tree(2, None, None))))
    println(s"Tree : ${t} ")
    println("Inorder Traversal = ")
    inorderTraversal(t)
    println("Preorder Traversal = ")
    preorderTraversal(t)
    println("Postorder Traversal = ")
    postorderTraversal(t)
  }
}
