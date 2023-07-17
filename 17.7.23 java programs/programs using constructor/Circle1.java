//Create a class called "Circle" with an instance variable for storing the radius. Implement a constructor that takes the radius as an argument and initializes the object.
class Circle1
  {
   double radius;
    Circle1(double r)
    {
      radius=r;
    }
    public void display()
    {
      System.out.println("the radius of the circle is "+radius);
      System.out.println("the area of the circle is"+(2*3.14*radius));
    }
    public static void main(String args[])
    {
      Circle1 circle=new Circle1(5.15);
      Circle1 circle1=new Circle1(7.84);
      circle.display();
      circle1.display();
      
    }
  }