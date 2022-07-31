import scala.io.StdIn._

object Q3 {

  def main(args: Array[String]): Unit = {

    // var a = readLine();

    println(formatNames("Benny", toUpper(_)))
    println(formatNames("Niroshan".substring(0,2), toUpper(_)) + formatNames("Niroshan".substring(2), toLower(_)))
    println(formatNames("Saman", toLower(_)))
    println(formatNames("Kumara".substring(0,1), toUpper(_)) + formatNames("Kumara".substring(1,5), toLower(_)) + formatNames("Kumara".substring(5), toUpper(_)))
  }

  def toUpper(s: String): String = {
     s.toUpperCase()
   }

   def toLower(s: String): String = {
     s.toLowerCase()
   }

   def formatNames(name: String, func: String => String): String = {
     func(name)
   }

}
