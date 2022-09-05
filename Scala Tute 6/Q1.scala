
object tutorial6 {

    def main(args: Array[String]):Unit ={

        var encryption:String = cypher(alphabet, 10)(encrypt(_,_));
        println(encryption);
        var decryption:String = cypher(encryption, 10)(decrypt(_,_));
        println(decryption);

    }

    var alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

    def encrypt(char:Char, key:Int):Char = {

        var index = alphabet.indexOf(char.toUpper);

        if (index + key >= alphabet.length) {
            return alphabet.charAt((index + key) % alphabet.length);
        }
        else {
            return alphabet.charAt(index + key);
        }

    }

    def decrypt(char:Char, key:Int):Char = {

        var index = alphabet.indexOf(char.toUpper);

        if (index - key < 0) {
            return alphabet.charAt(25 - (((25 - index) + key) % alphabet.length) );
        }
        else {
            return alphabet.charAt(index - key);
        }

    }

    def cypher(string:String, key:Int)(crypt:(Char, Int) => Char):String = {
        var output:String = string.map(crypt(_, key));
        return output;
    }

}
