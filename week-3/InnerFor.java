import java.util.*;
class InnerFor
  {
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("enter a number");
      int n=sc.nextInt();
      int i,j;
      for(i=1;i<=n;i++)
        {
          for(j=1;j<5;j++)
            {
              System.out.println("i= "+i+"j= "+j);
            }
        }
    }
  }