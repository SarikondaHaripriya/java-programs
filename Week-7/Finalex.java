class Final
  {
    final int x=10;
    public void display()
    {
      System.out.println(x);
      x=100;
      System.out.println(x);
    }
  }
class Finalex
  {
    public static void main(String args[])
    {
      Final f=new Final();
      f.display();
    }
  }