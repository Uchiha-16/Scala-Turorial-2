object ODDEVEN{
  def oddeven(x: Int) = if(x%2 == 0) println("Even") else println("Odd");

  def main(args: Array[String]): Unit = {
    var a = 19
    var b = 12
    oddeven(a)
    oddeven(b)
  }

}
