//without returntype with parameters
import java.util.*;
class Primemethod
  {
    public void prime(int n)
    {
      int count=0;
      for(int i=1;i<=n;i++)
        {
          if(n%i==0)
          {
            count++;
          }
        }
      if(count==2)
      {
        System.out.println(n+"is  a prime number");
      }
      else{
        System.out.println(n+"is not a prime number");
      }
    }
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      Primemethod s=new Primemethod();
      System.out.println("enter a number");
      int n=sc.nextInt();
      s.prime(n);
      
    }
  }