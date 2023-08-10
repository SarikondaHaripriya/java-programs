import java.util.*;
class EvenFromTo
  {
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("enter the starting number");
      int x=sc.nextInt();
      System.out.println("enter the ending number");
      int y=sc.nextInt();
      int i;
      for(i=x;i<=y;i++)
        {
          if(i%2==0)
          {
            System.out.println(i);
          }
        }
    }
  }