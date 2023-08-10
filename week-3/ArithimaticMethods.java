import java.util.*;
class ArithimaticMethods
  {
    public static void add(int a,int b)
    {
      int result=a+b;
      System.out.println("the addition is "+result);      
    }
    public static void sub(int a,int b)
    {
      int result=a-b;
      System.out.println("the subtraction is "+result);
    }
    public static void multi(int a,int b)
    {
      int result=a*b;
      System.out.println("the multiplication is "+result);
    }
    public static void division(int a,int b)
    {
      int result=(a/b);
      System.out.println("the division is "+result);
    }
    public static void remainder(int a,int b)
    {
      int result=a%b;
      System.out.println("the remainder is "+result);
    }
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("enter a value");
      int a=sc.nextInt();
      System.out.println("enter b value");
      int b=sc.nextInt();
      add(a,b);
      sub(a,b);
      multi(a,b);
      division(a,b);
      remainder(a,b);
    }
  }