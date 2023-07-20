class Shape
  {
    public void area()
    {
      System.out.println("the areas of different shapes are");
    }
  }
class Rectangle extends Shape
  {
    public void area()
    {
      int length=14;
      int width=6;
      System.out.println("the area of the rectangle is "+(length*width));
    }
  }
class Square extends Shape
{
  public void area()
  {
    int s=8;
    System.out.println("the area of the square is "+(s*s));
  }
}
class Circle extends Shape
{
  public void area()
  {
    double r=6.2;
    System.out.println("the area of circle is "+(2*3.14*r));
  }
}
class Shape1
  {
    public static void main(String args[])
    {
      Shape shape=new Shape();
      shape.area();
      Shape rec=new Rectangle();
      rec.area();
      Shape square=new Square();
      square.area();
      Shape circle=new Circle();
      circle.area();
      
    }
  }