package P01

object LastElement {
  //제네릭 리스트(T) 타입으로 인자를 받아 제네릭(T) 타입을 리턴한다.
  def lastRecursive[T](ls: List[T]): T = ls match {
    case h :: Nil  => h //Nil : null의 친척이며 아무것도 없는 리스트라는 의미
    case _ :: tail => lastRecursive(tail)
    case _         => throw new NoSuchElementException
  }

  def main(args: Array[String]): Unit = {
    val result = lastRecursive(List(1, 2, 3, 5, 6, 4))

    println("result : "+result)
  }
}
