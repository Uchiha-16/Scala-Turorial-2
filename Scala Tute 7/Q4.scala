import scala.io.StdIn.readLine
object Q4 extends App {

        //Account Creation
        createAccount(01, 5000);
        createAccount(02, 5000);
        createAccount(03, 5000);
        createAccount(04, 5000);
        createAccount(05, 5000);
        createAccount(06, 5000);
        createAccount(07, 5000);
        createAccount(08, 5000);
        createAccount(09, 5000);
        createAccount(10, 5000);

        //Transfer Operations
        getAccount(01).transfer(getAccount(02), 12000);
        getAccount(03).transfer(getAccount(04), 2000);
        getAccount(06).transfer(getAccount(05), 10000);
        getAccount(08).transfer(getAccount(07), 7000);

        //Print Account Details
        println("\nNegative Balance Accounts");
        getnegBalanceAccts();

        println("Sum of all account balances");
        sumAllBalances();

        println("Calculate Interest");
        intrestCal();

    }

    var bank:List[account]=List();

    def createAccount(id:Int, balance:Double):Unit = {

        if (inBank(id) == true){
            println("Account number already exists");

        }
        else {
            bank = bank :+ new account(id, balance);
            println("Account Created")
        }

    }

    def getAccount(acctNo:Int):account = {

        return bank.filter(account => account.acctNo == acctNo)(0);

    }

    def getnegBalanceAccts():Unit = {

        var accts:List[account] = bank.filter(x => x.balance < 0);
        println(accts);
        println("\n");

    }

    def sumAllBalances():Unit = {

        var sum:Double = bank.map(x => x.balance).reduce((x, y) => x + y);

        println(f"$sum%.2f");
        println("\n");

    }

    def intrestCal():Unit = {

        bank.map(account => if account.balance > 0 then  account.deposit(account.balance * 0.05) else account.deposit(account.balance * 0.1));

        println(bank);
        println("\n");

    }

    class account(y:Int, z:Double = 0.00){

        def acctNo = y;
        var balance = z;

        def withdraw(amount:Double) = {
            this.balance = this.balance - amount;
        }
        def deposit(amount:Double) = {
            this.balance = this.balance + amount;
        }
        def transfer(that:account,amount:Double) = {
            this.withdraw(amount);
            that.deposit(amount);
        };

        override def toString = f"Account No: $acctNo%d | Balance: Rs.$balance%.2f";
    }

    def inBank(acctNo:Int):Boolean = {
        for (i <- bank){
            if (i.acctNo == acctNo){
                return true;
            }
        }
        return false;
    }
