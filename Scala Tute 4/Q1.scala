object Q1 {
    def main(args: Array[String]): Unit = {
      var amount: Float = 1425462.05f

      println("Amount of interest in a year:Rs.  " + interest(amount))
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
