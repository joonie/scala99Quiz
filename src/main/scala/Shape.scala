/**
 * @author 손영준 (youngjun.son@navercorp.com)
 */
abstract class Shape {
  def getArea():Int
}

class Circle(r: Int) extends Shape {
  override def getArea(): Int = {r * r * 3}
}

object ShapeTest {
  def main(args: Array[String]): Unit = {
    val c = new Circle(2)
    println(c.getArea())
  }
}