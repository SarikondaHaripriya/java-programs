import java.util.*;
class OddArray
  {
    public static void odd(int a[])
    {
      System.out.println("the odd numbers are:");
      for(int i=0;i<a.length;i++)
        {
          if(a[i]%2!=0)
          {
            System.out.println(a[i]+" ");
          }
        }
    }
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("enter the elements");
      int a[]=new int[10];
      for(int j=0;j<a.length;j++)
        {
          a[j]=sc.nextInt();
        }
      odd(a);
    }
  }