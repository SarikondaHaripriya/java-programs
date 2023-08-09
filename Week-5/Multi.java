//without returntype with parameters
import java.util.*;
class Multi
  {
    public void mul(int a,int b)
    {
      int c=a*b;
      System.out.println("the multiplied value is"+c);
    }
    public void div(int a,int b)
    {
      int d=a/b;
      System.out.println("the division is"+d);
    }
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("enter a and b values");
      int a=sc.nextInt();
      int b=sc.nextInt();
      Multi s=new Multi();
      s.mul(a,b);
      s.div(a,b);
      
      
    }
  }