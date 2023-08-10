import java.util.*;
class FirstAndLastDigit
  {
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("enter a number");
      int n=sc.nextInt();
      int temp=n;
      int first=0;
      int last=0;
      while(n>0)
        {
          first=n%10;
           n=n/10;         
        }
      System.out.println("the first digit is "+first);
      last=temp%10;
      System.out.println("the last digit is "+last);
    }
    
  }