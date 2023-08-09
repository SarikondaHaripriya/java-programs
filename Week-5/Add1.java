//with returntype without parameters
import java.util.*;
class Add1
  {
    public float add()
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("enter a value");
      float a=sc.nextFloat();
      float b=sc.nextFloat();
      float c=a+b;
      return c;
    }
    public static void main(String args[])
    {
      Add1 s=new Add1();
      float sum=s.add();
      System.out.println("the result is "+sum);
    }
  }