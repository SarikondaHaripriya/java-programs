import java.util.*;
class Circle
  {
    public static void main(String args[])
    {
     Scanner sc=new Scanner(System.in);
      System.out.println("enter the radius of the circle- ");
      int r=sc.nextInt();
      float Pi=3.14f;
      float circumference=2*Pi*r;
      System.out.println("circumference of the circle is "+circumference);
    }
  }