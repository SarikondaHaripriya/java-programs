import java.util.*;
class SumOfDigits
  {
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("enter a number ");
      int n=sc.nextInt();
      int result,sum=0;
      while(n>0)
        {
          result=n%10;
          n=n/10;
          sum=sum+result;         
        }
       System.out.println(sum);
    }
  }