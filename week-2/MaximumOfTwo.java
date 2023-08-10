import java.util.*;
class MaximumOfTwo
  {
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("enter a value");
      int a=sc.nextInt();
      System.out.println("enter b value");
      int b=sc.nextInt();
      if(a>b)
      {
        System.out.println("the maximum number is"+a);
      }
      else{
        System.out.println("the maximum number is "+b);
      }
      
    }
  }