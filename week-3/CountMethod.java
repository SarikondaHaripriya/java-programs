import java.util.*;
class CountMethod
  {
    public static void count(int n)
    {
      int result,count=0;
      while(n>0)
        {          
          result=n%10;
          n=n/10;
          count=count+1;          
        }  
      System.out.println(count);
    }
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("enter a number");
      int n=sc.nextInt();
      count(n);
    }
  }