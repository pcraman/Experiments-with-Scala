// LookAndSay problem. Adapted from https://www.rosettacode.org/wiki/Look-and-say_sequence#using_Iterator
object LookAndSay {
	def main(args : Array[String])  {
		val num = 5
		println (s"The ${num}'th element of LookAndSay sequence is " + lookAndSay(num)); 
	}
	def lookAndSay(n : Int) : String={
		var s:String = "1"
		for (i <- 1 until n) {
			s = nextNumber(s)	
		}
		return s;
	}

	def nextNumber(s : String) : String ={
		var list = List.range(1, s.size)
		list.foldLeft(s(0), 1, new StringBuilder) {
			case((character, count, stringBuilder), index) if (character != s(index)) => 
				stringBuilder.append(count)
				stringBuilder.append(character)
				(s(index), 1, stringBuilder)
			case((character, count, stringBuilder), index) =>
				(character, count + 1, stringBuilder)
		} match {
			case(character, count, stringBuilder) =>
				stringBuilder.append(count)
                                stringBuilder.append(character)
				stringBuilder.toString
		}
	}
	

}



