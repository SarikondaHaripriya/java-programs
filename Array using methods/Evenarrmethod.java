//with returntype with parameters
import java.util.*;
class Evenarrmethod
  {
    int b;
    public int even(int a[],int n)
    {
     for(int i=0;i<n;i++)
       {
         if(a[i]%2==0)
         {
           b=a[i];
           //System.out.println("the even numbers are"+b);
         }
       }
       return b;      
    }
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      Evenarrmethod s=new Evenarrmethod();
      System.out.println("enter the size of the array");
      int n=sc.nextInt();
      int a[]=new int[n];
      System.out.println("enter the array elements");
      for(int i=0;i<n;i++)
        {
          a[i]=sc.nextInt();
        }
      int result=s.even(a,n);
      System.out.println("the even numbers are");
      System.out.println(result);
          
      
      
    }
  }