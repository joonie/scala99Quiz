object basicMethod {
  def addOne(m: Int): Int = m + 1

  val addTwo = (x: Int) => x + 2 //이름없는 함수를 val에 저장
  def addTwoFunc = (x: Int) => x + 2

  def addThree(x: Int): Int = {
    println("call addThree")
    x * 2
  }

  def adder(a: Int, b: Int): Int = a + b

  def addr2 = adder(3, _: Int): Int

  def multiple(a: Int)(b: Int): Int = a * b

  val timesTwo = multiple(2) _

  def capitalizeAll(args: String*) = {
    args.map {
      arg => arg.capitalize
    }
  }

  def main(args: Array[String]): Unit = {
    println(addOne(3))
    println(addTwoFunc(3))
    println(adder(1,4))
    println(addr2(3))
    println(multiple(1)(2))
    println(timesTwo(3))
    println(capitalizeAll("abcd", "efgh"))
  }
}