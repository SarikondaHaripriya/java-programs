//without returntype withour parameters
import java.util.*;
class Swappingmethod
  {
    public void swap()
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("enter a number");
      int a=sc.nextInt();
      System.out.println("enter b number");
      int b=sc.nextInt();
      int temp;
      System.out.println("before swapping the elements are"+a+","+b);
      temp=b;
      b=a;
      a=temp;
      System.out.println("after swapping the elements are"+a+","+b);
    }
    public static void main(String args[])
    {
      Swappingmethod s=new Swappingmethod();
      s.swap();
    }
  }