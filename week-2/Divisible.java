import java.util.*;
class Divisible
{
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
    System.out.println("enter the value of first variable ");
    int a=sc.nextInt();
    System.out.println("enter the value of second variable ");
    int b=sc.nextInt();
    if(a%b==0)
    {
      System.out.println("print number is divisible");     
    }
    else
    {
      System.out.println("print number is not divisible");
    }
  }
}
   