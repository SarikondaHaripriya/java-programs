//without returntype without parameters
import java.util.*;
class Numbering
  {
    public void check()
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("enter a number");
      int n=sc.nextInt();
      if(n>0)
      {
        System.out.println("number is positive");
      }
      else if(n<0)
      {
        System.out.println("number is negative");
      }
      else{
        System.out.println("number is zero");
      }      
    }
    public static void main(String args[])
    {
      Numbering s=new Numbering();
      s.check();
    }
  }