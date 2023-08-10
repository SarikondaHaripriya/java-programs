import java.util.*;
class MinArray
  {
    public static void min(int a[],int size)
    {
      int min=a[0];
      for(int i=1;i<size;i++)
        {
          if(min>a[i])
          {
            min=a[i];
          }
        }
      System.out.println("the minimum element is "+min);     
    }
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("enter the size of the array");
      int size=sc.nextInt();
      int a[]=new int[size];
      System.out.println("enter the array elements");
      for(int i=0;i<size;i++)
        {
          a[i]=sc.nextInt();
        }
      min(a,size);
    }
  }