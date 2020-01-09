/**
 * @author 손영준 (youngjun.son@navercorp.com)
 */
class PatternMatch {
  def bigger(o: Any): Any = {
    o match {
      case i: Int if i < 0 => i - 1
      case i: Int => i + 1
      case d: Double if d < 0.0 => d - 0.1
      case d: Double => d + 0.1
      case text: String => text + "s"
    }
  }
}

object matchTest {
  def main(args: Array[String]): Unit = {
    val obj = new PatternMatch
    println(obj.bigger(2))
    println(obj.bigger(-2))
    println(obj.bigger(2.3))
    println(obj.bigger(-2.3))
    println(obj.bigger("ab"))
  }
}