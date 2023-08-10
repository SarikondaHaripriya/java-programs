import java.util.*;
class PrimeArray
  {
    public static void prime(int a[],int size)
    {
      System.out.println("the prime numbers are");
      for(int i=0;i<size;i++)
        {
          int count=0;
        for(int j=1;j<=a[i];j++)
          {
            if(a[i]%j==0)
                {
                  count=count+1;
                }
              }
            if(count==2)
            {
              System.out.println(a[i]);
            }
          }
        }
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("enter the size of the array");
      int size=sc.nextInt();
      int a[]=new int[size];
      System.out.println("enter the array elements ");
      for(int i=0;i<size;i++)
        {
          a[i]=sc.nextInt();
        }
      prime(a,size);
    }
  }