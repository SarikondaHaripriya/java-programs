import java.util.*;
class ForMethod
  {
    public static void repeat(int n)
    {
      for(int i=1;i<=n;i++)
        {
          System.out.println(i);
        }
    }
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("enter the value");
      int n=sc.nextInt();
      repeat(n);
    }
  }