//with returntype with parameters
import java.util.*;
class Sumnaturalmethod
  {
    public int sum(int n)
    {
      int sum=0;
      for(int i=1;i<=n;i++)
        {
          //System.out.println(i);
          sum=sum+i;
        }
      return sum;
    }
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      Sumnaturalmethod s=new Sumnaturalmethod();
      System.out.println("enter a number");
      int n=sc.nextInt();
      int result=s.sum(n);
      System.out.println("the sum of natural numbers is"+result);
      
    }
  }