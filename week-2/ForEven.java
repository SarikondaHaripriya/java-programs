import java.util.*;
class ForEven
  {
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("enter a number ");
      int n=sc.nextInt();
      int i;
      for(i=1;i<=n;i++)
        {
          if(i%2==0)
          {
            System.out.println(i);
          }
        }
    }
  }