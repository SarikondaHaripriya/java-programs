import java.util.*;
class MaximumOf3
  {
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("enter value of a");
      int a=sc.nextInt();
      System.out.println("enter value of b");
      int b=sc.nextInt();
      System.out.println("enter value of c");
      int c=sc.nextInt();
      if(a>b&&a>c)
      {
        System.out.println("the maximum number is "+a);
      }
      if(b>c)
      {
        System.out.println("the maximum number is "+b);
      }
       else
      {
        System.out.println("the maximum number is "+c);
}
    }
  }