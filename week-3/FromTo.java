import java.util.*;
class FromTo
  {
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("enter a number where you want to start:");
      int a=sc.nextInt();
      System.out.println("enter a number where you want to end");
      int n=sc.nextInt();
      int i;
      for(i=a;i<=n;i++)
        {
          System.out.println(i);
        }
    }
  }