import scala.io.StdIn._

object Q5{
    def main(args: Array[String]): Unit = {

      print("Enter a Number n to get the sum of the even numbers from 0: ")
      var n=readInt()

      println(evenSum(n))
    }

    def evenSum(n:Int):Int = {
     if(n%2==0){
        if(n==0)
          return 0
        else
           n+evenSum(n-1)
     }
     else{
        evenSum(n-1)
     }
   }
}
