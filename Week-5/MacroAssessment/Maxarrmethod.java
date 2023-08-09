//without returntype without parameter
import java.util.*;
class Maxarrmethod
  {
    public void max()
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("enter the array size");
      int n=sc.nextInt();
      int a[]=new int[n];
      int max=a[0];
      System.out.println("enter the array elements");
      for(int i=0;i<n;i++)
        {
          a[i]=sc.nextInt();
        }
      for(int i=0;i<n;i++)
        {
          if(max<a[i])
          {
            max=a[i];
          }
        }
      System.out.println("the maximum element in the array is"+max);
    }
    public static void main(String args[])
    {
      Maxarrmethod s=new Maxarrmethod();
      s.max();
    }
  }