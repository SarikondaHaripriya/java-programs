import java.util.*;
class InsertionSort
  {
    public static void insertion(int a[],int n)
    {
      int i,j,key;
      for(i=1;i<n;i++)
        {
          key=a[i];
          j=i-1;
          while(j>=0 && key<=a[j])
            {
              a[j+1]=a[j];
              j=j-1;
            }
          a[j+1]=key;
        }
      System.out.println("array elements after sorting are");
      for(i=0;i<n;i++)
        {
          System.out.print(a[i]+" ");
        }
    }
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("enter the size of the array");
      int n=sc.nextInt();
      System.out.println("enter array elements");
      int a[]=new int[n];
      for(int i=0;i<n;i++)
        {
          a[i]=sc.nextInt();
        }
      System.out.println("before swapping the array elements are");
      for(int i=0;i<n;i++)
        {
          System.out.print(a[i]+" ");
        }
      System.out.println();
      insertion(a,n);
    }
  }