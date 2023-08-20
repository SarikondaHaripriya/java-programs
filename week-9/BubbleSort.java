import java.util.*;
class BubbleSort
  {
    public static void main(String args[])
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
      int temp=0;
      for(int i=0;i<n;i++)
        {
          for(int j=i+1;j<n;j++)
            {
              if(a[j]<a[i])
              {
                temp=a[i];
                a[i]=a[j];
                a[j]=temp;
              }
            }
        }
      System.out.println("after sorting the array elements are");
      for(int i=0;i<n;i++)
        {
          System.out.print(a[i]+" ");
        }
    }
  }