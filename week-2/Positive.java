import java.util.*;
class Positive
  {
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("enter a value");
      int n=sc.nextInt();
      if(n>0)
         {
        System.out.println("the number is positive");
         }
      else{
        System.out.println("number is negative");
      }
    }
  }