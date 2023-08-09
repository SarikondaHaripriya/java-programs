//without returntype and with parameters
import java.util.*;
class Addmethod
  {
    public void add(int a,int b)
    {
      int c=a+b;
      System.out.println("the addition of two numbers is "+c);
    }
    public static void main(String args[])
    {
      Addmethod d=new Addmethod();
      Scanner sc=new Scanner(System.in);
      System.out.println("enter a and b values");
      int a=sc.nextInt();
      int b=sc.nextInt();
      d.add(a,b);
      
    }
  }