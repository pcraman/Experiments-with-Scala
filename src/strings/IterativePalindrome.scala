object IterativePalindrome {
	def main(args : Array[String]) {
		val str = "A man, a plan, a canal, Panama!"
		if (checkPalindrome(str))
			println(s"${str} - Palindrome")
		else 
			println(s"${str} - not Palindrome")
	}

	def checkPalindrome(p : String) : Boolean={
		val s = Set(',','!',' ', '*', '#')
		var i = 0
		var j = p.length - 1
		while (i <= j) {
			var b = p.charAt(i).toLower
			var e = p.charAt(j).toLower
			if (!s.contains(b) && !s.contains(e) && b != e)
				return false
			if (s.contains(b) && !s.contains(e)) i+=1
			else if (s.contains(e) && !s.contains(b)) j-=1
			else { i+=1; j-=1}
		}
		return true 
	}
}
