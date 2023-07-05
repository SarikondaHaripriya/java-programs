import java.util.*;
class Ope
  {
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("enter a vlaue");
      int a=sc.nextInt();
      System.out.println("enter b value");
      int b=sc.nextInt();
      if(a==b)
      {
        System.out.println(a+"="+b);
      }
      else if(a<b)
      {
        System.out.println(a+"<"+b);
      }
      else{
        System.out.println(a+"<="+b);
      }
      
    }
  }