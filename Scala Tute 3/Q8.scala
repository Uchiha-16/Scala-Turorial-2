object Celsius_Fahrenheit{

  def main(args: Array[String]) : Unit = {

    var Celcius: Int = 37
    var Fahrenheit: Int = 98
    println(CtoF(Celcius));
    println(FtoC(Fahrenheit));
  }

  def CtoF(temp: Int): Double = {
      return((temp * 9.0 / 5.0) + 32.0) ;
  }
  def FtoC(temp: Int): Double = {
    return(((temp-32) * 5) / 9);
  }
}
