object SEASON{

  def main(args: Array[String]): Unit = {
    var month: Int = 10
    season(month)

}
def season(x: Int): Unit ={
    if(x == 1 || x == 2 || x == 12)
      println("Winter");
    else if(x == 3 || x == 4 || x == 5)
      println("Spring");
    else if(x == 6 || x == 7 || x == 8)
      println("Summer");
    else if(x == 9 || x == 10 || x == 11)
      println("Autumn");
    else
      println("Bogus month");
 }
}
