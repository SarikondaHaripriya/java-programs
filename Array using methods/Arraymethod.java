//without returntype with parameters
import java.util.*;
class Arraymethod
  {
    public void arr(int a[],int n)
    {
      for(int i=0;i<n;i++)
        {
          System.out.print(a[i]+" ");
        }
    }
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("enter the size of the array");
      int n=sc.nextInt();
      System.out.println("enter the array elements");
      int a[]=new int[n];
      for(int i=0;i<n;i++)
        {
          a[i]=sc.nextInt();
        }
      Arraymethod b=new Arraymethod();
      b.arr(a,n);
      
    }
  }
