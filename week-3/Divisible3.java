import java.util.*;
class Divisible3
  {
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("enter a number");
      int n=sc.nextInt();
      int i;
      for(i=1;i<=n;i++)
        {
          if(i%3==0)
          {
            System.out.print(i+" ");
          }
        }
    }
  }