import scala.io.StdIn._

object Q4{
    def main(args: Array[String]): Unit = {

      print("Enter a number to check if even or odd: ")
      var n = readInt()

      print("The number you entered is Even - ")
      println(isEven(n))
    }

    def isEven(n:Int):Boolean= n match{
        case 0 => true
        case _ => isOdd(n-1)
    }

    def isOdd(n:Int):Boolean = !(isEven(n))
  }
