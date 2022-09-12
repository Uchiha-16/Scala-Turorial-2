object Q1 extends App{

  var alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

  val E = (c:Char,key:Int,a:String)=> a((a.indexOf(c.toUpper)+key)%a.size)

  def decrypt(char:Char, key:Int, a:String):Char = {

      var index = a.indexOf(char.toUpper);

      if (index - key < 0) {
          return a(25 - (((25 - index) + key) % a.size));
      }
      else {
          return a(index - key);
      }

  }


  val cipher=(algo:(Char,Int,String)=> Char,s:String,key:Int,a:String)=>
  s.map(algo(_,key,a))

  var s = scala.io.StdIn.readLine("Enter String: ");

  val ct=cipher(E,s,10,alphabet)
  println(ct)

  val pt=cipher(decrypt,ct,10,alphabet)
  println(pt)

}
