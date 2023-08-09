//without returntype without parameters
import java.util.*;
class Tablemethod
  {
    public void table()
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("enter a number");
      int n=sc.nextInt();
      for(int i=0;i<=10;i++)
        {
          int res=n*i;
          System.out.println(n+"*"+i+"="+res); 
        }           
    }
    public static void main(String args[])
    {
      Tablemethod s=new Tablemethod();
      s.table();
    }
  }