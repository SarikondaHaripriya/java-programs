//without returntype with parameter
import java.util.*;
class Votermethod
  {
    public void vote(int n)
    {
      if(n>=18)
      {
        System.out.println("eligible to vote");
      }
      else{
        System.out.println("not eligible to vote");
      }
    }
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      Votermethod s=new Votermethod();
      System.out.println("enter the age");
      int n=sc.nextInt();
      s.vote(n);
      
    }
  }
