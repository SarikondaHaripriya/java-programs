class Shapes
  {
    public void area()
    {
      System.out.println("the areas of different shapes are ");
    }
    public void area(int s)
    {
      System.out.println("the area of square is"+4*s);
    }
    public void area(int l,int b)
    {
      System.out.println("the area of rectangle "+(l*b));
    }
    public void area(double r)
    {
      System.out.println("the area of the circle is "+(2*3.14*r));
    }
  }
    class Shape
      {
        public static void main(String args[])
        {
          Shapes sh=new Shapes();
          sh.area();
          sh.area(4);
          sh.area(8,6);
          sh.area(3.52);
      }
  }