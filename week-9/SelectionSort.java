import java.util.*;
class SelectionSort
  {
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("enter the size of the array");
      int n=sc.nextInt();
      int a[]=new int[n];
      System.out.println("enter array elements");
      for(int i=0;i<n;i++)
        {
          a[i]=sc.nextInt();
        }
      System.out.println("before swapping the array elements are");
      for(int i=0;i<n;i++)
        {
          System.out.print(a[i]+" ");
        }
      int i,j,temp=0;
      for(i=0;i<n;i++)
        {
          int min=i;
          for(j=i+1;j<n;j++)
            {
              if(a[j]<a[min])
              {
                min=j;
              }
              temp=a[min];
              a[min]=a[i];
              a[i]=temp;
            }
        }
      System.out.println();
      System.out.println("after sorting the array elements are");
      for(i=0;i<n;i++)
        {
          System.out.print(a[i]+" ");
        }
    }
  }