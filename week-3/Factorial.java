import java.util.*;
class Factorial
  {
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("enter the number");
      int n=sc.nextInt();
      int i,x=1;
      System.out.println("the factorial of the number is ");
      for(i=1;i<=n;i++)
        {
          x=x*i;
        }
      System.out.println(x);
    }
  }