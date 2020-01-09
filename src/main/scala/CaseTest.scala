/**
 * @author 손영준 (youngjun.son@navercorp.com)
 */
class CaseTest {
  def calcType(calc: Calculator) = (calc.brand, calc.model) match {
    case ("HP", "20B") => "financial"
    case ("HP", "48G") => "scientific"
    case ("HP", "30B") => "business"
    case _ => "unknown"
  }
}

class Calculator(brandName: String, modelName: String) {
  var brand = brandName
  var model = modelName
}

object caseTestRun {
  def main(args: Array[String]): Unit = {
    var obj = new Calculator("HP", "20B")
    println(obj.brand)
    println(obj.model)

  }
}



