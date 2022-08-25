import scala.io.StdIn._

object Q6{
    def main(args: Array[String]): Unit = {

      print("Enter a Number to get the Fibonacci Sequence: ")
      var n=readInt()

      fibonacciSequence(n)
    }
    def fibonacci(n:Int):Int= n match{
      case 0 => 0
      case x if x==1 => 1
      case _ => fibonacci(n-1)+fibonacci(n-2)
    }

    def fibonacciSequence(n:Int):Unit = {

      if (n > 0) fibonacciSequence(n-1)

      println(fibonacci(n))
    }
  }
