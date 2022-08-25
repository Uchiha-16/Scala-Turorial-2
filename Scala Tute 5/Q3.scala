import scala.io.StdIn._

object Q3{
    def main(args: Array[String]): Unit = {

      print("Enter a number n to get the sum from 1: ")
      var n = readInt()

      println(sum(n))
  }

    def sum(n:Int):Int = {

       if(n == 0){
        return 0
      }
      else{
        n+sum(n-1)
      }
  }
}
