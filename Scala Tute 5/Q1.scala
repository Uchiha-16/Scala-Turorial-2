import scala.io.StdIn._

object Q1 {
  def main(args: Array[String]): Unit = {

    print("Enter a Number to check if prime or not: ")
    var n = readInt()

    println(isPrime(n,2))
  }

  def gcd(a:Int,b:Int):Int = b match{
    case 0 => a
    case b if(b>a) => gcd(b,a)
    case _ => gcd(b,a%b)
  }

  def isPrime(n:Int,i:Int):Boolean = n match{
    case n if n==i => true

    case n if gcd(n,i)>1 => false

    case n  => isPrime(n,i+1)

  }
}
