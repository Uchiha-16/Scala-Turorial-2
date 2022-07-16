object COST{
    def main(args: Array[String]): Unit = {
      var total:Double = (bookPrice(60) - discount(bookPrice(60)) + shippingCost(60))
      println("Total wholesale cost for 60 book: Rs." + total)
    }


    def shippingCost(x:Int):Double = 3 * x+(x-50) *.75

    def discount(amount:Double):Double = amount*.4

    def bookPrice(x:Int):Double= x * 24.95

}
