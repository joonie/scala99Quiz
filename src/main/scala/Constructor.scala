
/**
 * @author 손영준 (youngjun.son@navercorp.com)
 */
class basic3(brand: String) {
  val color: String = if (brand == "T1") {
    "blue"
  } else if(brand == "HP") {
    "black"
  } else {
    "white"
  }

  def add(a: Int, b: Int): Int = a * b
}

object ConstructorTest {
  def main(args:Array[String]):Unit = {
    val obj = new basic3("T1")
    println(obj.color)
  }
}
