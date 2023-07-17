//with returntype without parameters
import java.util.*;
class Sumarrmethod
  {
    public int sum()
    {
      int sum=0;
      Scanner sc=new Scanner(System.in);
      System.out.println("enter the size of the array");
      int n=sc.nextInt();
      int a[]=new int[n];
      System.out.println("enter array elements");
      for(int i=0;i<n;i++)
        {
          a[i]=sc.nextInt();
        }
      for(int i=0;i<n;i++)
        {
          sum=sum+a[i];
        }
      return sum;
    }
    public static void main(String args[])
    {
      Sumarrmethod s=new Sumarrmethod();
      int result=s.sum();
      System.out.println("the sum of array elemnts are"+result);
    }
  }