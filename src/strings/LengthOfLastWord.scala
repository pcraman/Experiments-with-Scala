// Find the length of last word of the given sentence
object LengthOfLastWord {
	def main(args : Array[String]) {
		val str = "This is a practice program"
 		val res = getLenOfLastWord(str)
		println(s"Length of last word of the sentence '${str}' is $res")
	}
	def getLenOfLastWord(str : String) : Int={
		var arrOfWords : Array[String] = str.split(" ")
		var numOfWords = arrOfWords.size
		var sizeOfLastWord = arrOfWords(numOfWords - 1).size
		return sizeOfLastWord
	}
}
