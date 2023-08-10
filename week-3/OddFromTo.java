import java.util.*;
class OddFromTo
  {
    public static void  main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("enter the first number");
      int a=sc.nextInt();
      System.out.println("enter the stop number");
      int b=sc.nextInt();
      int i;
      for(i=a;i<=b;i++)
        {
          if(i%2!=0)
          {
            System.out.println(i);
          }
        }
    }
  }