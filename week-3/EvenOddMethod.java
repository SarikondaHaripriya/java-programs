import java.util.*;
class EvenOddMethod
  {
    public static void even(int n)
    {
      if(n%2==0)
      {
        System.out.println("number is even");
      }
    }
    public static void odd(int x)
    {
      if(x%2!=0)
      {
        System.out.println("number is odd");
      }
    }
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("enter the number");
      int num=sc.nextInt();
      even(num);
      odd(num);
      
    }
  }