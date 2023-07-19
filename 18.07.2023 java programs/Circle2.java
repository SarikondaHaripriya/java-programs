import java.util.*;
class Circle2
  {
    double radius;
    Circle2(double r)
    {
      radius=r;
    }
    public void display()
    {
      System.out.println("the radius of the circle is"+radius);
      System.out.println("the area of the circle is"+(2*3.14*radius));
    }
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("enter the number of radius of the circle");
      int count=sc.nextInt();
      Circle2 c[]=new Circle2[count];
      for(int i=0;i<c.length;i++)
        {
          System.out.println("enter"+(i+1)+" circle radius");
          System.out.println("enter the radius of the circle");
          double r=sc.nextDouble();
          c[i]=new Circle2(r);
        }
      for(int i=0;i<c.length;i++)
        {
          c[i].display();
        }
    }
  }