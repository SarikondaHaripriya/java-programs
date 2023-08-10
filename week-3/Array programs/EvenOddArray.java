import java.util.*;
class EvenOddArray
  {
    public static void even(int a[])
    {
      int evencount=0;
      for(int i=0;i<a.length;i++)
        {
          if(a[i]%2==0)
          {
            evencount=evencount+1;
          }
        }
      System.out.println("the even numbers present are:"+evencount);
    }
    public static void odd(int a[])
    {
      int oddcount=0;
      for(int i=0;i<a.length;i++)
        {
          if(a[i]%2!=0)
          {
            oddcount=oddcount+1;
          }
        }
      System.out.println("the odd numbers present are:"+oddcount);
    }
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      int a[]=new int[5]; 
      System.out.println("enter the array elements");
      for(int i=0;i<a.length;i++)
      {
        a[i]=sc.nextInt();
      }
      even(a);
      odd(a);
    }
  }