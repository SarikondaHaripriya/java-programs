//with returntype without parameters
import java.util.*;
class Oddarrmethod
  {
    int b;
    public int odd()
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("enter the size of the array");
      int n=sc.nextInt();
      int a[]=new int[n];
      System.out.println("enter the array elements");
      for(int i=0;i<n;i++)
        {
          a[i]=sc.nextInt();
        }
      //System.out.println("the odd numbers in the array are");
      for(int i=0;i<n;i++)
        {
          if(a[i]%2!=0)
          {
            b=a[i];
            //System.out.println(b);
          }
        }
      return b;      
    }
    public static void main(String args[])
    {
      Oddarrmethod s=new Oddarrmethod();
      int result=s.odd();
      System.out.println("the odd array elements are");
      System.out.println(result);
    }
  }
