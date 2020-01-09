/**
 * @author 손영준 (youngjun.son@navercorp.com)
 */
class basic2() {
  val brand:String = "HP"
  def add(a:Int, b:Int):Int = a + b
}

object ClassTest {
  def main(args:Array[String]):Unit = {
    val basicInstance = new basic2
    println(basicInstance)
    println(basicInstance.brand)
    println(basicInstance.add(1,2))
  }
}
