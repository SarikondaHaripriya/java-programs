//with returntype without parameter
import java.util.*;
class Factorialmethod
  {
    public int fact()
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("enter a number");
      int n=sc.nextInt();
      int i,x=1;
      System.out.println("the factorial of the number is");
      for(i=1;i<=n;i++)
        {
          x=x*i;
        }
      return x;
    }
    public static void main(String args[])
    {
      Factorialmethod s=new Factorialmethod();
      int result=s.fact();
      System.out.println(result);
    }
  }