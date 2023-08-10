import java.util.*;
class BiggerNumber
  {
  public static void bigger(int n, int p) 
    {
    if (n > p)
    {
      System.out.println("n is bigger");
    }
    else
    {
      System.out.println("p is bigger");
    }
  }
  public static void main(String args[])
  {
    Scanner sc = new Scanner(System.in);
    System.out.println("enter the number1");
    int num1 = sc.nextInt();
    System.out.println("enter the number2");
    int num2=sc.nextInt();
    bigger(num1,num2);

  }
}