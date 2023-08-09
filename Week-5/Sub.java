//without return type without parameters
import java.util.*;
class Sub
  {
    public static void main(String args[])
    {
      Sub s=new Sub();
      s.subt();
    }
      public void subt()
        {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a and b values");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=a-b;
        System.out.println("the subtraction of elements is"+c);
        
        }
    }
  