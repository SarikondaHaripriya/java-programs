import java.util.*;
class NegativeArray
  {
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
        int a[]=new int[10];
      System.out.println("enter the array elements");
      for(int i=0;i<a.length;i++)
      {
        a[i]=sc.nextInt();
      }
      System.out.println("the negative elements are");
      for(int i=0;i<a.length;i++)
        {
          if(a[i]<0)
          {
            System.out.println(a[i]+" ");
          }
        }
    }
  }