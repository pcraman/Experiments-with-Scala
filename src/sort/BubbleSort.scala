
object BubbleSort {
	def main(args : Array[String]) {
		var l = Array(30,32,14,57,49,23)
		var res = bubbleSort(l)
		for (i <- 0 to (res.length - 1)) {
			print (res(i) + " ")
		}
		print ("\n")		

	}
	
	def bubbleSort (l : Array[Int]) : Array[Int] ={
		for (i <- 1 to (l.length - 1)) {
			for (j <- (i - 1) to 0 by -1) {
				if (l(j) > l(j+1)) {
					val temp = l(j)
					l(j) = l(j+1)
					l(j+1) = temp
				}
			}
		}
		l		
	}
}
