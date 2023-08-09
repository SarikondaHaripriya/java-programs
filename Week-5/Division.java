//with returntype with parameters
import java.util.*;
class Division
  {
    public int div(int a,int b)
    {
      int c=a/b;
      return c;
    }
    public static void main(String args[])
    {
      Scanner sc=new Scanner (System.in);
      System.out.println("enter a and b values");
      int a=sc.nextInt();
      int b=sc.nextInt();
      Division s=new Division();
      int d=s.div(a,b);
      System.out.println("the divison result is"+d);
      
    }
  }