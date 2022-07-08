object Q2{
  def main(args: Array[String]): Unit = {
      var a: Int = 2
      var b: Int = 3
      var c: Int = 4
      var d: Int = 5
      var k: Float = 4.3f



      b-=1;
      printf("--b*a + c*d-- = %d\n",b*a + c*d);
      a+=1;
      printf("++a = %d\n",a);

      printf("-2*(a-k) + c = %f\n", ( - 2 )*(a-k) + c);
      c+=1;
      printf("c = c++ = %d\n",c);
      c+=1;
      c = a*c;
      // c = c+=1 * a+=1;
      printf("c = ++c * a++ = %d",c);

    }
  }
