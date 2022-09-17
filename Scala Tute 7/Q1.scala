class Rational(a:Int, b:Int){
    def numerator = a;
    def denominator = b;

    def neg = new Rational(-this.numerator,this.denominator);
    override def toString(): String = numerator.toString + "/" + denominator.toString;
}

object Q1 extends App {
    print("Enter numerator: ")
    var x = scala.io.StdIn.readInt();
    print("Enter denominator(cannot be <= 0): ")
    var y = scala.io.StdIn.readInt();
    var p = new Rational(x, y);

    println(p.neg);
}
