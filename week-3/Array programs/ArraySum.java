/*Array Sum: Write a program that takes an array of integers as input and calculates the sum of all the elements in the array.*/
import java.util.*;
class ArraySum
  {
    public static void sum(int a[],int size)
    {
      int sum=0;
      for (int i=0;i<size;i++)
        {
          sum=sum+a[i];          
        }
      System.out.println("the sum of the arraay is "+sum);
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
      sum(a,size);
      
      
    }
  }