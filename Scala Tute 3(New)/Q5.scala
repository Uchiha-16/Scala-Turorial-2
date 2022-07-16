object RUN{
   def main(args: Array[String]): Unit = {
     var total: Int = easy(2)+tempo(3)+easy(2)
      println("Total running time: " + total)
  }
    def tempo(x:Int):Int=x*7

    def easy(x:Int):Int=x*8
}
