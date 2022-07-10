object Q3{
  def main(args: Array[String]): Unit = {
      var a: Int = 2
      var b: Int = 3
      var c: Int = 4
      var d: Int = 5
      var k: Float = 4.3f
      var g: Float = 4.0f

      b-=1 //increment and decrement in scala is invalid
//So we take Increase and assignment operator
// and Decrease and assignment operator
      printf("--b*a + c*d-- = %d\n",b*a + c*d);
      d-=1;
      printf("a++ = %d\n",a);
      a+=1;
      printf("-2*(g-k) + c = %.1f\n", ( - 2 )*(g-k) + c);
      printf("c = c++ = %d\n",c);
      c+=1;
      c+=1;
      c = a*c;
      // c = c+=1 * a+=1;
      printf("c = ++c * a++ = %d",c);

    }
  }
