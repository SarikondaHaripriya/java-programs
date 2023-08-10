import java.util.*;
class Reverse
  {
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("enter a number");
      int n=sc.nextInt();
      int reverse=0;
      while(n>0)
        {
          int x=n%10;
          reverse=(reverse*10)+x;
          n=n/10;
        }
      System.out.println("the reverse of the number is "+reverse);
    }
  }