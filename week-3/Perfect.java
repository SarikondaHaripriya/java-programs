import java.util.*;
class Perfect
  {
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("enter a number");
      int n=sc.nextInt();
      int temp=n;
      int i,sum=0;
      for(i=1;i<n;i++)
      {
        if(n%i==0)
        {
        sum=sum+i;
          
        }
      }
      if(temp==sum)
      {
        System.out.print("perfect number");
      }
      else{
        System.out.println("not a perfect number");
      }
      
    }
  }