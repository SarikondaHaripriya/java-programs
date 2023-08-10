import java.util.*;
class Deletion1
  {
    public static void delete(int a[],int size,int pos)
    {
      for(int i=pos;i<size-1;i++)
        {
          a[i]=a[i+1];
        }
      System.out.println("after deleting the array is");
      for(int i=0;i<size-1;i++)
        {
          System.out.print(a[i]+" ");
        }
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
      System.out.println("enter the position to be deleted");
      int pos=sc.nextInt();
      System.out.println("before deleting");
      for(int i=0;i<size;i++)
        {
          System.out.print(a[i]+" ");
        }
      delete(a,size,pos);
    }
  }