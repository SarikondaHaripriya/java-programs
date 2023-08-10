import java.util.*;
class PosOrNeg
  {
    public static void positive(int n)
    {
      if(n>0)
      {
        System.out.println("number is positive");
      }
    }
    public static void negative(int n)
    {
      if(n<0)
      {
        System.out.println("number is negative");
      }
    }
    public static void zero(int n)
    {
     
      System.out.println("number is zero");
    }
      public static void main(String args[])
        {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number");
        int n=sc.nextInt();
        positive(n);
        negative(n);
        zero(n);
        }
  }