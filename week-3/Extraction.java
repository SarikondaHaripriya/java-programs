import java.util.*;
class Extraction
  {
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("enter a number");
      int n=sc.nextInt();
      while(n>0)
        {
          int result=n%10;
          System.out.println(result);
          n=n/10;
        }
    }
  }