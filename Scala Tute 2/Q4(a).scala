object Q4A{

  def Salary(x: Int, y: Int): Unit = {
       var total: Double = 250 * x + 85 * y;
       var tax: Double = total * .12;
       total = total - tax;
       println(total);
  }

  def main(args: Array[String]): Unit = {
      var normal = 40;
      var ot = 30;
      Salary(normal,ot);

  }
}
