object Q3 extends App {

    var account = scala.collection.mutable.Map(0 -> 0.0);
    var choose:Int = 0

    while(choose!=4){
        println("1. Add Account and Balance: ")
        println("2. Transfer amount")
        println("3. Check Balance: ")
        println("4. Exit")
        println("Enter your choice")
        choose = scala.io.StdIn.readInt();

        choose match {
          case 1 => addAccount
          case 2 => transfer
          case 3 => details
          case _ => sys.exit(0);
        }



        def addAccount = {
          println("Enter the Account Number: ")
          val x = scala.io.StdIn.readInt();
          println("Enter the Account balance:Rs. ")
          val y = scala.io.StdIn.readDouble();

          account.put(x, y);
        }

        def transfer = {
          println("Enter the Account Number: ")
          val a = scala.io.StdIn.readInt();
          println("Enter the Account you want to transfer: ")
          val b = scala.io.StdIn.readInt();
          println("Enter the Amount:Rs. ")
          val c = scala.io.StdIn.readDouble();

          if(b != 0){
            account(a) = account(a) - c
            account(b) = account(b) + c
            println("Transfer Successfully")
          }else{
            println("0 cannot consider as an Account Number")
            println("Invalid Operation")
          }
        }

        def details = {
          account.keys.foreach{ i =>
             print( "Account No = " + i )
             println(" Amount = Rs." + account(i) )}
       }
   }

}
