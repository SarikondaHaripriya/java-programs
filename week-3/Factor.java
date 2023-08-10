import java.util.*;
class Factor
  {
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("enter a number");
      int n=sc.nextInt();
      int i;
      System.out.println("the factors of the number are ");
      for(i=1;i<=n;i++)
        {
          if(n%i==0)
          {
            System.out.print(i+" ");
          }
        }
    }
    
  }