class Rational(a:Int, b:Int){
    def numerator = a;
    def denominator = b;

    def add(r: Rational) = new Rational(numerator * r.denominator + r.numerator * denominator, denominator * r.denominator)
    override def toString(): String = numerator + "/" + denominator;
}

object Q1 extends App {
  val x = new Rational(3, 4)
  val y = new Rational(5, 8)
  val z = new Rational(2, 7)


    println(x.add(y).add(z));
}
