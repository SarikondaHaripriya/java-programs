//without returntype with parameters
import java.util.*;
class Negativearrmethod
  {
    public void negative(int a[],int n)
    {
      System.out.println("the negative array elements are");
      for(int i=0;i<n;i++)
        {
          if(a[i]<0)
          {
            System.out.println(a[i]);
          }
        }
    }
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      Negativearrmethod s=new Negativearrmethod();
      System.out.println("enter the size of the array");
      int n=sc.nextInt();
      int a[]=new int[n];
      System.out.println("enter the array elements");
      for(int i=0;i<n;i++)
        {
          a[i]=sc.nextInt();
        }
      s.negative(a,n);
    }
  }