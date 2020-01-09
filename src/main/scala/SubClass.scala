
/**
 * @author 손영준 (youngjun.son@navercorp.com)
 */

class ParentClass(param: String) {
  val brand: String = "HP"
  def add(m: Int, n: Int): Int = m + n
}

class SubClass(brand: String) extends ParentClass(brand) {
  def log(m: Double, base: Double) = math.log(m) / math.log(base)
}

object SubClassTest {
  def main(args:Array[String]):Unit = {
    val obj = new SubClass("test")
    println(obj.log(1.0, 2.0))
    println(obj.add(1, 2))
    println(obj.brand)
  }
}
