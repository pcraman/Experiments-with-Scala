
object ReverseWords {
	def main (args : Array[String]) {
		val givenSentence = "hello world program"
		val result = reverseWordsInSentence(givenSentence)
		println("Given Sentence : " + givenSentence + "\nAnswer : " + result)
	}
	def reverseWordsInSentence(sentence :String) : String={
		var words :Array[String] = sentence.split(" ")
		var res = words.reverse mkString " "
		return res
	}
}
