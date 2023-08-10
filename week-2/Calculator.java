import java.util.*;
class Calculator
  {
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("enter value of a");
      int a=sc.nextInt();
      System.out.println("enter the values of b");
      int b=sc.nextInt();
      System.out.println("enter the operator ");
      char operator=sc.next().charAt(0);
      if(operator=='+')
      {
        double sum=a+b;
        System.out.println(sum);
      }
      else if(operator=='-')
      {
        double sum=a-b;
        System.out.println(sum);
      }
      else if(operator=='*')
      {
        double sum=a*b;
        System.out.println(sum);
      }
      else if(operator=='/')
      {
        double sum=a/b;
        System.out.println(sum);
      }
      else if(operator=='%')
      {
        double sum=a%b;
        System.out.println(sum);
      }
      else
      {
        System.out.println("entered number is invalid");
      }
      
      
    }
  }