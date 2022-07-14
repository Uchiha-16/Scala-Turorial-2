object IFELSE{

  def main(args: Array[String]): Unit = {
    var average: Float = 68.0f

    statement(30,45,21);
    nested(31,90,68);
    println(ternary(78,87,98));
}
def statement(x: Int,y: Int,z: Int): Unit ={
  var avg1: Float= (x+y+z) / 3f
    if(avg1 < 0)
      println("Invalid Marks");
    else if(avg1 <= 39.0)
      println("Fail");
    else if(avg1 <= 54.0)
      println("Pass");
    else if(avg1 <= 69.0)
      println("Good");
    else
      println("Very Good");
}

  def nested(x: Int,y: Int,z: Int): Unit = {
    var avg2: Float = (x+y+z) / 3f
      if(avg2 > 0)
        if(avg2 > 39.0)
          if(avg2 > 54.0)
            if(avg2 > 69.0)
              println("Very Good")
            else
              println("Good")
          else
            println("Pass")
        else
          println("Fail")
      else
        println("Invalid Marks")
  }

  def ternary(x: Int,y: Int,z: Int) = if((x+y+z) / 3 < 0) "Inavalid" else if((x+y+z) / 3 <= 39.0) "Fail" else if((x+y+z) / 3 <= 54.0) "Good" else if((x+y+z) / 3 <= 69.0) "Inavalid" else "Very Good"

  }
