import java.util.*;
class EvenArray
  {
    public static void even(int a[])
    {
      System.out.println("the even numbers are");
      for(int i=0;i<a.length;i++)
        {
          if(a[i]%2==0)
          {
            System.out.println(a[i]+" ");
          }
        }
    }
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      int a[]=new int[6];
      System.out.println("enter the values");
      for(int j=0;j<a.length;j++)
        {
          a[j]=sc.nextInt();
        }
    even(a);
  }
  }