object ABSOLUTE{
   def absVal(a: Int) = if(a<0) -a else a

   def main(args:Array[String]): Unit = {

       var a = -100
       var b = 50
       var c = -25

       println(absVal(a));
       println(absVal(b));
       println(absVal(c));
       }
 }
