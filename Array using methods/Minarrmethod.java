//without returntype withparameters
import java.util.*;
class Minarrmethod
  {
    public void min(int a[],int n)
    {
      int min=a[0];
      for(int i=1;i<n;i++)
        {
         if(min>a[i])
         {
           min=a[i];
         }
        }
      System.out.println("the minimum element in the array is"+min);
    }
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      Minarrmethod s=new Minarrmethod();
      System.out.println("enter the array size");
      int n=sc.nextInt();
      int a[]=new int[n];
      System.out.println("enter the array elements");
      for(int i=0;i<n;i++)
        {
          a[i]=sc.nextInt();
        }
      s.min(a,n);
    }
  }