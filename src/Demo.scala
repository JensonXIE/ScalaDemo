object Demo {
	def main(args: Array[String]): Unit = {
		println("Hello Scala!")
		
		var testvar: String = "测试变量"
		println(testvar)
		
		val xmax, ymax = 100
		println(xmax + "：" + ymax)
		
		
		val pa = (40, "Foo")
		println(pa)
	}
}


class Outer {
	
	class Inner {
		private def f(): Unit = {
			println("f")
		}
		class InnerMost{
			f()
		}
		def ff(){
			println("public测试")
		}
	}
	(new Inner).ff()
}




