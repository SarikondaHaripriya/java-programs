import java.util.*;
class Multiple
  {
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter a number");
      int p=sc.nextInt();
      if(p%5==0)
      {
        System.out.println("the given number is multiple of 5");
      }
      else
      {
        System.out.println("the given number is not multiple of 5");
      }
    }
  }