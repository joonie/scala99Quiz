/**
 * @author 손영준 (youngjun.son@navercorp.com)
 */
class ApplyClass {

}
object FooMaker {
 def apply() = new ApplyClass
}
object traitObj {
  def main(args: Array[String]): Unit = {
    val newFoo = FooMaker()
  }
}
