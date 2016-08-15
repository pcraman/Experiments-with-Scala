object SimplePalindrome {
	def main (args : Array[String]) {
		val s = "abba"
		println(s"$s is " + checkPalindrome(s))

		val x = "abc"
		println(s"$x is " + checkPalindrome(x))
	}

	def checkPalindrome(x : String) : String={
		if (x == x.reverse) 
			return "palindrome"
		else 
			return "not palindrome"
	}
}
