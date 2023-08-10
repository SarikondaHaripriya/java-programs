import java.util.*;
class FibonanciiSeries
  {
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("enter a number ");
      int limit=sc.nextInt();
      int first=0,second=1;
      int i;
      System.out.print(first+" ");
      System.out.print(second+" ");
      for(i=1;i<=limit;i++)
        {
          int third=first+second;
          System.out.print(third+" ");
          first=second;
          second=third;
        }
      
    }
  }