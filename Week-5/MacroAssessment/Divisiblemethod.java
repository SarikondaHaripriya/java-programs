//withreturntype with parameters
//checking weather the number is divisible by 3 and 5
import java.util.*;
class Divisiblemethod
  {
    int result;
    public int division(int n)
    {      
          if((n%3==0)&&(n%5==0))
          {
            result=n;
            System.out.println("the number is divisible by 3 and 5");
          }
      else{
        System.out.println("the number is not divisible");
      }
      
      return result;      
    }
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      Divisiblemethod s=new Divisiblemethod();
      System.out.println("enter n value");
      int n=sc.nextInt();
      s.division(n);
      //System.out.println("the number is divisible by both 3 and 5");
      
    }
  }