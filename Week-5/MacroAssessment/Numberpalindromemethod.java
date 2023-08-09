//without returntype without parameter
import java.util.*;
class Numberpalindromemethod
  {
    public void palindrome()
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("enter a number");
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
        System.out.println("entered number is a palindrome");
      }
      else{
        System.out.println("entered number is not a palindrome");
      }
    }
    public static void main(String args[])
    {
      Numberpalindromemethod s=new Numberpalindromemethod();
      s.palindrome();
      
    }
  }