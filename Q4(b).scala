object Q4B{
    def profit(ticket: Int, customers: Int) : Int = {
      return ticket*customers;
    }

    def customercount(ticket: Int) : Int = {
      var count = 0;

      if(ticket > 15){
          count = ((ticket - 15) / 5) * (-20);
      }else if(ticket < 15){
          count = ((15 - ticket) / 5) * 20;
      }else{
          count = 0;
      }

      return count;
    }

    def totalprofit(ticket: Int, customers: Int) : Int = {
        var total = profit(ticket, customers + customercount(ticket));
        var cost = (500 + 3*(customers + customercount(ticket)));
        return total - cost;
    }
    def main(args: Array[String]): Unit = {
      printf("Total Profit is : %d",totalprofit(29, 120));
    }
}
