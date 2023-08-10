import java.util.*;
class CopyArray
  {
    public static void copy(int a[],int b[],int size)
    {
      for(int i=0;i<a.length;i++)
        {
          b[i]=a[i]; 
        }
      System.out.println("enter elements are in a ");
      for(int i=0;i<a.length;i++)
        {
          System.out.println(a[i]+" ");
        }
      System.out.println("the new array b is");
      for(int i=0;i<a.length;i++)
        {
          System.out.println(b[i]+" ");
        }
    }
    public static void main(String args[]) 
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("enter the size of the array ");
      int size=sc.nextInt();
      System.out.println("enter the elements into array a");
      int a[]=new int[size];
      int b[]=new int[size];
       for(int i=0;i<size;i++)
        {
           a[i]=sc.nextInt();        
        }
      copy(a,b,size);      
    }
  }