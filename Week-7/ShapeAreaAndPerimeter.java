/*Shape Hierarchy
Create an abstract class called "Shape" that has the following abstract methods:
get_area(): Returns the area of the shape.
get_perimeter(): Returns the perimeter of the shape.
Create concrete classes Circle, Rectangle, and Triangle that inherit from the abstract class "Shape." Implement the required methods for each class.
Write a program to:
Create instances of Circle, Rectangle, and Triangle.
Prompt the user to enter dimensions for each shape.
Calculate and display the area and perimeter of each shape.*/
abstract class Shape
  {
    public void display()
    {
      System.out.println("the area and perimeter of the squares are ");
    }
    abstract void area();
    abstract void perimeter();
  }
class Rectangle extends Shape
{
  int len=12;
    int bre=9;
  public void area()
  {    
    System.out.println("the area of the rectangle is "+(len*bre));
  }
  public void perimeter()
  {    
    System.out.println("the perimeter of the rectangle is "+(2*(len+bre)));
  }
}
class Circle extends Shape
{
  float r=12.35f;
  public void area()
  {
    System.out.println("the area of the circle is"+(3.14*r*r));
  }
  public void perimeter()
  {
    System.out.println("the perimeter of the circle is "+(2*3.14*r));
  }  
}
class Triangle extends Shape
  {
    int base=10;
    int height=12;
    public void area()
    {
      System.out.println("the area of the triangle is "+(0.5*base*height));
    }
    public void perimeter()
    {
      System.out.println("the perimeter of the triangle is"+(base+height+height));
    }
  }
class ShapeAreaAndPerimeter
  {
    public static void main(String args[])
    {
      Shape rec=new Rectangle();
      Shape c=new Circle();
      Shape t=new Triangle();
      rec.display();
      rec.area();
      rec.perimeter();
      c.area();
      c.perimeter();
      t.area();
      t.perimeter();
    }
  }