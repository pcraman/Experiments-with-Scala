object Factorial {
	def main(args : Array[String]) {
		var res = factorialNum(5)
		println ("Answer is " + res)
	}
	def factorialNum (n : Int) : Int ={
		var i = n
		var res = 1
		while (i > 0) {
			res = res * i
			i = i - 1
		}
		return res
	}
}
