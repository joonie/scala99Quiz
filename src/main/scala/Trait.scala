/**
 * @author 손영준 (youngjun.son@navercorp.com)
 */
trait Car {
  val brand: String
}

trait Shiny {
  val shineRefraction: Int
}

class BMW extends Car with Shiny {
  val brand = "BMW"
  val shineRefraction = 12
}

object traitObj {
  def main(args: Array[String]): Unit = {
    val obj = new BMW()
    println(obj.brand)
    println(obj.shineRefraction)
  }
}
