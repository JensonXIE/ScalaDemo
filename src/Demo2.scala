object Demo2 {
	def main(args: Array[String]): Unit = {
		println("multiplier(1) value is " + multiplier(1))
		println("multiplier(2) value is " + multiplier(2))
	}
	
	var factor = 3
    val multiplier = (i:Int) => i * factor
}