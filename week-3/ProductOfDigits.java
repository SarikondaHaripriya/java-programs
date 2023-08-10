import java.util.*;
class ProductOfDigits
  {
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("enter a number");
      int n=sc.nextInt();
      int result,product=1;
      while(n>0)
        {
          result=n%10;
          n=n/10;
          product=product*result;
        }
      System.out.println(product);
    }
  }