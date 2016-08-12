
object CelsiusToFahrenheit {

	def main (args : Array[String])  {
		println (celsiusToFahrenheit(22.5))
	}

	def celsiusToFahrenheit(x : Double) : Double = {
		var res = (x *  9 / 5 ) + 32
		return res
	}
}
