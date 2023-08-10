import java.util.*;
class Duplicate
  {
    public static void dup(int a[],int size)
    {
      System.out.println("the duplicate values are");
      for(int i=0;i<size;i++)
        {
          for(int j=i+1;j<size;j++)
            {
              if(a[i]==a[j])
              {
                System.out.println(a[i]);
              }
            }
        }
    }
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("enter the size of the array");
      int size=sc.nextInt();
      int a[]=new int[size];
      System.out.println("enter the elements in the array");
      for(int i=0;i<size;i++)
        {
          a[i]=sc.nextInt();
        }
      dup(a,size);
      
    }
  }