object LARGEST{
  def largeternary(x: Int,y: Int) = if(x>y) x else y;
//In other programming languages there is a definite, unique ternary operator syntax,
//but in Scala, the ternary operator is just the normal Scala if/else syntax:
  def largestif(x: Int,y: Int): Int = {
      if(x>y){
        return x;
      }else{
        return y;
      }

  }

  def main(args: Array[String]): Unit = {
    var a = 90
    var b = 100

    println(largestif(a,b))
    println(largeternary(a,b))

  }

}
