abstract class Shape
  {
    public void display()
    {
      System.out.println("the area of the shapes are");
    }
    abstract void area();
  }
class Rectangle extends Shape
  {
    public void area()
    {
      int len=18;
      int bre=12;
      System.out.println("the area of the rectangle is "+(len*bre));
    }
  }
class Square extends Shape
  {
    public void area()
    {
      int s=12;
      System.out.println("the area of square is "+(s*s));
    }
  }
class Circle extends Shape
  {
    public void area()
    {
      float r=28.59f;
      System.out.println("the area of the circle is "+(2*3.14*r));
    }
  }
class Triangle extends Shape
  {
    public void area()
    {
      int base=6;
      int height=8;
      System.out.println("the area of the triangle is "+(0.5*base*height));
    }
  }
class ShapeArea
  {
    public static void main(String args[])
    {
      Shape rec=new Rectangle();
      Shape sq=new Square();
      Shape c=new Circle();
      Shape t=new Triangle();
      rec.display();
      rec.area();
      sq.area();
      c.area();
      t.area();
    }
  }