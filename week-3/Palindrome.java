import java.util.*;
class  Palindrome
  {
    public static void main  (String args[])
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("enter  a number");
      int n=sc.nextInt();     
      int reverse=0;
       int temp=n;
      while(n>0)
        {
          int a=n%10;
          reverse=(reverse*10)+a;
          n=n/10;          
        }
      if(temp==reverse)
      {
        System.out.println("palindrome");
      }
      else{
        System.out.println("not a palindrome");
      }
    }
  }