import java.util.*;
class FactorMethod
  {
    public static void factor(int n)
    {
      for(int i=1;i<=n;i++)
        {
          if(n%i==0)
          {
            System.out.println(i);
          }
        }
    }
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("enter a number");
      int n=sc.nextInt();
      factor(n);
    }
  }