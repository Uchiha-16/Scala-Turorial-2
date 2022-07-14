import scala.io.StdIn.readDouble
import scala.io.StdIn.readLine

object CALCULATOR {

  def main(args: Array[String]): Unit = {

    var result: Double = 0

    // var input =  new Scanner(System.in);
    println("Choose an operator: +, -, *, or /");
    var operator = readLine();

    println("Enter first number");
    var n1 = 20.0

    println("Enter second number");
    var n2 = 12.0

    operator match {

      // performs addition between numbers
      case "Addition" =>
        result = n1 + n2;
        println(n1 + " + " + n2 + " = " + result);

      // performs subtraction between numbers
      case "Sub" =>
        result = n1 - n2;
        println(n1 + " - " + n2 + " = " + result);

      // performs multiplication between numbers
      case "Mul" =>
        result = n1 * n2;
        println(n1 + " * " + n2 + " = " + result);

      // performs division between numbers
      case "Div" =>
        result = n1 / n2;
        println(n1 + " / " + n2 + " = " + result);

      case _ => println("Invalid operator!");
    }

  }
}
