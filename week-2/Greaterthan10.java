import java.util.*;
class Greaterthan10
  {
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("enter a value");
      int p=sc.nextInt();
      if(p>10)
      {
        System.out.println("given number is greater");
      }
      else
      {
        System.out.println("the given number is smaller");
      }
    }
  }