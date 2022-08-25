import scala.io.StdIn._

object Q1 {
    def main(args: Array[String]): Unit = {
      // var amount: Float = 1425462.05f

      print("Enter Deposit Amount: ")
      var amount = readFloat()
      println("Amount of itheh depsoit in the year:Rs.  " + amount)
      println("Amount of interest in the year:Rs.  " + interest(amount))
    }
    def interest(x: Float):Float = {
      if(x < 20000){
        return (x * .02f)
      }else if(x < 200000){
        return (x * .04f)
      }else if(x < 2000000){
        return (x * .035f)
      }else{
        return (x * .065f)
      }
    }
}
