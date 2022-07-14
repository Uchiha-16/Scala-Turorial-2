object LARGEST{
  def largeternary(x: Int,y: Int,z: Int) = if(x>y && x>z) x else if (y>x && y>z) y else z
//In other programming languages there is a definite, unique ternary operator syntax,
//but in Scala, the ternary operator is just the normal Scala if/else syntax:
  def largestif(x: Int,y: Int,z: Int): Int = {
      if(x>y && x>z){
        return x;
      }else if(y>x && y>z){
        return y;
      }else{
        return z;
      }
  }

  def main(args: Array[String]): Unit = {
    var a = 900
    var b = 100
    var c = 70

    println(largestif(a,b,c))
    println(largeternary(a,b,c))

  }

}
